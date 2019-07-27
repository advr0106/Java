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
public class Unix implements SistemaOperativo{
        @Override
    public void instalar() {
        System.out.println("Instala los paquetes necesarios del sistema");
    }

    @Override
    public void procesar() {
        System.out.println("Procesa los datos necesarios del sistema");
    }

    @Override
    public void ejecutar() {
        instalar();
        System.out.println("Ejecuta las programas instaladas del sistema");
    }

    @Override
    public void interactuar() {
        System.out.println("El usuario interactua con las diversas funciones del sistema");
    }

    @Override
    public void administrar() {
        procesar();
        System.out.println("Administra los datos");
    }

    @Override
    public void almacenar() {
        instalar();
        System.out.println("Almacena la informacion instalada y procesada en el sistema que sea necesaria");
    }

     @Override
    public boolean bootear(String modo) {
        
        if (null == modo) {
            System.out.println("Debe de llenar");
        }
        else switch (modo) {
            case "Instalado":
                System.out.println("Iniciando el sistema");
                return true;
            case "Memoria":
                System.out.println("Iniciando el sistema operativo desde la memoria");
                return true;
            default:
                System.out.println("No posee sistema operativo");
                return false;
        }
        return false;
    }


    @Override
    public boolean iniciarSesion(String user, String pass) {
        if (user=="Alex" && pass=="secreto"){
            System.out.println("Iniciando sesión");
            return true;
        }
        else 
            System.out.println("Contraseña o usuario incorrectos");
            return false;
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando sesión");
    }

    @Override
    public void ejecutarComando(String comando) {
        System.out.println("Usted ejecuto el comando:" + comando);
    }

    @Override
    public void gestionarErrores(int err) {
        System.out.println("Se presento el error de código" + err);
    }

}
