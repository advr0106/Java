/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase5_1;

/**
 *
 * @author alex
 */
public class Main {
    public static void main(String[] args) {
      
        nuevoCarro(new Carro("Negro","Grande","Nissan",2001,"Deportivo"));
        nuevoAvion(new Avion("Blanco", "Pequeño", "Boing", 2010, "Extravagante"));
        nuevoBote(new Bote("Rojo", "Pequeno", "Tu casa", 31, "Primera"));
        
        
    }
    public static void nuevoCarro(Carro carro){
        System.out.println("Año:"+carro.getAno());
        System.out.println("Color: "+carro.getColor());
        System.out.println("Fabricante: "+carro.getFabricante());
        System.out.println("Clase: "+carro.getClase());
        System.out.println("Tamaño: "+carro.getTamaño()+"\n");
        
        
        System.out.println("Comportamiento:");
        carro.encender();
        carro.acelerar();
        carro.desplazar();
        carro.frenar();
        carro.apagar();
        
    }
    public static void nuevoAvion(Avion avion){
        System.out.println("Año:"+avion.getAno());
        System.out.println("Color: "+avion.getColor());
        System.out.println("Fabricante: "+avion.getFabricante());
        System.out.println("Clase: "+avion.getClase());
        System.out.println("Tamaño: "+avion.getTamaño()+"\n");
        
        System.out.println("Comportamiento:");
        avion.encender();
        avion.acelerar();
        avion.desplazar();
        avion.frenar();
        avion.apagar();
        
    }
    public static void nuevoBote(Bote bote){
        System.out.println("Año:"+bote.getAno());
        System.out.println("Color: "+bote.getColor());
        System.out.println("Fabricante: "+bote.getFabricante());
        System.out.println("Clase: "+bote.getClase());
        System.out.println("Tamaño: "+bote.getTamaño()+"\n");
        
        System.out.println("Comportamiento:");
        bote.encender();
        bote.acelerar();
        bote.desplazar();
        bote.frenar();
        bote.apagar();
        
    }
    /*public static void nuevoVehiculo(Vehiculo vehiculo){
        System.out.println("Año:"+vehiculo);
        /*System.out.println("Color: "+vehiculo.getColor());
        System.out.println("Año:"+vehiculo.getAno());
        System.out.println("Color: "+vehiculo.getColor());
        System.out.println("Fabricante: "+vehiculo.getFabricante());
        System.out.println("Clase: "+vehiculo.getClase());
        System.out.println("Tamaño: "+vehiculo.getTamaño());
       
        System.out.println("Comportamiento:");
        vehiculo.encender();
        vehiculo.acelerar();
        vehiculo.desplazar();
        vehiculo.frenar();
        vehiculo.apagar();
        
    }*/
}
