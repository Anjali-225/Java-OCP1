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
public class Item_12_1 {
    private int id;
    private String desc;
    private double price;
    static int nextId = 1;
    
    public Item_12_1(){
    // set default values
        setId();
        setDesc("No description assigned.");
        setPrice(0.00);
    }
    
    public Item_12_1(String desc, double price) {
        setId();
        setDesc(desc);
        setPrice(price);
    }
    
    public void display(){
        System.out.println("Item description: "+getDesc());
        System.out.println("\tID: "+getId());
        System.out.println("\tPrice: "+getPrice());
    }

    private void setId() {
        id = Item_12_1.nextId++;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    private void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }    
}

