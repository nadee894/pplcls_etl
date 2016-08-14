/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etl.controllers;

/**
 * manage word list for attribute map function
 *
 * @author Lakshan
 */
public class employeeAttributesWordBank {

    public static String[] ATTRIBUTE_LIST = {"ID","TITLE", "FNAME", "LNAME", "GENDER", "EMAIL", "AGE", "DESIGNATION", "EDUCATIONALQUALIFICATION", "CURRENTEXPERIENCE", "PREVIOUSEXPERIENCE", "ISPMPCERTIFIED"};
    public static String[] ID = {"empid", "eid", "employeeid", "idemployee", "emp_eid", "employee_id", "id", "EmployeeID"};
    public static String[] TITLE = {"title", "Title"};
    public static String[] FNAME = {"fname", "first name","first_name"};
    public static String[] LNAME = {"lname", "last name","last_name"};
    public static String[] GENDER = {"emp_gender", "gender", "male/female", "male\female", "m/f", "m\f"};
    public static String[] EMAIL = {"email", "EMAIL", "e-mail", "E-mail","mail"};
    public static String[] AGE = {"empage", "age", "emp_age", "employee_age"};
    public static String[] DESIGNATION = {"emp_title", "jobtitle", "employeetitle", "position", "level", "jobtitle", "job_title"};
    public static String[] EDUCATIONALQUALIFICATION = {"empedulavel", "emp_edulevel", "educationolLevel", "educationol_Level", "education", "qualification"};
    public static String[] CURRENTEXPERIENCE = {"currentempexperience", "emp_currentexperience", "employee_currentexperience", "currentexperience"};
    public static String[] PREVIOUSEXPERIENCE = {"previousempexperience", "emp_previousexperience", "employee_previousexperience", "previousexperience"};
    public static String[] ISPMPCERTIFIED = {"is_pmp_certified", "pmp", "is_pmp", "isPmpCertified", "isPmp"};
   

}
