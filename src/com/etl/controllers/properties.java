/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etl.controllers;


/**
 *
 * @author Lakshan
 */
public class properties {

    public properties() {
        
    }
    
    public static String [] HEADERS;
    public static String ID ="ID";
    public static String FNAME ="FNAME";
    public static String LNAME ="LNAME";
    public static String CIVILSTATUS ="CIVILSTATUS";
    public static String EDUCATIONOLLEVEL ="EDUCATIONOLLEVEL";
    public static String CROSSFUNCTIONALTRAINING ="CROSSFUNCTIONALTRAINING";
    public static String CURRENTEXPERIENCE ="CURRENTEXPERIENCE";
    public static String PREVIOUSEXPERIENCE ="PREVIOUSEXPERIENCE";
    public static String PMPCETIFICATED ="PMPCETIFICATED";
    public static String GRADE ="GRADE";
    public static String GENDER ="GENDER";
    public static String JOBTITLE ="JOBTITLE";
    public static String LEAVEPERMONTH ="LEAVEPERMONTH";
    public static String EMPLOYEETYPE ="EMPLOYEETYPE";
    public static String AGE ="AGE";
    public static String TRAINING ="TRAINING";
    public static String WORKHOURSPERDAY ="WORKHOURSPERDAY";
    public static String PREFERSHIFT ="PREFERSHIFT";
    public static String SALARY ="SALARY";
    
    
    public static String [] FILE_TYPES= {"csv","xml","json","xlsx"};
    public static String CSV ="csv";
    public static String xml ="xml";
    public static String XL ="xl";
    public static String TEXT ="text";
    public static String PICKLE ="pickle";
    public static String DOT =".";
    
    public static final String EMPTY =" ";
    public static final boolean TRUE=true;
    public static final boolean FALSE=false;
    public static final String NULL=null;
    
    public static String INDUSTRY_APPAREL ="Apparal";
    public static String INDUSTRY_IT ="IT";
    
    
    public static final String RULE_REMOVEINVALID ="removeInvalid";
    public static final String RULE_REMOVEDUBLICATE ="removeDublicate";
    public static final String RULE_CONVERTVALUE ="convert";
    public static final String RULE_STANDERDIZATION ="Standardizealues";
    public static final String RULE_REMOVENULL ="removeNull";
    
    public static final String EXCEC_PYTHONRULEURL_EXTRACT ="python src/com/peopleclues/python/ETL_1.py ";
    public static final String EXCEC_PYTHONRULEURL_CONVERT ="python src/python/python_clencedData.py ";
    public static final String CONVERTED_FILE ="C:/Users/Lakshan/Desktop/RESEARCH DATA/TYPECONVERTED.csv";
    public static final String DB_FILE ="C:/Users/Lakshan/Desktop/RESEARCH DATA/MAPPED";
    public static final String EXCEC_PYTHONRULEURL_CLENCED ="python src/python/python_clencedData.py ";
    
    public static String [] USER_HEADERS;
}
