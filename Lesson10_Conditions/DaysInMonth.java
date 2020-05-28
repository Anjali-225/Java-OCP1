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
public class DaysInMonth {
    
    //IF - ELSE IF - ELSE
    private static boolean isLeapYear;
    public static void main(String[] args) {
        int month = 2;
        
        if (month == 1 || month == 3 || month ==5 || month == 7 || 
                month == 8 || month == 10 || month == 12) {
            System.out.println("31 days in a month.");
        } else if (month == 2) {
            if(isLeapYear) {
                System.out.println("28 days in month.");
            } else System.out.println("29 days in a month.");
        } else if  (month == 4 || month == 6 || month == 9
                || month == 11) {
            System.out.println("30 days in a month.");
        } else {
            System.out.println("Invalid month.");
        }  
       
        //SWITCH STATEMENT
        switch (month) {
            case 1 : case 3 : case 5 : case 7 :
            case 8 : case 10 : case 12:
                System.out.println("31 days in a month.");
                break;
            case 2 :
                if (!isLeapYear) {
                    System.out.println("28 days in a month.");
                }else 
                   System.out.println("29 days in a month.");
                   break;
            case 4 : case 6 : case 9 : case 11 :
                System.out.println("30 days in a month.");
                break;
            default:
                System.out.println("Invalid Month.");                
        }
    }     
}