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
public class ITEmployeeAttributeMapperPanel extends javax.swing.JPanel {

    private EmployeeDataExtractPanel employeeDataExtractPanel;

    /**
     * Creates new form ITEmployeeAttributeMapperPanel
     */
    public ITEmployeeAttributeMapperPanel() {
        initComponents();
    }

    public ITEmployeeAttributeMapperPanel(String data, EmployeeDataExtractPanel employeeDataExtractPanel) {
        initComponents();
        String[] attributes = getHeaders(data);
        this.employeeDataExtractPanel = employeeDataExtractPanel;

        //Load file types to the combo box
        for (int i = 0; i < 12; i++) {
//            System.out.println(attributes[i]);
            
            cb_id.addItem(attributes[i]);
            cb_curExp.addItem(attributes[i]);
            cb_designation.addItem(attributes[i]);
            cb_eduQual.addItem(attributes[i]);
            cb_email.addItem(attributes[i]);
            cb_empGender.addItem(attributes[i]);
            cb_firstName.addItem(attributes[i]);
            cb_age.addItem(attributes[i]);
            cb_lastName.addItem(attributes[i]);
            cb_isPmp.addItem(attributes[i]);
            cb_pastExp.addItem(attributes[i]);
            cb_title.addItem(attributes[i]);
        }
        //dynamic later
        cb_id.setSelectedIndex(1);
        cb_curExp.setSelectedIndex(10);
        cb_designation.setSelectedIndex(8);
        cb_eduQual.setSelectedIndex(9);
        cb_email.setSelectedIndex(6);
        cb_empGender.setSelectedIndex(5);
        cb_firstName.setSelectedIndex(3);
        cb_age.setSelectedIndex(7);
        cb_lastName.setSelectedIndex(4);
        cb_isPmp.setSelectedIndex(0);
        cb_pastExp.setSelectedIndex(11);
        cb_title.setSelectedIndex(2);

        this.employeeDataExtractPanel.btnNext.setEnabled(true);
    }

