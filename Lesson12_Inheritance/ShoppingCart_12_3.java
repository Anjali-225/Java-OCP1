/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson12_Inheritance;

/**
 *
 * @author anjali
 */
public class ShoppingCart_12_3 {
    public static void main(String[] args) {
         // declare and instantiate a Shirt object using an Item reference type
        Item_12_3 item = new Shirt_12_3(25.99, 'M', 'G');

        // Test for non-Shirt object type
        //  Item item = new Item();
        
        // call the display method on the object, then the getColor method
        item.display();
        if (item instanceof Shirt_12_3) {
            String color = ((Shirt_12_3) item).getColor();
            System.out.println("Color: " + color);
        }else System.out.println("Item is not a Shirt.");
    }
}
