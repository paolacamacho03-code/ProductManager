/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.uptc.interfaces;


import co.edu.uptc.pojo.Product;

import java.util.List;

/**
 *
 * @author Paola Andrea Camacho
 * @author Hellen Valeria Melo
 */
public interface ModelInterface<T extends Product> {
    boolean add(T product);

    boolean remove(Object nameProduct);

    List<T> showListProducts();

    List<T> organizeListProducts();


}