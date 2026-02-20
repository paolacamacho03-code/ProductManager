/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uptc.presenter;

import co.edu.uptc.interfaces.ModelInterface;
import co.edu.uptc.interfaces.PresenterInterface;
import co.edu.uptc.interfaces.ViewInterface;
import co.edu.uptc.model.Product;
import co.edu.uptc.model.ProductsManager;
import java.util.List;

/**
 *
 * @author Paola
 */
public class Presenter implements PresenterInterface {

    private ViewInterface view;
    private ModelInterface model;
    private ProductsManager<Product> manager;

    public void mainPresenter(ViewInterface view, ModelInterface model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void setView(ViewInterface view) {
        this.view = view;
    }

    @Override
    public void setModel(ModelInterface model) {
        this.model = model;
    }

    public void init() {
        startMenu();
    }

    private void startMenu() {
        int option = view.readInt();

        while (option != 5) {

            view.showMenu();

            switch (option) {
                case 1:
                    addProduct();
                    break;

                case 2:
                    showListProducts();
                    break;

                case 3:

                    break;

                case 4:
                    deleteProduct();
                    break;

            }
        }
    }

    private void addProduct() {
        //String description = view.readInfo();
        //double price = view.readDouble();
        //String unit = view.readInfo();
        //Product newProduct = new Product(descripcion, price, unit);
        //boolean added = manager.add(newProduct);
//        if (added) {
//            view.showMessage("Producto agregado correctamente");
//        } else {
//            view.showMessage("Error al agregar producto");
//        }
    }

    private void showListProducts() {
        List<Product> products = manager.showListProducts();

        if (products.isEmpty()) {
            //view.showMessage("No hay productos registrados");
            return;
        } 
        for(Product p : products){
            //view.showMessage(p); o showList() según esté en el View
        }
    }

    private void deleteProduct() {
        //String nameProduct = view.readInfo();
        //boolean deleted = manager.remove(nameProduct);
//        if (deleted) {
//            view.showMessage("Producto(s) eliminado(s) correctamente");
//        } else {
//            view.showMessage("No se encontraron productos con ese nombre");
//        }
    }
}
