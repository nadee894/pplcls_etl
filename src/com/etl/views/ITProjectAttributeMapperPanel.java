/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etl.views;

import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gaya
 */
public class ITProjectAttributeMapperPanel extends javax.swing.JPanel {

    private ProjectDataExtractPanel projectDataExtractPanel;
    /**
     * Creates new form ITEmployeeAttributeMapperPanel
     */
    public ITProjectAttributeMapperPanel() {
        initComponents();
    }

    public ITProjectAttributeMapperPanel(ArrayList<String> data, ProjectDataExtractPanel projectDataExtractPanel) {
        initComponents();
        this.projectDataExtractPanel = projectDataExtractPanel;
        String[] attributes = getHeaders(data);
        for (int i = 0; i < attributes.length; i++) {

        }

        //Load file types to the combo box
        for (int i = 0; i < 13; i++) {
            cb_projectName.addItem(attributes[i]);
            cb_employeeName.addItem(attributes[i]);
            cb_woRecDate.addItem(attributes[i]);
            cb_estEndDate.addItem(attributes[i]);
            cb_projectValue.addItem(attributes[i]);
            cb_workToBeDone.addItem(attributes[i]);
            cb_description.addItem(attributes[i]);
            cb_type.addItem(attributes[i]);
            cb_workloadPlanned.addItem(attributes[i]);
            cb_workloadActual.addItem(attributes[i]);
            cb_empWrkStartDate.addItem(attributes[i]);
            cb_empWrkEstEndDate.addItem(attributes[i]);
            cb_empWrkActEndDate.addItem(attributes[i]);

        }
        
        this.projectDataExtractPanel.btnNext.setEnabled(true);
    }

