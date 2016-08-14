/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etl.controllers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Lakshan
 */
public class ctrl_clencedData {

    public ctrl_clencedData() {
    }
    
    public boolean clenced(boolean rmvInvalidEntry,boolean roundNumbers,boolean rmvDublicates,boolean removeNull,boolean sortData,String fileName){
     String invalidEntry="F",round="F",dublicate="F",rmvnull="F",sortDataSet="F",rules,s;
        if(rmvInvalidEntry){
            invalidEntry="T";
        }if(roundNumbers){
            round="T";
        }if(rmvDublicates){
            dublicate="T";
        }if(removeNull){
            rmvnull="T";
        }if(sortData){
            sortDataSet="T";
        }
        
        rules=invalidEntry+","+round+","+dublicate+","+rmvnull+","+sortDataSet;
        
        try{
            
            Process p = Runtime.getRuntime().exec(properties.EXCEC_PYTHONRULEURL_CLENCED +fileName+" "+rules);

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

        while ((s = stdInput.readLine()) != null) {
            
            System.out.println(s);
            
        }
        while ((s = stdError.readLine()) != null) {
            
            System.out.println(s);
            
        }
        }catch(Exception er  ){
            System.out.println(er);
            return false;
        }
        
        return true;
    }
    
    
}
