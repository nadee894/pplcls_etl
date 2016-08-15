/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etl.views;

import com.etl.sound.SoundController;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author Gaya
 */
public class HadoopEtlProcessPanel extends javax.swing.JPanel implements PropertyChangeListener {

    private static HadoopCleansingPanel hadoopCleansingPanel;
    private Task task;

    /**
     * Creates new form ITEmployeeAttributeMapperPanel
     */
    public HadoopEtlProcessPanel() {
        initComponents();
    }

    public HadoopEtlProcessPanel(HadoopCleansingPanel hadoopCleansingPanel) {
        initComponents();
        HadoopEtlProcessPanel.hadoopCleansingPanel = hadoopCleansingPanel;
        Runtime run = Runtime.getRuntime();

        try {
            run.exec("cmd start /c src/com/etl/pythonScripts/PPLCLS_4_run.bat");
        } catch (IOException ex) {
            Logger.getLogger(HadoopEtlProcessPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        task = new Task();
        task.addPropertyChangeListener(this);
        task.execute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(599, 269));

        progressBar.setForeground(new java.awt.Color(51, 51, 51));
        progressBar.setIndeterminate(true);
        progressBar.setStringPainted(true);
        progressBar.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                progressBarPropertyChange(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Processing ....");

        txtOutput.setEditable(false);
        txtOutput.setBackground(new java.awt.Color(204, 204, 204));
        txtOutput.setColumns(20);
        txtOutput.setRows(5);
        jScrollPane1.setViewportView(txtOutput);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 253, Short.MAX_VALUE)))
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void progressBarPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_progressBarPropertyChange
        if ("progress" == evt.getPropertyName()) {
            int progress = (Integer) evt.getNewValue();
            progressBar.setIndeterminate(false);
            progressBar.setValue(progress);
            txtOutput.append(String.format("Process is running  %d%% .\n", progress));
        }
    }//GEN-LAST:event_progressBarPropertyChange
    public void propertyChange(PropertyChangeEvent evt) {
        if ("progress" == evt.getPropertyName()) {
            int progress = (Integer) evt.getNewValue();
            progressBar.setIndeterminate(false);
            progressBar.setValue(progress);
            txtOutput.append(String.format("Process is running  %d%%.\n", progress));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTextArea txtOutput;
    // End of variables declaration//GEN-END:variables
 public class Task extends SwingWorker<Void, Void> {

        /*
     * Main task. Executed in background thread.
         */
        @Override
        public Void doInBackground() {
            System.out.println("sdf");
            Random random = new Random();
            int progress = 0;
            // Initialize progress property.
            setProgress(0);
            // Sleep for at least one second to simulate "startup".
            try {
                Thread.sleep(1000 + random.nextInt(2000));
            } catch (InterruptedException ignore) {
            }
            while (progress < 100) {
                // Sleep for up to one second.
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException ignore) {
                }
                // Make random progress.
                progress += random.nextInt(10);
                setProgress(Math.min(progress, 100));
            }
            return null;
        }

        /*
     * Executed in event dispatch thread
         */
        public void done() {

            try {
                txtOutput.append("Done!\n");
                new SoundController().playSound("s.wav");
                HadoopEtlProcessPanel.hadoopCleansingPanel.btnNext.setEnabled(true);
            } catch (IOException ex) {
                Logger.getLogger(HadoopEtlProcessPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(HadoopEtlProcessPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(HadoopEtlProcessPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            JOptionPane.showMessageDialog(null, "Data Processing Succesfully Completed", "People Clues", 1);

        }
    }

}
