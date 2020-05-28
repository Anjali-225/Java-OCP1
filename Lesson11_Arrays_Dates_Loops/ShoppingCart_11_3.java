/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson11_Arrays_Dates_Loops;

/**
 *
 * @author anjali
 */
public class ShoppingCart_11_3 {
    
    Item_11_3[] items = {new Item_11_3("Shirt",25.60), 
                    new Item_11_3("WristBand",1.00), 
                    new Item_11_3("Pants",35.99)};
    
    public static void main(String[] args){   
        ShoppingCart_11_3 cart = new ShoppingCart_11_3();
        cart.displayTotal();
    }
    
    public void displayTotal(){
        double total = 0;
        for(int idx = 0; idx < items.length; idx++){
            if(items[idx].isBackOrdered()) 
		continue;
            total += items[idx].getPrice();
        }
        System.out.println("Shopping Cart total: "+total);
    }
    
}
