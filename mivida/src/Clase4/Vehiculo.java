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
public class Vehiculo implements Cloneable{
    private static int contador;
    private String modelo;
    private String marca;
    private String year;
    private String color;

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Vehiculo.contador = contador;
    }

    public Vehiculo(String modelo, String marca, String year, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.year = year;
        this.color = color;
        contador +=1;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
