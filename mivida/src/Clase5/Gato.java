/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase5;

/**
 *
 * @author alex
 */
public class Gato implements SerVivo{
    private String nombre;
    private String color;
    private double tamano;
    private String raza;
    private String tipoDePelo;
    private boolean adoptado;
    private char genero;

    public Gato(String nombre, String color, double tamano, String raza, String tipoDePelo, boolean adoptado, char genero) {
        this.nombre = nombre;
        this.color = color;
        this.tamano = tamano;
        this.raza = raza;
        this.tipoDePelo = tipoDePelo;
        this.adoptado = adoptado;
        this.genero = genero;
    }

    Gato() {
      
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public boolean getAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipoDePelo() {
        return tipoDePelo;
    }

    public void setTipoDePelo(String tipoDePelo) {
        this.tipoDePelo = tipoDePelo;
    }

    @Override
    public void comer() {
        System.out.println("El gato come por la boca");
    }

    @Override
    public void trasladar() {
        System.out.println("Se mueve en cuatro patas");
    }

    @Override
    public void reproducir() {
        System.out.println("Teniendo el celo");
    }

    @Override
    public void dormir() {
        System.out.println("Duerme en el piso");
    }

    @Override
    public void socializar() {
        System.out.println("El gato socializa maullando");
    }
    
}
