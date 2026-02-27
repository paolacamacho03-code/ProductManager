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
public class Node <T> {

    public Node <T> nextNode;
    private T value;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
