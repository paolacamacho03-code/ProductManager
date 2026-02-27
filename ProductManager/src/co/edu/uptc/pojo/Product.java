/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uptc.pojo;

/**
 *
 * @author Paola Andrea Camacho
 * @author Hellen Valeria Melo
 */
public class Product {
    
    private String description;
    private double price;
    private String unit;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String description, double price, String unit) {

        this.description = description;
        this.price = price;
        this.unit = unit;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product: " + "description=" + description + ", price=" + price + ", unit=" + unit;
    }
}
