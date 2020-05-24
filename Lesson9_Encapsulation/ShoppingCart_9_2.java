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
public class ShoppingCart_9_2 {
    public static void main(String[] args) {
        
        // Declare, instaintiate and initialize a Customer object
        Customer_9_2 cust1 = new Customer_9_2("Bob Miller" , "555-44-3212");
        
        //Print the customer object name
        System.out.println("Customer name: " + cust1.getName());
    }
    
}
