/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estudiojava;

/**
 *
 * @author 52437
 */
public class EstudioJava {

    public static void main(String[] args) {
        Empleados trabajador1 = new Empleados("Pancho");
       Empleados trabajador2 = new Empleados("Manuel");
      
       
       System.out.println(trabajador1.devuelveDatos());
       System.out.println(trabajador2.devuelveDatos());
       
       System.out.println(Empleados.dameSiguiente());
       
    }
}
class Empleados {
    private final String nombre;  //Declaracion de variable de clases
   private String seccion;
   private int id;
    public static int idSiguiente =1;// Creamos la variable estatica que pertenece a la clasa no la instancia
    
    public Empleados (String nom){ //Constructor de clase
         
         nombre=nom;
         seccion= "Administracion";
         id = idSiguiente;
         idSiguiente++;
     }
    
    public void  cambiaSeccion(String seccion){ //metodo getter
    this.seccion= seccion;    
    
    }           

 public String devuelveDatos(){ //metodo setter
        return "El nombre" + nombre + " y el Id trabajor  es:" + id;
    }
    

 public static String dameSiguiente(){  //Los metodos estaticos no pueden acceder a las variables de clase a menos que sea estatica tambien
     
     return "El idsiguiente es: " + idSiguiente;
     
 }
         
 
}


