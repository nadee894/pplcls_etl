/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etl.controllers;

import com.etl.models.User;
import com.etl.db.DBConnection;
import com.etl.db.DBHandler;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lakshan
 */
public class LoginController {

    public LoginController() {

    }

    public User findLogIn(String text) throws SQLException, ClassNotFoundException {
        Connection con = DBConnection.getConnectionToDB();
        String query = "SELECT email,password,id from users where email='" + text + "' and status='1';";
        ResultSet res = DBHandler.getData(con, query);
        if (res != null && res.next()) {
            User logIn = new User();
            logIn.setEmail(res.getString(1));
            logIn.setPassword(res.getString(2));
            logIn.setId(res.getInt(3));
            return logIn;

        } else {
            return null;
        }
    }

}
