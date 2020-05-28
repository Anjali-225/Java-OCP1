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
public class Conditions_10_1 {
    public static void main (String args[]){
        int x = 4, y = 9;
        if (y / x < 3) {
            x += y;
        } else {
            x *= y;
        }
        System.out.println("After if statement, x = " + x);
        
        // Use a ternary operator to perform the same logic as above.
        x = ((y / x) > 3) ? (x += y) : (x *= y);
        System.out.println("After ternary operator, x = " + x);
    }
}
