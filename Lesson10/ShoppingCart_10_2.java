/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10;

/**
 *
 * @author anjali
 */
public class ShoppingCart_10_2 {
    public static void main(String args[]){
        Order_10_2 order = new Order_10_2(
                "Rick Wilson", 910.00, "VA", Order_10_2.NONPROFIT);
        System.out.println("Discount is: "+ order.getDiscount());
    }
    
}
