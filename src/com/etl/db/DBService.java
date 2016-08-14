/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etl.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nadeesha
 */
public class DBService {

    DBConnection db = new DBConnection();
    Connection con;
    Statement stmt;

    public boolean login(String username, String password) {

        try {
            con = db.getConnection();
            stmt = con.createStatement();
//            String sql = "select * from users where name=" + username + " and password=" + password;
            PreparedStatement pst = con.prepareStatement("Select * from users where name=? and password=?");
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean insertEmployeeMappedTable(String[] mappedColumns, Integer[] index) {

        try {
            con = db.getConnection();
            stmt = con.createStatement();
            String sql = "INSERT INTO `pplcls`.`employeemappeddata`"
                    + "(`id`,`title`,`first_name`,`last_name`,`emp_gender`,`email`,`age`,`designation`,`educational_qualification`,"
                    + "`working_experience_current`,`working_experience_Previous`,`is_pmp_certified`)"
                    + "VALUES"
                    + "(" + mappedColumns[index[0]] + "," + mappedColumns[index[1]] + "," + mappedColumns[index[2]] + "," + mappedColumns[index[3]] + "," + mappedColumns[index[4]] + ","
                    + mappedColumns[index[5]] + "," + mappedColumns[index[6]] + "," + mappedColumns[index[7]] + "," + mappedColumns[index[8]] + "," + mappedColumns[index[9]] + ","
                    + mappedColumns[index[10]] + "," + mappedColumns[index[11]] + ")";
            int result = stmt.executeUpdate(sql);
//            PreparedStatement preparedStmt = con.prepareStatement(sql);
//            preparedStmt.setString(1, "id");
//            preparedStmt.setString(2, "title");
//            preparedStmt.setString(3, "first_name");
//            preparedStmt.setString(4, "last_name");
//            preparedStmt.setString(5, "emp_gender");
//            preparedStmt.setString(6, "email");
//            preparedStmt.setString(7, "age");
//            preparedStmt.setString(8, "designation");
//            preparedStmt.setString(9, "educational_qualification");
//            preparedStmt.setString(10, "working_experience_current");
//            preparedStmt.setString(11, "working_experience_Previous");
//            preparedStmt.setString(12, "is_pmp_certified");

//            preparedStmt.executeQuery();
//            if (result == 1) {
//                JOptionPane.showMessageDialog(null, "Successfully inserted to the Database!", "Successfully", JOptionPane.INFORMATION_MESSAGE);
//                return true;
//            } else {
//                JOptionPane.showMessageDialog(null, "Error in insertion!", "Error", JOptionPane.ERROR_MESSAGE);
//                return false;
//            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean insertProjectMappedTable(String[] mappedColumns, Integer[] index) {
//        for (int i=0;i<index.length;i++){
//            System.out.println("value "+i+":"+index[i]);
//        }

        try {
            con = db.getConnection();
            stmt = con.createStatement();
            String sql = "INSERT INTO `pplcls`.`projectmappeddata`"
                    + "(`name`,`dim_hemployee_id`,`wo_received_date`,`estimated_end_date`,`project_value`,`work_to_be_done`,`description`,`type`,`workload_planned`,"
                    + "`workload_actual`,`emp_wrk_start_date`,`emp_wrk_estimated_end_date`,`emp_wrk_actual_end_date`)"
                    + "VALUES"
                    + "('" + mappedColumns[index[0]] + "'" + "," + mappedColumns[index[1]] + "," + mappedColumns[index[2]] + "," + mappedColumns[index[3]] + "," + mappedColumns[index[4]] + ","
                    + mappedColumns[index[5]] + "," + mappedColumns[index[6]] + "," + mappedColumns[index[7]] + "," + mappedColumns[index[8]] + "," + mappedColumns[index[9]] + ","
                    + mappedColumns[index[10]] + "," + mappedColumns[index[11]] + "," + mappedColumns[index[12]] + ")";
            System.out.println(sql);
            int result = stmt.executeUpdate(sql);

//            if (result == 1) {
//                JOptionPane.showMessageDialog(null, "Successfully inserted to the Database!", "Successfully", JOptionPane.INFORMATION_MESSAGE);
//                return true;
//            } else {
//                JOptionPane.showMessageDialog(null, "Error in insertion!", "Error", JOptionPane.ERROR_MESSAGE);
//                return false;
//            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

}
