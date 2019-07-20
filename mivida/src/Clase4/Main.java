/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase4;

/**
 *
 * @author alex
 */
public class Main {
    
    public static void main(String[] args) {
        
        
         new Vehiculo("Civic", "Honda", "2019", "Rojo");
        System.out.println(Vehiculo.getContador());
        
    }
    public void hey(){
        System.out.println("Las descripciones del vehiculo son: " );
    }
}
