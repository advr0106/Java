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
public interface SistemaOperativo {
    
    void instalar();
    void procesar();
    void ejecutar();
    void interactuar();
    void administrar();
    void almacenar();
    boolean bootear(String modo);
    boolean iniciarSesion(String user, String pass);
    void cerrarSesion();
    void ejecutarComando(String comando);
    void gestionarErrores(int err);
    
}
