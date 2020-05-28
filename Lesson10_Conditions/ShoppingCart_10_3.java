/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson10_Conditions;

/**
 *
 * @author anjali
 */
public class ShoppingCart_10_3 {
    public static void main(String args[]){
        Order_10_3 order = new Order_10_3(
                "Rick Wilson", 910.00, "VA", Order_10_3.PRIVATE);
        System.out.println("Discount is: "+ order.getDiscount());
    }    
}
