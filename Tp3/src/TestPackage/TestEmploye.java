/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestPackage;

import ma.service.EmployeService;
import ma.beans.Employe;

/**
 *
 * @author Ismail
 */
public class TestEmploye {
    public static void main(String[] args) {
         EmployeService es = new EmployeService();
    
    //creation d'un employee 
         es.create(new Employe("sorhrani", "ismail"));
         es.create(new Employe("sorhrani", "med"));
         es.create(new Employe("sorhrani", "sirine"));
         
         //modification des clients
         Employe e = es.findById(3);
         e.setNom("sorhrani");
         e.setPrenom("mustapha");
         es.update(e);
         
         //supression d'une employee
         es.delete(es.findById(8));
         
         
         //afficher touts les employee
         for(Employe em : es.findAll()){
             System.out.println(em+"\n");
         }
             
       
         
    }
  
   
    
    
    
}
