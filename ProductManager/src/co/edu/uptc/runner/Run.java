/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uptc.runner;

import co.edu.uptc.interfaces.ModelInterface;
import co.edu.uptc.interfaces.PresenterInterface;
import co.edu.uptc.interfaces.ViewInterface;
import co.edu.uptc.model.ProductsManager;
import co.edu.uptc.presenter.Presenter;
import co.edu.uptc.view.View;

/**
 *
 * @author Paola
 */
public class Run {
    
    PresenterInterface presenter;
    ModelInterface model;
    ViewInterface view;
    
    private void makeMVP(){
        presenter = new Presenter();
        //model = new ProductsManager();
        view = new View();
        
        presenter.setModel(model);
        presenter.setView(view);
        view.setPresenter(presenter);
    }
    
    public void start(){
        makeMVP();
    }
    
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }
}
