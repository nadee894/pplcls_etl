/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etl.controllers;

import com.etl.db.DBService;
import java.sql.SQLException;

/**
 *
 * @author Nadeesha
 */
public class CommonController {

    DBService service = new DBService();

    public int insertEmployeeMappedData(String[] mappedColumns, Integer[] index) throws ClassNotFoundException, SQLException {
        System.out.println("inside service class");
//        for(int i=0;i<mappedColumns.length;i++){
//            System.out.println("mappedColumn "+mappedColumns[i]);
//        }
        return service.insertEmployeeMappedTable(mappedColumns, index);
        
    }

    public int insertProjectMappedData(String[] mappedColumns, Integer[] index) throws ClassNotFoundException, SQLException {
        return service.insertProjectMappedTable(mappedColumns, index);
    }

}
