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
public class Shirt_12_1 extends Item_12_1{
    private char size;
    private char colorCode;
    
    public Shirt_12_1(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    } 
}
