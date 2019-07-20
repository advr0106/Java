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
public class Carro implements Vehiculo{
    private String color;
    private String tamaño;
    private String fabricante;
    private int ano;
    private String clase;
    @Override
    public void desplazar() {
       acelerar();
        System.out.println("Y las llantas se mueven");
    }
    
    public Carro(){
        
    }
    public Carro(String color, String tamaño, String fabricante, int ano, String clase) {
        this.color = color;
        this.tamaño = tamaño;
        this.fabricante = fabricante;
        this.ano = ano;
        this.clase = clase;
    }

    @Override
    public void encender() {
       System.out.println("Girando la llave a la derecha");
    }

    @Override
    public void apagar() {
        System.out.println("Girando la llave a la izquierda");
    }

    @Override
    public void frenar() {
        System.out.println("Presionando el freno");
    }

    @Override
    public void acelerar() {
        System.out.println("Presionas el acelerador");
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
