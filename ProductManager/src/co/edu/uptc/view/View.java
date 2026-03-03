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

    public String readString(){
        return input.nextLine();
    }

    @Override
    public void showError(String message) {
        System.out.println(message);
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void start() {
        MenuConsole menu = new MenuConsole();
        String title = "MENÚ PRINCIPAL";
        List<String> opts = List.of("1. Adicionar producto.", "2. Ver lista de productos.", "3. Ver lista de productos ordenada.", "4. ELiminar producto.", "5. Salir");

        for(int opt = 0; opt != 5; opt = menu.adminMenu(opts, title)) {
        }

       }

    @Override
    public int readInt() {
        while (!input.hasNextInt()) {
            System.out.println("Debe ingresar un número:");
            input.next(); // descarta lo inválido
        }
        int number = input.nextInt();
        input.nextLine(); // limpiar buffer
        return number;
    }
    public double readDouble(){
        return Double.parseDouble(String.valueOf(input.nextDouble()));
    }

    @Override
    public void showMenu() {
        MenuConsole menu = new MenuConsole();

        String title = "MENÚ PRINCIPAL";
        List<String> opts = List.of(
                "1. Adicionar producto.",
                "2. Ver lista de productos.",
                "3. Ver lista de productos ordenada.",
                "4. Eliminar producto.",
                "5. Salir"
        );
    }
}
