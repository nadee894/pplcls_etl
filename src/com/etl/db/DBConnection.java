/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etl.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 *
 * @author Nadeesha
 */
public class DBConnection {

    private String url = "jdbc:mysql://localhost/pplcls";
    private String username = "root";
    private String password = "gaya";
    private static DBConnection dbCon;
    private Connection con;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(url, username, password);
    }

    private static DBConnection getDBConnection() throws ClassNotFoundException, SQLException {
        if (dbCon == null) {
            dbCon = new DBConnection();
        }
        return dbCon;
    }

    public static Connection getConnectionToDB() throws ClassNotFoundException, SQLException {
        return getDBConnection().con;
    }
}
