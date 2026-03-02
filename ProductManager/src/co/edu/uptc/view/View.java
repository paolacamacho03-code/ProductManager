/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uptc.view;

import co.edu.uptc.interfaces.PresenterInterface;
import co.edu.uptc.interfaces.ViewInterface;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Paola Andrea Camacho
 * @author Hellen Valeria Melo
 */
public class View implements ViewInterface {

    private PresenterInterface presenter;
    private Scanner input;

    public View() {
        input = new Scanner(System.in);
    }

    @Override
    public void setPresenter(PresenterInterface presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showResult(byte result) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void showError(String message) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void start() {
        MenuConsole menu = new MenuConsole();
        String title = "MENÚ PRINCIPAL";
        List<String> opts = List.of("1. Saludaaaaaaaaaaaaaaaaaaaaaaar ahora", "2. Información Técnica", "3. Salir");

        for(int opt = 0; opt != 3; opt = menu.adminMenu(opts, title)) {
        }

       }

    @Override
    public int readInt() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void showMenu() {
        MenuConsole menu = new MenuConsole();
        String title = "MENÚ PRINCIPAL";
        List<String> opts = List.of("1. Saludar ahora", "2. Información Técnica", "3. Salir");

        for (int opt = 0; opt != 3; opt = menu.adminMenu(opts, title)) {
        }
    }

}
