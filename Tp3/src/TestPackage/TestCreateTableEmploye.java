/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

import ma.service.EmployeService;

/**
 *
 * @author Ismail
 */
public class TestCreateTableEmploye {
    public static void main(String[] args) {
        EmployeService es = new EmployeService();
        if (es.createTable()) {
            System.out.println("Tableu a été créé avec succès");
        }
 
    }
}
