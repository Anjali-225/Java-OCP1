/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson13_Using_Interfaces;

/**
 *
 * @author anjali
 */
public class Shirt_13_2 extends Item_13_2{
    private char size;
    
    public Shirt_13_2(double price, char size, char colorCode){
        super ("Shirt", price, colorCode);
        this.setSize(size);
    }
    
    public void display(){
        super.display();
        System.out.println("\tSize: "+getSize());
    } 

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
}
