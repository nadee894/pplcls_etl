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

    public int insertEmployeeMappedTable(String[] mappedColumns, Integer[] index) throws ClassNotFoundException, SQLException {
        Connection con = DBConnection.getConnectionToDB();
        System.out.println(mappedColumns[index[2]]);
        String query = "INSERT INTO `pplcls`.`employeemappeddata`"
                + "(`id`,`title`,`first_name`,`last_name`,`emp_gender`,`email`,`age`,`designation`,`educational_qualification`,"
                + "`working_experience_current`,`working_experience_Previous`,`is_pmp_certified`)"
                + "VALUES"
                + "(" + mappedColumns[index[0]] + "," + mappedColumns[index[1]] + "," + mappedColumns[index[2]] + "," + mappedColumns[index[3]] + "," + mappedColumns[index[4]] + ","
                + mappedColumns[index[5]] + "," + mappedColumns[index[6]] + "," + mappedColumns[index[7]] + "," + mappedColumns[index[8]] + "," + mappedColumns[index[9]] + ","
                + mappedColumns[index[10]] + "," + mappedColumns[index[11]] + ")";
        System.out.println(query);
        int res = DBHandler.setData(con, query);
        return res;
    }

    public int insertProjectMappedTable(String[] mappedColumns, Integer[] index) throws ClassNotFoundException, SQLException {
        Connection con = DBConnection.getConnectionToDB();
        String query = "INSERT INTO `pplcls`.`projectmappeddata`"
                + "(`name`,`dim_hemployee_id`,`wo_received_date`,`estimated_end_date`,`project_value`,`work_to_be_done`,`description`,`type`,`workload_planned`,"
                + "`workload_actual`,`emp_wrk_start_date`,`emp_wrk_estimated_end_date`,`emp_wrk_actual_end_date`)"
                + "VALUES"
                + "('" + mappedColumns[index[0]] + "'" + "," + mappedColumns[index[1]] + "," + mappedColumns[index[2]] + "," + mappedColumns[index[3]] + "," + mappedColumns[index[4]] + ","
                + mappedColumns[index[5]] + "," + mappedColumns[index[6]] + "," + mappedColumns[index[7]] + "," + mappedColumns[index[8]] + "," + mappedColumns[index[9]] + ","
                + mappedColumns[index[10]] + "," + mappedColumns[index[11]] + "," + mappedColumns[index[12]] + ")";
        int res = DBHandler.setData(con, query);
        return res;
    }

}
