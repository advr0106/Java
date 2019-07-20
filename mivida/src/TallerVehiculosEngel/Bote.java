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
public class Bote implements Vehiculo  {
    
     private String color;
   private String tamaño;
   private String fabricante;
   private int año;
   private String clase;
   
   public Bote(){
   }

    public Bote(String color, String tamaño, String fabricante, int año, String clase) {
        this.color = color;
        this.tamaño = tamaño;
        this.fabricante = fabricante;
        this.año = año;
        this.clase = clase;
    }
   

    @Override
    public void desplazar() {
        System.out.println("En el agua");
    }

    @Override
    public void encender() {
           System.out.println("Presiona la palanca hacia adelante");
    }

    @Override
    public void apagar() {
           System.out.println("Presiona la planca hacia atras");
    }

    @Override
    public void frenar() {
           System.out.println("Mueve la palanca hacia atras");
    }

    @Override
    public void acelerar() {
           System.out.println("Mueve la palanca hacia atras");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
    
    
    
}
