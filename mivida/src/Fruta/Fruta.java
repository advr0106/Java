/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fruta;

/**
 *
 * @author alex
 */
public abstract class Fruta {
    private int nivelDeAzucar =0;
    public abstract void presentar();
    public void imprimirAzucar(){
        System.out.println("Soy tan dulce como: "+nivelDeAzucar+"de 10"); 
                
    }
}
