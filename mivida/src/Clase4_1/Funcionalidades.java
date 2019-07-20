/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase4_1;

/**
 *
 * @author alexv
 */
public class Funcionalidades {
    private static final int PRECIO=25; 

    public static int getPRECIO() {
        return PRECIO;
    }
    
    public Funcionalidades() {
    }
    public static int entero(int x){
        if(x>0){
            return x;
        } 
            
        return -x;
    }

    public static double doble(double x){
        if(x<0){
            return -x;
        }
        return x;
    }
    public static long potencia(int base, int exponente){
        long resultado=1;
        for(int i=0; i<exponente;i++){
            resultado*=base;
        }
        return resultado;
    }
    public static boolean fecha(int year,int month,int day){
       if (day>31 && month > 12) {
           System.out.print("Año o día erroneo");
           return false;
       } else {
           return true;
       }
    }
    public static long factor(int num){
        long result = 1;
        while(num>0){
            result*=num;
            num--;
        }
        return result;
    }
    public static boolean esPrimo(int num){
        if((num!=2)&&(num%2==0))
            return false;
        for(int i=3;i<num/2;i+=2){
            if (num%i==0){
                return false;
            }
        }
        return true;
   }
   public static double rectArea(int l1,int l2){
       return l1*l2;
   }
   public static double rectPerimetro(int l1,int l2){
       return l1*2+l2*2;
   }
   public static boolean pago(int dinero){
        return dinero >= PRECIO;
   }
   public static String saludar(String nombre)
    {
        String saludo = "Hola. Bienvenido " + nombre;

        return saludo;
    }
}
