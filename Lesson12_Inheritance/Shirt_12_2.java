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
public class Shirt_12_2 extends Item_12_2{
    private char size;
    private char colorCode;
    
    public Shirt_12_2(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }
    // Override the display method in Item to also show size and colorCode.
       // Avoid duplicating code.
    public void display(){
        super.display();
        System.out.println("\tSize: "+size);
        System.out.println("\tColor Code: "+ colorCode);
    } 
}
