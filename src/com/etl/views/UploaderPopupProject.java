/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etl.views;

/**
 *
 * @author Gaya
 */
import com.etl.controllers.CommonController;
import com.etl.sound.SoundController;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

public class UploaderPopupProject extends JPanel implements PropertyChangeListener {

    private JProgressBar progressBar;
    private JLabel processLabel;
    private Task task;
    public JFrame frame;
    public static BufferedReader input;
    public static ITProjectAttributeMapperPanel ITProjectAttributeMapperPanel;
    public static Main main;
    public static int length;

    private UploaderPopupProject() {
    }

    public class Task extends SwingWorker<Void, Void> {

        /*
     * Main task. Executed in background thread.
         */
        @Override
        public Void doInBackground() throws IOException, ClassNotFoundException, SQLException {
            Random random = new Random();
            int progress = 0;

            // Initialize progress property.
            setProgress(0);

            String[] dataline = new String[13];
            String line;
            CommonController common = new CommonController();
            int count = 0;
            while ((line = UploaderPopupProject.input.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    dataline[count] = "NULL";
                } else {
                    dataline[count] = line;
                }
                System.out.println(count);
                ++count;

                if (count == 13) {
                    System.out.println(count);
                    common.insertProjectMappedData(dataline, UploaderPopupProject.ITProjectAttributeMapperPanel.insertProjectMappedData());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ignore) {
                    }
                    progress += UploaderPopupProject.length / 13;
                    setProgress(progress);
                    count = 0;
                    dataline = new String[76];
                    continue;
                }

            }
            return null;
        }

        /*
     * Executed in event dispatch thread
         */
        public void done() {
            try {
                new SoundController().playSound("s.wav");
            } catch (IOException ex) {
                Logger.getLogger(UploaderPopupProject.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(UploaderPopupProject.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(UploaderPopupProject.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Uploading Succesfully Completed", "People Clues", 1);
            frame.setVisible(false);
            new ETLSelectionView(null, true, UploaderPopupProject.main).setVisible(true);

        }
    }

    public UploaderPopupProject(BufferedReader input, ITProjectAttributeMapperPanel ITProjectAttributeMapperPanel, Main main,int length) {
        super(new BorderLayout());

        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);

        // Call setStringPainted now so that the progress bar height
        // stays the same whether or not the string is shown.
        progressBar.setStringPainted(true);

        processLabel = new JLabel();
        processLabel.setText("Data Uploading ...  ");

        JPanel panel = new JPanel();
        panel.add(processLabel);
        panel.add(progressBar);

        add(panel, BorderLayout.PAGE_START);
        setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        // Instances of javax.swing.SwingWorker are not reusuable, so
        // we create new instances as needed.
        // Create and set up the window.
        UploaderPopupProject.input = input;
        UploaderPopupProject.ITProjectAttributeMapperPanel = ITProjectAttributeMapperPanel;
        UploaderPopupProject.main = main;
        UploaderPopupProject.length = length;

        frame = new JFrame("People Clues Data Uploader");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and set up the content pane.
        JComponent newContentPane = this;
        newContentPane.setOpaque(true); // content panes must be opaque
        frame.setContentPane(newContentPane);
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("src//com//etl//images//favicon.ico"));

        // Display the window.
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        progressBar.setIndeterminate(true);

        task = new Task();
        task.addPropertyChangeListener(this);
        task.execute();
    }

    /**
     * Invoked when task's progress property changes.
     */
    public void propertyChange(PropertyChangeEvent evt) {
        if ("progress" == evt.getPropertyName()) {
            int progress = (Integer) evt.getNewValue();
            progressBar.setIndeterminate(false);
            progressBar.setValue(progress);
        }
    }

    /**
     * Create the GUI and show it. As with all GUI code, this must run on the
     * event-dispatching thread.
     */
    public void createAndShowGUI(BufferedReader input, ITProjectAttributeMapperPanel ITProjectAttributeMapperPanel) {
        // Create and set up the window.
        UploaderPopupProject.input = input;
        UploaderPopupProject.ITProjectAttributeMapperPanel = ITProjectAttributeMapperPanel;

        JFrame frame = new JFrame("ProgressBarDemo2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and set up the content pane.
        JComponent newContentPane = new UploaderPopupProject();
        newContentPane.setOpaque(true); // content panes must be opaque
        frame.setContentPane(newContentPane);

        // Display the window.
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        progressBar.setIndeterminate(true);

        task = new Task();
        task.addPropertyChangeListener(this);
        task.execute();

    }

    private void center() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension dimension1 = getSize();
        int x = (dimension.width - dimension1.width) / 2;
        int y = (dimension.height - dimension1.height) / 2;
        setLocation(x, y);
    }

}
