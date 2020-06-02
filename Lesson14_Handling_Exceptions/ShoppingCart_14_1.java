/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson14_Handling_Exceptions;

/**
 *
 * @author anjali
 */
public class ShoppingCart_14_1 {
    public static void main(String[] args){
        Calculator_14_1 calc = new Calculator_14_1();
        int addResult = calc.add(43, 79);
        System.out.println("Add Result: "+addResult);
        
        // Handle possible ArithmeticException
        try {           
            double divResult = calc.divide(15, 0);
            System.out.println("Division Result: "+divResult);
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }        
    }
}
