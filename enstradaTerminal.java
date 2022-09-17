/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.estudiojava;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 52437
 */
public class enstradaTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);//El objeto escaner sirve para ingresar datos en la consolo 
       System.out.println("Escribe tu nombre:");
       String nombreUsuario = entrada.nextLine(); // Con la instancia creada y el metodo nextLine puedes introducir los datos
       System.out.println("Tu nombre es:" + nombreUsuario);
       String nombreDos = JOptionPane.showInputDialog("Escrbie tu nombre porfavor:");
       System.out.println(nombreDos);
    }
    
}
