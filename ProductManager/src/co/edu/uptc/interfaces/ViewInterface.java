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

    public void setPresenter(PresenterInterface presenter);

    public void showError(String message);

    public void showMessage(String message);

    public void start();

    public int showMenu();

    public double readDouble();

   public String readString();


}