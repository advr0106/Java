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
public class Avion implements Vehiculo{
    private String color;
    private String tamaño;
    private String fabricante;
    private int ano;
    
    public Avion(){
        
    }

    public Avion(String color, String tamaño, String fabricante, int ano, String clase) {
        this.color = color;
        this.tamaño = tamaño;
        this.fabricante = fabricante;
        this.ano = ano;
        this.clase = clase;
    }
    private String clase;
    
        @Override
    public void desplazar() {
            acelerar();
            System.out.println("Y se mueve en los aires");
    }

    @Override
    public void encender() {
            System.out.println("Darle un boton pa' prendelo");
    }

    @Override
    public void apagar() {
            System.out.println("Darle a un boton pa' apagalo");
    }

    @Override
    public void frenar() {
            System.out.println("Mueve una palanca y sucedera la magia");
    }

    @Override
    public void acelerar() {
            System.out.println("Mueve una palanca y reducira su velocidad");
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    
}
