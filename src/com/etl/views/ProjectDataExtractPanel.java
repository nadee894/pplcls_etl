/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etl.views;

import com.etl.controllers.CommonController;
import com.etl.controllers.properties;
import com.etl.sound.SoundController;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Nadeesha
 */
public class ProjectDataExtractPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    String selectedFilePath, selectedFileType;
    final JFileChooser sourceFileChooser = new JFileChooser();
    Main main;
    ArrayList<String> output;
    CommonController common = new CommonController();
    ITProjectAttributeMapperPanel ITProjectAttributeMapperPanel;
    String[] mappedColumns;
    final ImageIcon icon = new ImageIcon("src//com//etl//images//loader.gif");

    public ProjectDataExtractPanel() {
        initComponents();
        btnPreviouse.setVisible(false);
        btnRawData.setVisible(false);
        //Load file types to the combo box
        for (int i = 0; i < properties.FILE_TYPES.length; i++) {
            cb_selectFileType.addItem(properties.FILE_TYPES[i]);
        }
        //Get the selected File type
        selectedFileType = cb_selectFileType.getSelectedItem().toString();

    }

    public ProjectDataExtractPanel(Main main) {
        initComponents();
        btnRawData.setVisible(false);
        this.main = main;
        this.main.btnEmployeeDataExtractionStep.setEnabled(false);
        this.main.btnProjectDataExtractionStep.setEnabled(true);
        //Load file types to the combo box
        for (int i = 0; i < properties.FILE_TYPES.length; i++) {
            cb_selectFileType.addItem(properties.FILE_TYPES[i]);
        }
        //Get the selected File type
        selectedFileType = cb_selectFileType.getSelectedItem().toString();
        lblLoader.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        projectAttributeMapper = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb_selectFileType = new javax.swing.JComboBox<>();
        tf_chooseFile = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        btnExtract = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        btnRawData = new javax.swing.JButton();
        btnPreviouse = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        lblLoader = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1568, 819));

        projectAttributeMapper.setLayout(new java.awt.CardLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(943, 695));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel3.setText("Select File");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel4.setText("Select File Type");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Choose File For Project Data Extraction ");

        cb_selectFileType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_selectFileTypeActionPerformed(evt);
            }
        });

        tf_chooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_chooseFileActionPerformed(evt);
            }
        });

        btnBrowse.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        btnExtract.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        btnExtract.setText("Extract");
        btnExtract.setEnabled(false);
        btnExtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExtractActionPerformed(evt);
            }
        });

        btnRawData.setText("View Raw Data");
        btnRawData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRawDataActionPerformed(evt);
            }
        });

        btnPreviouse.setText("Previous");
        btnPreviouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviouseActionPerformed(evt);
            }
        });

        btnNext.setText("Next");
        btnNext.setEnabled(false);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnRawData, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPreviouse, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPreviouse, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRawData, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        lblLoader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etl/images/loader.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(cb_selectFileType, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnExtract, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblLoader, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(tf_chooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 151, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_selectFileType, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_chooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(btnExtract, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblLoader, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 586, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(projectAttributeMapper, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1568, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(projectAttributeMapper, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreviouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviouseActionPerformed
        this.main.contentPanel.removeAll();
        this.main.contentPanel.add(new EmployeeDataExtractPanel(this.main), "EmployeeDataExtractPanel", 0);
        this.main.contentPanel.revalidate();
    }//GEN-LAST:event_btnPreviouseActionPerformed

    private void cb_selectFileTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_selectFileTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_selectFileTypeActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed

        selectedFileType = cb_selectFileType.getSelectedItem().toString();
        int result = sourceFileChooser.showOpenDialog(this);

        FileNameExtensionFilter fileFilter = new FileNameExtensionFilter(selectedFileType, selectedFileType);
        sourceFileChooser.setFileFilter(fileFilter);
        //Detect user click on Open or Cancel Button of JFilePicker

        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFilePath = sourceFileChooser.getSelectedFile().getAbsolutePath();
            String extension = selectedFilePath.substring(selectedFilePath.lastIndexOf(".") + 1, selectedFilePath.length());
            if (selectedFileType.equals(extension)) {
                tf_chooseFile.setText(selectedFilePath);
                btnExtract.setEnabled(true);
            } else {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "File format is invalid!", "People Clues", JOptionPane.WARNING_MESSAGE);
                tf_chooseFile.setText(properties.EMPTY);
                btnExtract.setEnabled(false);
            }

        } else if (result == JFileChooser.CANCEL_OPTION) {
            tf_chooseFile.setText(properties.EMPTY);
            btnExtract.setEnabled(false);
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnExtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExtractActionPerformed
        lblLoader.setVisible(true);
        Runtime r = Runtime.getRuntime();
        output = new ArrayList<>();
        

        try {
            Process p = r.exec("python src/com/etl/pythonScripts/ExtractProjectData.py");
            System.out.println("java " + selectedFilePath);
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = input.readLine()) != null) {
                output.add(line);

            }
            ITProjectAttributeMapperPanel = new ITProjectAttributeMapperPanel(output,this);
            this.projectAttributeMapper.removeAll();
            this.projectAttributeMapper.add(ITProjectAttributeMapperPanel, "ITProjectAttributeMapperPanel", 0);
            this.projectAttributeMapper.revalidate();

            btnRawData.setVisible(true);
            lblLoader.setVisible(false);
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_btnExtractActionPerformed

    private void btnRawDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRawDataActionPerformed
        new ProjectRawDataView(null, true).setVisible(true);
    }//GEN-LAST:event_btnRawDataActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        Toolkit.getDefaultToolkit().beep();
        int msg = JOptionPane.showConfirmDialog(null, "Are you sure? Once the data inserted to the database cannot be undone", "Confirmation!", JOptionPane.YES_NO_OPTION);
        if (msg == JOptionPane.YES_OPTION) {
            if (tf_chooseFile.getText().equals("")) {
                Toolkit.getDefaultToolkit().beep();
                JOptionPane.showMessageDialog(null, "Data file not selected!", "People Clues", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    Runtime r = Runtime.getRuntime();
                    ArrayList<String> indexedOutput = new ArrayList<>();
                    Process p = r.exec("python src/com/etl/pythonScripts/ExtractProjecteData_working.py");
                    BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
                    String line;
                    Integer count = 0;
                    JOptionPane.showMessageDialog(null, "Data Extracting... " + count, "People Clues", JOptionPane.INFORMATION_MESSAGE, icon);
                    Uploader up = new Uploader();
                    up.setVisible(true);
                    String[] dataline = new String[13];
                    int result = 0;

                    while ((line = input.readLine()) != null) {
                        line = line.trim();
                        if (line.isEmpty()) {
                            dataline[count] = "NULL";
                        } else {
                            dataline[count] = line;
                        }

                        ++count;
                        if (count == 13) {
                            result = common.insertProjectMappedData(dataline, ITProjectAttributeMapperPanel.insertProjectMappedData());
                            count = 0;
                            dataline = new String[13];
                            continue;
                        }

                    }

                    if (result != 0) {
                        try {
                            new SoundController().playSound("s.wav");
                            JOptionPane.showMessageDialog(null, "Uploading Succesfully Completed", "People Clues", 1);

                        } catch (FileNotFoundException ex) {
                            Logger.getLogger(ProjectDataExtractPanel.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (LineUnavailableException ex) {
                            Logger.getLogger(ProjectDataExtractPanel.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnsupportedAudioFileException ex) {
                            Logger.getLogger(ProjectDataExtractPanel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        up.setVisible(false);

                        new ETLSelectionView(null, true, this.main).setVisible(true);
                    }

                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ProjectDataExtractPanel.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ProjectDataExtractPanel.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void tf_chooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_chooseFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_chooseFileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnExtract;
    public javax.swing.JButton btnNext;
    private javax.swing.JButton btnPreviouse;
    private javax.swing.JButton btnRawData;
    private javax.swing.JComboBox<String> cb_selectFileType;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblLoader;
    private javax.swing.JPanel projectAttributeMapper;
    private javax.swing.JTextField tf_chooseFile;
    // End of variables declaration//GEN-END:variables
}
