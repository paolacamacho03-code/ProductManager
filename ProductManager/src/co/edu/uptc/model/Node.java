/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uptc.model;

/**
 *
 * @author Paola
 */
public class Node {

    public Node nextNode;
    private Product value;

    public Node(Product value) {
        this.value = value;
    }

    boolean isEmpty() {
        if (value == null) {
            return true;
        }
        return false;
    }
}
