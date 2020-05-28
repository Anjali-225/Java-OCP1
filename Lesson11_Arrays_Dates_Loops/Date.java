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
import java.time.*;
import java.time.chrono.JapaneseDate;

public class Date {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();      
        System.out.println("Current Date: " + myDate);
        myDate.minusMonths (15);
        System.out.println("New: " + myDate);
        
        JapaneseDate jDate = JapaneseDate.from(myDate); 
        System.out.println("Japanese Date: " + jDate);
    }
    
}
