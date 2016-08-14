/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etl.controllers;

import com.etl.db.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Lakshan
 */
public class cntrl_login {

    DBConnection db = new DBConnection();
    Connection con;
    Statement stmt;
    ResultSet resultSet;
    String DBPassword,userName;
    public cntrl_login() {
        
       
    }
    public boolean login(String password,String userName) {
        
        try{
        con =db.getConnection();
        stmt =con.createStatement();
        resultSet = stmt.executeQuery("SELECT password FROM Login where username = '"+userName+"'");
        while(resultSet.next()){
               
               DBPassword =resultSet.getString("password");
                
            }
        }catch(Exception er){
           return false; 
        }
        
        if(password.equals(DBPassword)){
            return true;
        }else{
            return false;
        }
        
    }
    
    
    
    
}
