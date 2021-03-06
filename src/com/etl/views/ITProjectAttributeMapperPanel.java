/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etl.views;

import java.awt.List;
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

    public ITProjectAttributeMapperPanel(String data, ProjectDataExtractPanel projectDataExtractPanel) {
        initComponents();
        String[] attributes = getHeaders(data);
        this.projectDataExtractPanel = projectDataExtractPanel;

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

        cb_projectName.setSelectedIndex(0);
        cb_employeeName.setSelectedIndex(1);
        cb_woRecDate.setSelectedIndex(2);
        cb_estEndDate.setSelectedIndex(3);
        cb_projectValue.setSelectedIndex(4);
        cb_workToBeDone.setSelectedIndex(5);
        cb_description.setSelectedIndex(6);
        cb_type.setSelectedIndex(7);
        cb_workloadPlanned.setSelectedIndex(8);
        cb_workloadActual.setSelectedIndex(9);
        cb_empWrkStartDate.setSelectedIndex(10);
        cb_empWrkEstEndDate.setSelectedIndex(11);
        cb_empWrkActEndDate.setSelectedIndex(12);
        this.projectDataExtractPanel.btnNext.setEnabled(true);
    }

    public String[] getHeaders(String data) {
        String[] attributes = new String[13];

        if (!data.isEmpty()) {
            //String headers = data.get(0);
            attributes = data.split(";");
            for (int i = 0; i < attributes.length; i++) {
                attributes[i] = attributes[i].trim().replace("\"", "").replace("[", "").replace("]", "").replace("'", "");
            }
        } else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Data file is Empty!", "People Clues", JOptionPane.WARNING_MESSAGE);
        }
        return attributes;
    }

//    public Integer[] insertProjectMappedData() {
//        Integer[] mappedAttributes = new Integer[13];
//
//        int projectName = cb_projectName.getSelectedIndex();
//        int employeeName = (Integer) cb_employeeName.getSelectedIndex();
//        int woRecDate = cb_woRecDate.getSelectedIndex();
//        int estEndDate = cb_estEndDate.getSelectedIndex();
//        int projectValue = cb_projectValue.getSelectedIndex();
//        int workToBeDone = cb_workToBeDone.getSelectedIndex();
//        int description = cb_description.getSelectedIndex();
//        int type = cb_type.getSelectedIndex();
//        int workloadPlanned = cb_workloadPlanned.getSelectedIndex();
//        int workloadActual = cb_workloadActual.getSelectedIndex();
//        int empWrkStartDate = cb_empWrkStartDate.getSelectedIndex();
//        int empWrkEndDate = cb_empWrkEstEndDate.getSelectedIndex();
//        int empWrkActEndDate = cb_empWrkActEndDate.getSelectedIndex();
//
//        mappedAttributes[0] = projectName;
//        mappedAttributes[1] = employeeName;
//        mappedAttributes[2] = woRecDate;
//        mappedAttributes[3] = estEndDate;
//        mappedAttributes[4] = projectValue;
//        mappedAttributes[5] = workToBeDone;
//        mappedAttributes[6] = description;
//        mappedAttributes[7] = type;
//        mappedAttributes[8] = workloadPlanned;
//        mappedAttributes[9] = workloadActual;
//        mappedAttributes[10] = empWrkStartDate;
//        mappedAttributes[11] = empWrkEndDate;
//        mappedAttributes[12] = empWrkActEndDate;
//
//        return mappedAttributes;
//    }
    public String setHeader() {
        String[] mappedAttributes = new String[14];
        String header;

        int projectName = cb_projectName.getSelectedIndex();
        int employeeName = (Integer) cb_employeeName.getSelectedIndex();
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

        mappedAttributes[projectName] = "projectName";
        mappedAttributes[employeeName] = "employeeName";
        mappedAttributes[woRecDate] = "woRecDate";
        mappedAttributes[estEndDate] = "estEndDate";
        mappedAttributes[projectValue] = "projectValue";
        mappedAttributes[workToBeDone] = "workToBeDone";
        mappedAttributes[description] = "description";
        mappedAttributes[type] = "type";
        mappedAttributes[workloadPlanned] = "workloadPlanned";
        mappedAttributes[workloadActual] = "";
        mappedAttributes[empWrkStartDate] = "empWrkStartDate";
        mappedAttributes[empWrkEndDate] = "empWrkEndDate";
        mappedAttributes[empWrkActEndDate] = "empWrkActEndDate";

        header = mappedAttributes[1] + ";" + mappedAttributes[2] + ";" + mappedAttributes[3] + ";" + mappedAttributes[4] + ";"
                + mappedAttributes[5] + ";" + mappedAttributes[6] + ";" + mappedAttributes[7] + ";" + mappedAttributes[8] + ";"
                + mappedAttributes[9] + ";" + mappedAttributes[10] + ";" + mappedAttributes[11] + ";" + mappedAttributes[12];
        return header;
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
        cb_description = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cb_workToBeDone = new javax.swing.JComboBox<>();
        cb_projectValue = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cb_type = new javax.swing.JComboBox<>();
        cb_workloadPlanned = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cb_empWrkStartDate = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        cb_empWrkActEndDate = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cb_workloadActual = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cb_empWrkEstEndDate = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(926, 360));

        jPanel1.setPreferredSize(new java.awt.Dimension(926, 360));
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Project Name");

        cb_projectName.setToolTipText("");
        cb_projectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_projectNameActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Employee ID");

        cb_employeeName.setToolTipText("");
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

        cb_description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_descriptionActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Description");

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

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setText("Workload Planned");

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("Esti. End Date");

        cb_empWrkStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_empWrkStartDateActionPerformed(evt);
            }
        });

        jLabel38.setBackground(new java.awt.Color(0, 0, 0));
        jLabel38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel38.setText("Work Actual End Date");

        cb_empWrkActEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_empWrkActEndDateActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Project Attribute Mapper");

        cb_workloadActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_workloadActualActionPerformed(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setText("Workload Actual");

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setText("Work Start Date");

        cb_empWrkEstEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_empWrkEstEndDateActionPerformed(evt);
            }
        });

        jLabel39.setBackground(new java.awt.Color(0, 0, 0));
        jLabel39.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Type");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_woRecDate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_projectName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_employeeName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_estEndDate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_projectValue, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_empWrkStartDate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_empWrkEstEndDate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_empWrkActEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_workloadPlanned, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_description, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_workToBeDone, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cb_workloadActual, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_projectName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_workToBeDone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_employeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_description, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_woRecDate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_estEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_workloadPlanned, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_projectValue, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_workloadActual, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_empWrkActEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_empWrkStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_empWrkEstEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 953, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cb_empWrkActEndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_empWrkActEndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_empWrkActEndDateActionPerformed

    private void cb_empWrkStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_empWrkStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_empWrkStartDateActionPerformed

    private void cb_workloadPlannedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_workloadPlannedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_workloadPlannedActionPerformed

    private void cb_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_typeActionPerformed

    private void cb_projectValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_projectValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_projectValueActionPerformed

    private void cb_workToBeDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_workToBeDoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_workToBeDoneActionPerformed

    private void cb_descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_descriptionActionPerformed

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

    }//GEN-LAST:event_cb_projectNameActionPerformed

    private void cb_workloadActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_workloadActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_workloadActualActionPerformed

    private void cb_empWrkEstEndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_empWrkEstEndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_empWrkEstEndDateActionPerformed


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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
