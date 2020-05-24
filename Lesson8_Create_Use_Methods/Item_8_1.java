/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8_Create_Use_Methods;

/**
 *
 * @author anjali
 */
public class Item_8_1 {
    char color;
    
    // declare and code the setColor method
    public boolean setColor(char colorCode){
        if (colorCode == ' ') {
            return false;
        }
        else {
            this.color = colorCode;
            return true;
        }
    }    
}
