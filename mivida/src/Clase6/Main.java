/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase6;

/**
 *
 * @author alex
 */
public class Main {
    public static void main(String[] args) {
    SistemaOperativo mipc = new Windows();
    mipc.bootear("Instalado");
    System.out.println(mipc.iniciarSesion("Hola", "amen"));
    System.out.println(mipc.iniciarSesion("Alex", "secreto"));
    mipc.gestionarErrores(223);
    mipc.cerrarSesion();
    }
    
}
