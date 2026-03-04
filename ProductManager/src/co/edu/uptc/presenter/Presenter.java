/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uptc.presenter;

import co.edu.uptc.interfaces.ModelInterface;
import co.edu.uptc.interfaces.PresenterInterface;
import co.edu.uptc.interfaces.ViewInterface;
import co.edu.uptc.pojo.Product;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Paola Andrea Camacho
 * @author Hellen Valeria Melo
 */
public class Presenter implements PresenterInterface {

    private ViewInterface view;
    private ModelInterface<Product> model;

    public Presenter() {

    }

    @Override
    public void setView(ViewInterface view) {

        this.view = view;
    }

    @Override
    public void setModel(ModelInterface<Product> model) {

        this.model = model;
    }

    public void init() {
        startMenu();
    }

    private void startMenu() {
        int option;
        do {

            option = view.showMenu();
            switch (option) {
              case 1 -> addProduct();
                case 2 -> showListProducts();
                case 3 -> showOrderedList();
                case 4 -> deleteProduct();
                case 5 -> view.showMessage("Cerrando programa");
                default -> view.showError("Opcion invalida");

            }
        } while (option != 5);
    }
    private void addProduct() {
        view.showMessage("Ingrese la descripción del producto que desea agregar :");
        String description = view.readString();
        view.showMessage("Ingrese el precio del producto: ");
        double price = view.readDouble();
        view.showMessage("Ingrese la unidad de medida del producto: ");
        String unit = view.readString();
        Product newProduct = new Product(description, price, unit);
        boolean added = model.add(newProduct);
        if (added) {
            view.showMessage("Producto agregado correctamente");
        } else {
            view.showError("Error al agregar producto");
        }
    }

    private void showListProducts() {
        if (model.isEmpty()) {
            view.showError("No hay productos registrados");
            return;
        }

        for (Product p : model) {
            view.showMessage(p.toString());
        }
    }

    public void showOrderedList() {
        if (model.isEmpty()) {
            view.showError("No hay productos registrados");
            return;
        } List<Product> ordered=new ArrayList<>();
        for (Product p: model){
            ordered.add(p);
        }
            ordered.sort((p1, p2) -> p1.getDescription().compareToIgnoreCase(p2.getDescription()));
            for (Product product : ordered) {
                view.showMessage(product.toString());
            }


    }

    public void deleteProduct() {
        if (model.isEmpty()) {
            view.showError("No hay productos registrados");
            return;
        } else {
            view.showMessage("Ingrese el nombre del elemento que desea eliminar");
            String delete = view.readString().toLowerCase();
            List<Product> deleteProduct = new ArrayList<>();
            for (Product p : model) {
                if (p.getDescription().toLowerCase().contains(delete)) deleteProduct.add(p);

            }
            for (Product product : deleteProduct) model.remove(product);
            view.showMessage("Proceso completado con exito");
        }
    }
}