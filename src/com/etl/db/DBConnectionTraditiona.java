/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etl.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pathum
 */
public class DBConnectionTraditiona {
    private static String url = "jdbc:mysql://localhost:3306/peoplecluesapperrel";    
    private static String driverName = "com.mysql.jdbc.Driver";   
    private static String username = "root";   
    private static String pasword = "";
    private static Connection con;
    
    

    

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            
                con = DriverManager.getConnection(url, username, pasword);
                
            
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println(ex +"Driver not found."); 
        } catch (SQLException ex) {
            Logger.getLogger(DBConnectionTraditiona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
    

