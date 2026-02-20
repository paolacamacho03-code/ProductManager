/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.uptc.interfaces;

/**
 *
 * @author Paola
 */
public interface ViewInterface {

    void setPresenter(PresenterInterface presenter);

    void showResult(byte result);

    void showError(String message);

    void start();

    public int readInt();

    public void showMenu();
}
