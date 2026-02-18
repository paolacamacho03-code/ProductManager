/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uptc.model;

/**
 *
 * @author Paola
 */
public class Product {
    
    String description;
    double price;
    String unit;
    
    public Product(String description, double price, String unit) {

        this.description = description;
        this.price = price;
        this.unit = unit;

    }

    @Override
    public String toString() {
        return "Product: " + "description=" + description + ", price=" + price + ", unit=" + unit;
    }
    
    
}
