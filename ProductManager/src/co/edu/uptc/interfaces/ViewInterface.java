/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.uptc.interfaces;


/**
 *
 * @author Paola Andrea Camacho
 * @author Hellen Valeria Melo
 */

public interface ViewInterface {

    void setPresenter(PresenterInterface presenter);

    void showError(String message);

    void showMessage(String message);

    void start();

    int showMenu();

    double readDouble();

    String readString();


}