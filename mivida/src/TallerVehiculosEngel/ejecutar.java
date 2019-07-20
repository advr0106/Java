/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TallerVehiculosEngel;

/**
 *
 * @author alex
 */
public class ejecutar {
    public static void main(String[] args) {
        
          nuevoCarro(new Carro("Rojo","Grande","Lambo",2002,"Deportivo"));
          nuevoAvion(new Avion("Rojo","Grande","Lambo",2002,"Deportivo"));
          nuevoBote(new Bote("Rojo","Grande","Lambo",2002,"Deportivo"));
        
        
    }
     public static void nuevoCarro(Carro carro) {
         System.out.println("Año del carro " + carro.getAño());
         System.out.println("Color del carro " + carro.getColor());
         System.out.println("Año del carro " + carro.getAño());
         System.out.println("Fabricante del carro " + carro.getFabricante());
         System.out.println("Tamaño del carro " + carro.getTamaño());
         
         carro.encender();
         carro.acelerar();
         carro.desplazar();
         carro.frenar();
         carro.apagar();
         
         
         
                 
         
        }
     
      public static void nuevoAvion(Avion avion) {
         System.out.println("Año del avion " + avion.getAño());
         System.out.println("Color del avion " + avion.getColor());
         System.out.println("Año del avion " + avion.getAño());
         System.out.println("Fabricante del avion " + avion.getFabricante());
         System.out.println("Tamaño del avion " + avion.getTamaño());
         
         avion.encender();
         avion.acelerar();
         avion.desplazar();
         avion.frenar();
         avion.apagar(); }
      
       public static void nuevoBote(Bote bote) {
         System.out.println("Año del avion " + bote.getAño());
         System.out.println("Color del avion " + bote.getColor());
         System.out.println("Año del avion " + bote.getAño());
         System.out.println("Fabricante del avion " + bote.getFabricante());
         System.out.println("Tamaño del avion " + bote.getTamaño());
         
         bote.encender();
         bote.acelerar();
         bote.desplazar();
         bote.frenar();
         bote.apagar();  }
    
}
