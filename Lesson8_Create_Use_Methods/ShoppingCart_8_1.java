/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8_Create_Use_Methods;

/**
 *
 * @author anjali
 */
public class ShoppingCart_8_1 {
    public static void main(String[] args){      
        
        // Call the setColor method on item1. Print the new color value from
        //   item1 if the method returns true.  Otherwise print an "invalid color"
	//   message.
        
        Item_8_1 item1 = new Item_8_1();
        
        if (item1.setColor('M')) {
            System.out.println("Item1.color = " + item1.color);
        }
        else {
            System.out.println("Invalid color");
        }
       // Test the class, using both valid and invalid colors.     
        
    }
    
}
