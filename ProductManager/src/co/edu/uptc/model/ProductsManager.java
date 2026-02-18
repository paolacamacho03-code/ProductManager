/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uptc.model;

/**
 *
 * @author Paola
 */
public class ProductsManager {
    
    Node firstProduct = null;
    
    private Node createNode(Product product){
        return new Node(product);
    }
    
    public void addProduct(Product product){
        Node aux = createNode(product);
        if (firstProduct == null){
            firstProduct = aux;
        } else {
            Node last = returnLastNode();
            last.nextNode = aux;
        }
    }
    
    private Node returnLastNode() {
        Node last = firstProduct;
        while (last.nextNode != null) {
            last = last.nextNode;
        }
        return last;
    }    
}
