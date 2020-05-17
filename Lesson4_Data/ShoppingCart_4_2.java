/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4_Data;

/**
 *
 * @author anjali
 */
public class ShoppingCart_4_2 {
    //Exercise 4-2: Using and Manipulating Numbers
     public static void main(String[] args) {
        //Declaring and Initializing
        String custName = "Abcd zyx";
        String itemDesc = "Shirt";
        String  message = custName + " want to buy a " + itemDesc;
        
        //Declare and initialize Numerical values
        double price = 12.01;
        double tax = 2.10;
        int nrItems = 3;
        double total;
        
        //Modify message
         message = custName + " want to buy a " + nrItems + " " + itemDesc;
             
        // Print
        System.out.println(message);
        
        //Calculate the Total
        total = nrItems * price * tax;
        
        System.out.println("Total cost with tax: " + total);
    }
    
}
