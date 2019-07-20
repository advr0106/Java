/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase5;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alex
 */
public class Persona1  implements SerVivo{
    
    //Contructores, setters y getters se crean dandole a alt + insert y se selecciona el que se desea
    private String nombre;
    private String apellido;
    private int cedula;
    private String correo;
    private int telefono;
    List<Persona1> personas=new ArrayList();

    public Persona1(String nombre, String apellido, int cedula, String correo, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
    }

    Persona1() {
       
    }

    public List<Persona1> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona1> personas) {
        this.personas = personas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public void comer() {
        System.out.println("Come con cubiertos");
    }

    @Override
    public void trasladar() {
        System.out.println("Con dos piernas");
    }

    
    public void reproducir() {
        System.out.println("La cigueña");
    }

    @Override
    public void dormir() {
        System.out.println("En una cama");
        System.out.println(ESTA_VIVO);
    }

    @Override
    public void socializar() {
        System.out.println("Con la boca");
    }

    
}