    public String[] getHeaders(String data) {
        String[] attributes = new String[12];

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

//    public Integer[] insertEmployeeMappedData() {
//        Integer[] mappedAttributes = new Integer[12];
//
//        int id = cb_id.getSelectedIndex();
//        
//        int title = cb_title.getSelectedIndex();        
//        int first_name = cb_firstName.getSelectedIndex();
//        int last_name = cb_lastName.getSelectedIndex();
//        int emp_gender = cb_empGender.getSelectedIndex();
//        int email = cb_email.getSelectedIndex();
//        int age = cb_age.getSelectedIndex();
//        int designation = cb_designation.getSelectedIndex();
//        int educational_qualification = cb_eduQual.getSelectedIndex();
//        int working_experience_current = cb_curExp.getSelectedIndex();
//        int working_experience_previous = cb_pastExp.getSelectedIndex();
//        int is_pmp_certified = cb_isPmp.getSelectedIndex();
//
//        mappedAttributes[0] = id;
//        mappedAttributes[1] = title;
//        mappedAttributes[2] = first_name;
//        mappedAttributes[3] = last_name;
//        mappedAttributes[4] = emp_gender;
//        mappedAttributes[5] = email;
//        mappedAttributes[6] = age;
//        mappedAttributes[7] = designation;
//        mappedAttributes[8] = educational_qualification;
//        mappedAttributes[9] = working_experience_current;
//        mappedAttributes[10] = working_experience_previous;
//        mappedAttributes[11] = is_pmp_certified;
//
//        return mappedAttributes;
//    }
//    
    public String setHeader() {
        String[] mappedAttributes = new String[13];
        String header;

        int id = cb_id.getSelectedIndex();
        int title = cb_title.getSelectedIndex();
        int first_name = cb_firstName.getSelectedIndex();
        int last_name = cb_lastName.getSelectedIndex();
        int emp_gender = cb_empGender.getSelectedIndex();
        int email = cb_email.getSelectedIndex();
        int age = cb_age.getSelectedIndex();
        int designation = cb_designation.getSelectedIndex();
        int educational_qualification = cb_eduQual.getSelectedIndex();
        int working_experience_current = cb_curExp.getSelectedIndex();
        int working_experience_previous = cb_pastExp.getSelectedIndex();
        int is_pmp_certified = cb_isPmp.getSelectedIndex();
        System.out.println("id "+id);
        System.out.println("is_pmp_certified "+is_pmp_certified);
        mappedAttributes[id] = "id";
        mappedAttributes[title] = "title";
        mappedAttributes[first_name] = "first_name";
        mappedAttributes[last_name] = "last_name";
        mappedAttributes[emp_gender] = "emp_gender";
        mappedAttributes[email] = "email";
        mappedAttributes[age] = "age";
        mappedAttributes[designation] = "designation";
        mappedAttributes[educational_qualification] = "educational_qualification";
        mappedAttributes[working_experience_current] = "working_experience_current";
        mappedAttributes[working_experience_previous] = "working_experience_previous";
        mappedAttributes[is_pmp_certified] = "is_pmp_certified";

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
        cb_id = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cb_title = new javax.swing.JComboBox<>();
        cb_firstName = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cb_lastName = new javax.swing.JComboBox<>();
        cb_age = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cb_email = new javax.swing.JComboBox<>();
        cb_empGender = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cb_designation = new javax.swing.JComboBox<>();
        cb_eduQual = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cb_pastExp = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        cb_isPmp = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cb_curExp = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(926, 360));

        jPanel1.setPreferredSize(new java.awt.Dimension(926, 360));
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("ID");

        cb_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_id.setToolTipText("");
        cb_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_idActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Title");

        cb_title.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_title.setToolTipText("");
        cb_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_titleActionPerformed(evt);
            }
        });

        cb_firstName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_firstNameActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("First Name");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Last Name");

        cb_lastName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_lastNameActionPerformed(evt);
            }
        });

        cb_age.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ageActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Age");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Email");

        cb_email.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_emailActionPerformed(evt);
            }
        });

        cb_empGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_empGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_empGenderActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Emp Gender");

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("Designation");

        cb_designation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_designation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_designationActionPerformed(evt);
            }
        });

        cb_eduQual.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_eduQual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_eduQualActionPerformed(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setText("Educational Qualification");

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("Past Experience");

        cb_pastExp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_pastExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_pastExpActionPerformed(evt);
            }
        });

        jLabel38.setBackground(new java.awt.Color(0, 0, 0));
        jLabel38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel38.setText("PMP Quaified");

        cb_isPmp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_isPmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_isPmpActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Employee Attribute Mapper");

        cb_curExp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_curExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_curExpActionPerformed(evt);
            }
        });

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel23.setText("Current Experience");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_pastExp, 0, 280, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_empGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_lastName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(cb_eduQual, 0, 279, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_isPmp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_curExp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_firstName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_id, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_title, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_designation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_age, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_email, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(cb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_title, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_age, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_designation, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_eduQual, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_empGender, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_curExp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_pastExp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_isPmp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cb_isPmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_isPmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_isPmpActionPerformed

    private void cb_pastExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_pastExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_pastExpActionPerformed

    private void cb_eduQualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_eduQualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_eduQualActionPerformed

    private void cb_designationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_designationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_designationActionPerformed

    private void cb_empGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_empGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_empGenderActionPerformed

    private void cb_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_emailActionPerformed

    private void cb_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ageActionPerformed

    private void cb_lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_lastNameActionPerformed

    private void cb_firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_firstNameActionPerformed

    private void cb_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_titleActionPerformed

    private void cb_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_idActionPerformed

    }//GEN-LAST:event_cb_idActionPerformed

    private void cb_curExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_curExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_curExpActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_age;
    private javax.swing.JComboBox<String> cb_curExp;
    private javax.swing.JComboBox<String> cb_designation;
    private javax.swing.JComboBox<String> cb_eduQual;
    private javax.swing.JComboBox<String> cb_email;
    private javax.swing.JComboBox<String> cb_empGender;
    private javax.swing.JComboBox<String> cb_firstName;
    private javax.swing.JComboBox<String> cb_id;
    private javax.swing.JComboBox<String> cb_isPmp;
    private javax.swing.JComboBox<String> cb_lastName;
    private javax.swing.JComboBox<String> cb_pastExp;
    private javax.swing.JComboBox<String> cb_title;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
