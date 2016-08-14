/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etl.controllers;

import com.etl.db.DBService;

/**
 *
 * @author Nadeesha
 */
public class Common {

    DBService service = new DBService();

    public void insertEmployeeMappedData(String[] mappedColumns, Integer[] index) {

        service.insertEmployeeMappedTable(mappedColumns, index);
    }

    public void insertProjectMappedData(String[] mappedColumns, Integer[] index) {
        service.insertProjectMappedTable(mappedColumns, index);
    }

    public boolean login(String username, String password) {
        boolean auth = false;

        auth = service.login(username, password);

        return auth;
    }

}
