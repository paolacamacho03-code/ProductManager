/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uptc.model;

import co.edu.uptc.interfaces.ModelInterface;
import co.edu.uptc.pojo.Node;
import co.edu.uptc.pojo.Product;

import java.util.*;


/**
 *
 * @author Paola Andrea Camacho
 * @author Hellen Valeria Melo
 */
public class ProductsManager<T> implements ModelInterface<T> {

    private Node<T> firstNode = null;

    private Node<T> createNode(T value) {

        return new Node<>(value);

    }

    private Node<T> returnLastNode() {


        Node<T> last = firstNode;

        while (last.getNextNode()!= null) {

            last = last.getNextNode();

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
            last.setNextNode(aux);        }
        return true;
    }


    public boolean removeNode(Object object) {
        Node<T> before = null;
        Node<T> current = firstNode;

        while (current != null) {
            if (current.getValue().equals(object)) {
                unlink(before, current);
                return true;
            }
            before = current;
            current = current.getNextNode();        }
        return false;
    }

    private void unlink(Node<T> before, Node<T> current) {
        if (before == null)
            firstNode = current.getNextNode();
        else
            before.setNextNode(current.getNextNode());
    }

    public boolean remove(Object nameProduct) {
        if (isEmpty()) return false;

        return removeNode(nameProduct);

    }


    public List<T> showListProducts() {

        List<T> listProducts = new ArrayList<>();
        Node<T> current = firstNode;

        while (current != null) {
            listProducts.add(current.getValue());
            current = current.getNextNode();
        }

        return listProducts;
    }

    @Override
    public Iterator<T> iterator() {
        return new ProductsIterator();
    }

    private class ProductsIterator implements Iterator<T> {
        private Node<T> current = firstNode;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T value = current.getValue();
            current = current.getNextNode();
            return value;
        }
    }


    @Override
    public int size() {
        int c = 0;
        Node<T> current = firstNode;
        while (current != null) {
            c++;
            current = current.getNextNode();
        }
        return c;
    }

    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }

    @Override
    public T get(int index) {
        validateIndex(index);
        return findNode(index).getValue();
    }

    private Node<T> findNode(int index) {
        Node<T> current = firstNode;
        int count = 0;
        while (count < index) {
            current = current.getNextNode();
            count++;
        }
        return current;
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public T set(int index, T element) {
        validateIndex(index);
        Node<T> node = findNode(index);
        T oldValue = node.getValue();
        node.setValue(element);
        return oldValue;
    }

    @Override
    public boolean contains(Object o) {
        Node<T> current = firstNode;
        while (current != null) {
            if (current.getValue().equals(o)) return true;
            current = current.getNextNode();
        }
        return false;
    }


    @Override
    public void clear() {
        firstNode = null;
    }


    @Override
    public Object[] toArray() {
        Object[] array = new Object[size()];
        Node<T> current = firstNode;

        int i = 0;
        while (current != null) {
            array[i++] = current.getValue();
            current = current.getNextNode();
        }
        return array;
    }

    @Override
    public <E> E[] toArray(E[] a) {
        int size = size();
        if (a.length < size) {
            a = (E[]) java.lang.reflect.Array
                    .newInstance(a.getClass().getComponentType(), size);
        }
        fillArray(a);
        return a;
    }

    private <E> void fillArray(E[] array) {
        Node<T> current = firstNode;
        int i = 0;
        while (current != null) {
            array[i++] = (E) current.getValue();
            current = current.getNextNode();
        }
        if (array.length > size()) {
            array[size()] = null;
        }
    }

    @Override
    public ListIterator<T> listIterator() {
        return showListProducts().listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return showListProducts().listIterator(index);
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

}
