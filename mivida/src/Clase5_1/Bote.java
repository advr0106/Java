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
public class Bote implements Vehiculo{
    private String color;
    private String tamaño;
    private String fabricante;
    private int ano;
    private String clase;


    @Override
    public void desplazar() {
    
    }

    @Override
    public void encender() {
        System.out.println("Tira la soga del motor para prenderse");
    }

    @Override
    public void apagar() {
        System.out.println("Darle al boton para apagarse");
    }

    @Override
    public void frenar() {
        System.out.println("Mueve una palanca hacia atras");
    }

    @Override
    public void acelerar() {
        System.out.println("Mueves una palanca hacia adelante");
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

    public Bote(String color, String tamaño, String fabricante, int ano, String clase) {
        this.color = color;
        this.tamaño = tamaño;
        this.fabricante = fabricante;
        this.ano = ano;
        this.clase = clase;
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
