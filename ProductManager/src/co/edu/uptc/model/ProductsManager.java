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


    public boolean removeNode(Object object) {
        Node<T> before = null;
        Node<T> current = firstNode;

        while (current != null) {
            if (current.getValue().equals(object)) {
                unlink(before, current);
                return true;
            }
            before = current;
            current = current.nextNode;
        }
        return false;
    }

    private void unlink(Node<T> before, Node<T> current) {
        if (before == null) firstNode = current.nextNode;
        else before.nextNode = current.nextNode;
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
            current = current.nextNode;
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
            current = current.nextNode;
            return value;
        }
    }


    @Override
    public int size() {
        int c = 0;
        Node<T> current = firstNode;
        while (current != null) {
            c++;
            current = current.nextNode;
        }
        return c;
    }

    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }

    @Override
    public T get(int index) {
        if (index >= 0) {
            Node<T> current = firstNode;
            int count = 0;
            while (current != null) {
                if (count == index) return current.getValue();
                else {
                    current = current.nextNode;
                    count++;
                }
            }

        }
        throw new IndexOutOfBoundsException();

    }

    @Override
    public T set(int index, T element) {
        if (index >= 0) {
            Node<T> current = firstNode;
            int count = 0;

            while (current != null) {
                if (count == index) {
                    T oldValue = current.getValue();
                    current.setValue(element);
                   return oldValue;
                }
                count++;
                current=current.nextNode;
            }

        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public boolean contains(Object o) {
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
        Object[] array = new Object[size()];
        Node<T> current = firstNode;
        int index = 0;

        while (current != null) {
            array[index++] = current.getValue();
            current = current.nextNode;
        }

        return array;
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
        return new ProductsListIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    private class ProductsListIterator implements ListIterator<T> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size();
        }

        @Override
        public T next() {
            return get(currentIndex++);
        }

        @Override
        public boolean hasPrevious() {
            return currentIndex > 0;
        }

        @Override
        public T previous() {
            return get(--currentIndex);
        }

        @Override
        public int nextIndex() {
            return currentIndex;
        }

        @Override
        public int previousIndex() {
            return currentIndex - 1;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(T e) {
            ProductsManager.this.set(currentIndex - 1, e);
        }

        @Override
        public void add(T e) {
            throw new UnsupportedOperationException();
        }
    }
}