    public String[] getHeaders(ArrayList<String> data) {

        String[] attributes = new String[13];

        if (data.size() != 0) {
            String headers = data.get(0);
            attributes = headers.split(";");
            for (int i = 0; i < attributes.length; i++) {
                //cleansing of header attributes
                attributes[i] = attributes[i].replace("\"", "");
                attributes[i] = attributes[i].replace("\'", "");
                attributes[i] = attributes[i].replace("[", "");
                attributes[i] = attributes[i].replace("]", "");
               

            }


        } else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Data file is Empty!", "People Clues", JOptionPane.WARNING_MESSAGE);
        }
        return attributes;

    }

    public Integer[] insertProjectMappedData() {
        Integer[] mappedAttributes = new Integer[13];
     
        int projectName = cb_projectName.getSelectedIndex();
        int employeeName = (Integer)cb_employeeName.getSelectedIndex();
        int woRecDate = cb_woRecDate.getSelectedIndex();
        int estEndDate = cb_estEndDate.getSelectedIndex();
        int projectValue = cb_projectValue.getSelectedIndex();
        int workToBeDone = cb_workToBeDone.getSelectedIndex();
        int description = cb_description.getSelectedIndex();
        int type = cb_type.getSelectedIndex();
        int workloadPlanned = cb_workloadPlanned.getSelectedIndex();        
        int workloadActual = cb_workloadActual.getSelectedIndex();
        int empWrkStartDate = cb_empWrkStartDate.getSelectedIndex();
        int empWrkEndDate = cb_empWrkEstEndDate.getSelectedIndex();
        int empWrkActEndDate = cb_empWrkActEndDate.getSelectedIndex();

        mappedAttributes[0] = projectName;
        mappedAttributes[1] = employeeName;
        mappedAttributes[2] = woRecDate;
        mappedAttributes[3] = estEndDate;
        mappedAttributes[4] = projectValue;
        mappedAttributes[5] = workToBeDone;
        mappedAttributes[6] = description;
        mappedAttributes[7] = type;
        mappedAttributes[8] = workloadPlanned;
        mappedAttributes[9] = workloadActual;
        mappedAttributes[10] = empWrkStartDate;
        mappedAttributes[11] = empWrkEndDate;
        mappedAttributes[12] = empWrkActEndDate;

        return mappedAttributes;
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
        jLabel4 = new javax.swing.JLabel();
        cb_projectName = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cb_employeeName = new javax.swing.JComboBox<>();
        cb_woRecDate = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cb_estEndDate = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cb_workToBeDone = new javax.swing.JComboBox<>();
        cb_projectValue = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cb_description = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        cb_type = new javax.swing.JComboBox<>();
        cb_workloadPlanned = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cb_workloadActual = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        cb_empWrkStartDate = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        cb_empWrkEstEndDate = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        cb_empWrkActEndDate = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(599, 269));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Project Name");

        cb_projectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_projectNameActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Employee ID");

        cb_employeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_employeeNameActionPerformed(evt);
            }
        });

        cb_woRecDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_woRecDateActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("WO Rec. Date");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Est. end Date");

        cb_estEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_estEndDateActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Work to be done");

        cb_workToBeDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_workToBeDoneActionPerformed(evt);
            }
        });

        cb_projectValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_projectValueActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Project Value");

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Description");

        cb_description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_descriptionActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Type");

        cb_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_typeActionPerformed(evt);
            }
        });

        cb_workloadPlanned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_workloadPlannedActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Workload Planned");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Workload Actual");

        cb_workloadActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_workloadActualActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Employee work start Date");

        cb_empWrkStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_empWrkStartDateActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Employee work estimated end Date");

        cb_empWrkEstEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_empWrkEstEndDateActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("Employee work actual end Date");

        cb_empWrkActEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_empWrkActEndDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_woRecDate, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_estEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_projectName, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cb_projectValue, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_workloadActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_description, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_workToBeDone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_type, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_workloadPlanned, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_empWrkEstEndDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_empWrkStartDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49)
                .addComponent(cb_empWrkActEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cb_projectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(cb_workToBeDone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cb_employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cb_woRecDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cb_estEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cb_projectValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cb_description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cb_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(cb_workloadPlanned, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cb_workloadActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_empWrkActEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(cb_empWrkStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cb_empWrkEstEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(169, Short.MAX_VALUE))
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

    private void cb_empWrkEstEndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_empWrkEstEndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_empWrkEstEndDateActionPerformed

    private void cb_empWrkStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_empWrkStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_empWrkStartDateActionPerformed

    private void cb_workloadActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_workloadActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_workloadActualActionPerformed

    private void cb_workloadPlannedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_workloadPlannedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_workloadPlannedActionPerformed

    private void cb_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_typeActionPerformed

    private void cb_descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_descriptionActionPerformed

    private void cb_projectValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_projectValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_projectValueActionPerformed

    private void cb_workToBeDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_workToBeDoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_workToBeDoneActionPerformed

    private void cb_estEndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_estEndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_estEndDateActionPerformed

    private void cb_woRecDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_woRecDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_woRecDateActionPerformed

    private void cb_employeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_employeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_employeeNameActionPerformed

    private void cb_projectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_projectNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_projectNameActionPerformed

    private void cb_empWrkActEndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_empWrkActEndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_empWrkActEndDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_description;
    private javax.swing.JComboBox<String> cb_empWrkActEndDate;
    private javax.swing.JComboBox<String> cb_empWrkEstEndDate;
    private javax.swing.JComboBox<String> cb_empWrkStartDate;
    private javax.swing.JComboBox<String> cb_employeeName;
    private javax.swing.JComboBox<String> cb_estEndDate;
    private javax.swing.JComboBox<String> cb_projectName;
    private javax.swing.JComboBox<String> cb_projectValue;
    private javax.swing.JComboBox<String> cb_type;
    private javax.swing.JComboBox<String> cb_woRecDate;
    private javax.swing.JComboBox<String> cb_workToBeDone;
    private javax.swing.JComboBox<String> cb_workloadActual;
    private javax.swing.JComboBox<String> cb_workloadPlanned;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
