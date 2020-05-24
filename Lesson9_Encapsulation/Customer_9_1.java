/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9_Encapsulation;

/**
 *
 * @author anjali
 */
public class Customer_9_1 {
    
    private String name;
    private String ssn;
   
    // Encapsulate this class.  Make ssn read only.
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    
    public String getSSN(){
        return ssn;
    }
    
}
