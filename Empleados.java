/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiojava;

import java.util.Date;
import java.util.GregorianCalendar;




public class Empleados implements Comparable{ //Aqui se implementa la interface Comparable, recordar que se debe sobreescirbir su metodo compareTo
 
 
   private final String nombre;
   private String seccion;
   private double sueldo;
   Date altaContrato;
   public static int IdSiguiente;
   private int Id;
    
    public Empleados (String nom, double sue,int agno, int mes, int dia){
        
        nombre=nom;
        sueldo=sue;
        
        
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato= calendario.getTime();
        
        IdSiguiente++;
        Id=IdSiguiente;
        
               
    }
    
   public Empleados (String nom){
        nombre=nom;
         seccion= "Administracion";
         Id = IdSiguiente;
         IdSiguiente++;
    }
            
   public String dameNombre(){
       return nombre + "Id:"+ Id;    
   }         
   
   public double dameSueldo(){
       return sueldo;
       
   }
   
   public Date dameFechaContrato(){
       return altaContrato;
   }
   
   public void subeSueldo(double porcentaje){
       double aumento = sueldo*porcentaje/100;
       sueldo+=aumento;
   }
   
   public void  cambiaSeccion(String seccion){ //metodo getter
    this.seccion= seccion;    
   
   }  
   
   public String devuelveDatos(){ //metodo setter
        return "El nombre" + nombre + " y el Id trabajor  es:" + Id;
    }
    

 public static String dameSiguiente(){  //Los metodos estaticos no pueden acceder a las variables de clase a menos que sea estatica tambien
     
     return "El idsiguiente es: " + IdSiguiente;
     
 }
 
   @Override  //Este el metodo comare to que viene definida en la interface Comparable  (Esto lo mencionan en el video 49)
 public int compareTo(Object miObjeto){
     Empleados otroEmpleado = (Empleados) miObjeto; // Se realiza un cast de tipos, en este caso es de Objetos
     
     if(this.sueldo < otroEmpleado.sueldo){
         return -1;
     }
     if (this.sueldo > otroEmpleado.sueldo){
         return 1;
     }
     return 0;
 }
 
 
} 
