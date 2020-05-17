/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson6_Objects_Classes;

/**
 *
 * @author anjali
 */
public class ShoppingCart_6 {
    //Exercise 6-2: Modify the ShoppingCart to use Item Fields
     public static void main(String[] args) {
        // Declare and initialize 2 Item objects
        Item_6 item1, item2;
        item1 = new Item_6();
        item2 = new Item_6();
        
	// Print both item descriptions and run code
	item1.desc = "Shirt";
        item2.desc = "Pants";

	// Assign one item to another and run it again.
        item1 = item2;
        System.out.println("Item1: " + item1.desc);
        System.out.println("Item2: " + item2.desc);
    }    
    
}
