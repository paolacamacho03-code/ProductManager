/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uptc.model;

import co.edu.uptc.pojo.Node;
import co.edu.uptc.pojo.Product;

import java.util.*;


/**
 *
 * @author Paola Andrea Camacho
 * @author Hellen Valeria Melo
 */
public class ProductsManager<T > implements List<T> {

    private Node<T> firstNode = null;

    private Node<T> createNode(T value) {

        return new Node<>(value);

    }

    //verificar que no se rompa si recibe firstNode==null
    private Node<T> returnLastNode() {

        Node<T> last = firstNode;

        while (last.nextNode != null) {

            last = last.nextNode;

        }

        return last;

    }

    @Override
    public boolean add(T product) {
        Node<T> aux = createNode(product);
        if (firstNode == null) {
            firstNode = aux;
        } else {
            Node<T> last = returnLastNode();
            last.nextNode = aux;
        }
        return true;
    }

    @Override
    public boolean remove(Object nameProduct) {
        if (!(nameProduct instanceof String)) {
            return false;
        }
        String d = (String) nameProduct;
        return advanceNodes(d);

    }

    public boolean advanceNodes(String d) {
        Node<T> before = null;
        Node<T> current = firstNode;
        boolean deleted = false;

        while (current != null) {
            if (compareDescription(current.getValue(), d)) {
                current = removeByName(before, current);
                deleted = true;
            } else {
                before = current;
                current = current.nextNode;
            }
        }
        return deleted;
    }

    public boolean compareDescription(T product, String delete) {
        return product.getDescription().toLowerCase().
                contains(delete.toLowerCase());
    }

    public Node<T> removeByName(Node<T> before, Node<T> current) {
        if (before == null) {
            firstNode = current.nextNode;
            return firstNode;

        } else {
            before.nextNode = current.nextNode;
            return before.nextNode;
        }

    }


    public List<T> showListProducts() {

        List<T> listProducts = new ArrayList<>();
        Node<T> current = firstNode;

        while (current != null) {
            listProducts.add(current.getValue());
            current = current.nextNode;
        }

        return listProducts;
    }

    public List<T> organizeListProducts() {

        List<T> listProducts = showListProducts();
        listProducts.sort(new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.getDescription().compareToIgnoreCase(o2.getDescription());
            }
        });
        return listProducts;
    }

    //itereitor
    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }


    //verificar

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public T get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public T set(int index, T element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public T remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void add(int index, T element) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
