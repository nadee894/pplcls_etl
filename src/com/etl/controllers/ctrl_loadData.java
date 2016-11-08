/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etl.controllers;

import com.csvreader.CsvReader;
import com.etl.db.DBConnection;
import com.etl.db.DBConnectionTraditiona;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;

/**
 *
 * @author pathum
 */
public class ctrl_loadData {
    
    DBConnectionTraditiona db = new DBConnectionTraditiona();
    Connection con;
    Statement stmt;
    ResultSet resultSet;
    String userName;
    

    public ctrl_loadData() {
    }
    
    public int laodData(){
        
        try{
        CsvReader csvReader = new CsvReader(new FileReader(properties.DB_FILE));
        
        csvReader.readHeaders();
        con =db.getConnection();
        stmt =con.createStatement();
        
        while(csvReader.readRecord()){
            
            String ID =csvReader.get(properties.ID) == "" ? null : csvReader.get(properties.ID);
            String FNAME =csvReader.get(properties.FNAME) == "" ? null : csvReader.get(properties.FNAME);
            String LNAME =csvReader.get(properties.LNAME) == "" ? null : csvReader.get(properties.LNAME); 
            String AGE =csvReader.get(properties.AGE) == "" ? null : csvReader.get(properties.AGE);
            String JOBTITLE =csvReader.get(properties.JOBTITLE) == "" ? ""+9 : csvReader.get(properties.JOBTITLE);
            String GENDER =csvReader.get(properties.GENDER) == "" ? null : csvReader.get(properties.GENDER);
            String CIVILSTATUS =csvReader.get(properties.CIVILSTATUS) == "" ? null : csvReader.get(properties.CIVILSTATUS);
            String EMPLOYEETYPE =csvReader.get(properties.EMPLOYEETYPE) == "" ? null : csvReader.get(properties.EMPLOYEETYPE);
            String EDUCATIONOLLEVEL =csvReader.get(properties.EDUCATIONOLLEVEL) == "" ? null : csvReader.get(properties.EDUCATIONOLLEVEL);
            String PREVIOUSEXPERIENCE =csvReader.get(properties.PREVIOUSEXPERIENCE) == "" ? null : csvReader.get(properties.PREVIOUSEXPERIENCE);
            String CURRENTEXPERIENCE =csvReader.get(properties.CURRENTEXPERIENCE) == "" ? null : csvReader.get(properties.CURRENTEXPERIENCE);
            String PMPCETIFICATED =csvReader.get(properties.PMPCETIFICATED) == "" ? null : csvReader.get(properties.PMPCETIFICATED);
            String LEAVEPERMONTH =csvReader.get(properties.LEAVEPERMONTH) == "" ? null : csvReader.get(properties.LEAVEPERMONTH);
            String GRADE =csvReader.get(properties.GRADE) == "" ? null : csvReader.get(properties.GRADE);
            String WORKHOURSPERDAY =csvReader.get(properties.WORKHOURSPERDAY) == "" ? null : csvReader.get(properties.WORKHOURSPERDAY);
        
        
        
        
        
        String Quary = "INSERT INTO dim_hemployee_apparel(first_name,last_name,dim_hgender_id,age,working_experience_current,dim_hrole_id,working_experience_previous,dim_hqualifications_id,grade) VALUES ('"+FNAME+"','"+LNAME+"',"+GENDER+","+AGE+","+CURRENTEXPERIENCE+","+JOBTITLE+","+PREVIOUSEXPERIENCE+","+EDUCATIONOLLEVEL+","+GRADE+")";
            System.out.println(Quary);
        stmt.executeUpdate(Quary);
        }
        }catch(Exception er){
            System.out.println("Err : " + er);
            return 0;
        }
        
        
        return 1;
        
    }
    
    
    public void convertData(){
        
        try{
        CsvReader csvReader = new CsvReader(new FileReader("C:/Users/pathum/Desktop/RESEARCH DATA/MAPPED123.csv"));
        
        csvReader.readHeaders();
        con =db.getConnection();
        stmt =con.createStatement();
        
        while(csvReader.readRecord()){
            
            
            String JOBTITLE =csvReader.get(properties.JOBTITLE);
            String GENDER =csvReader.get(properties.GENDER);
            String EDUCATIONOLLEVEL =csvReader.get(properties.EDUCATIONOLLEVEL);
            
        
        
        
        
        
        String Quary = "SELECT id FROM dim_hrole WHERE name='"+ JOBTITLE +"'";
        String JobTitle;
        
        
          
        resultSet = stmt.executeQuery(Quary);
        while(resultSet.next()){
               
                JobTitle = resultSet.getString("id");
                
            }
        stmt.executeUpdate(Quary);
        }
        }catch(Exception er){
            System.out.println("Err : " + er);
        }
    }
    
}
