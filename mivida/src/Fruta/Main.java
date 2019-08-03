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
public class Main {
    public void calcular(int calcular){
    System.out.println("1");
    }
    public void calcular(long calcular){
        System.out.println("2");
    }
    public void calcular(byte calcular){
    System.out.println("3");}
    public void calcular(Integer calcular){
    System.out.println("4");}
    public void calcular(Object calcular){
    System.out.println("5");}
    
    public static void main(String[] args) {
        
        Manzana m = new Manzana();
        Fruta f = m;
        Manzana m1=(Manzana) f;
        m1.presentar();
       
       
       Main ma=new Main();
       ma.calcular(null);
       
       //Wrapper class 
       Long l; //long
       Integer i; //int
       String ss; //string
       Character ch; //char
       Byte b; //byte
       Short s; //short
       Boolean bb;//boolean
       Double d;//double
       
    } 
}