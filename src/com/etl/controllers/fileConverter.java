/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etl.controllers;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 *
 * @author Lakshan
 */
public class fileConverter {

    public fileConverter() {
    }
    
    public void convert(String url){
        
        String fileType= url.substring(url.lastIndexOf(properties.DOT)+1);
        
        String s;
        
        try{
            
            Process p = Runtime.getRuntime().exec(properties.EXCEC_PYTHONRULEURL_CONVERT + url+ " "+fileType );

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));

        while ((s = stdInput.readLine()) != null) {
            
            System.out.println(s);
            
        }
            
        }catch(Exception er){
            
            System.out.println("convert file to csv " + er);
            
        }
    }
    
    public String[] getHeaders(){
        String [] headers=null;
        try{
            
        CSVReader csvReader = new CSVReader(new FileReader(properties.CONVERTED_FILE));
        headers= csvReader.readNext();
       
        }catch(Exception e){
             System.out.println("Error in fileConverter - > read Header data" +e);
        }
        return headers;
    }
    
    public void writeData(){
        try{
            
            CSVWriter writer = new CSVWriter(new FileWriter("yourfile.csv"), '\t');
            String[] entries = "first#second#third".split("#");
            writer.writeNext(entries);
            writer.close();
         
        }catch(Exception er){
            System.out.println("Error in fileConverter - > write data :" +er);
        }
    }
    
    
}
