/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase3;//Paquete donde se encuentra la clase

import java.util.List;
import java.util.Objects;

/**
 *
 * @author alex
 */
public class CentroDeAdopcion {
    
    //Contructores, setters y getters se crean dandole a alt + insert y se selecciona el que se desea
    private String nombre;
    private String ubicacion;
    private int cantidadEmpleados;
    private String supervisor;
    private List<Perro> perros;
    
    // Constructor de esta clase
    public CentroDeAdopcion(String nombre, String ubicacion, int cantidadEmpleados, String supervisor, List perros) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.cantidadEmpleados = cantidadEmpleados;
        this.supervisor = supervisor;
        this.perros= perros;
    }
    // Contructor por default
    CentroDeAdopcion() {
        
    }
    //**************************Zona de creacion de los setters y getters*********************************************
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public List<Perro> getPerros() {
        return perros;
    }

    public void setPerros(List<Perro> perros) {
        this.perros = perros;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
    
    //***************************************Fin de la zona de creación de los setters y getters********************************************
   
    //**************************************Zona de creación de los métodos de la clase***************************************************
    
    public void adopcion(Persona1 persona, Perro perro){
        if (persona != null && perro != null){//Se valida para saber si es nulo
        perros.removeIf(Perro::isAdoptado);//Se ve si el perro deseado ya está adoptado
        perros.forEach(fil -> {//Se recorre por cada uno de los perros ya creados
            if (Objects.equals(fil.getColor(), perro.getColor()) &&//Se revisa si cumple con todas las condiciones
                Objects.equals(fil.getRaza(), perro.getRaza())&&
                Objects.equals(fil.getGenero(), perro.getGenero())) {
                perro.setAdoptado(true);//Se pone como que el perro ya está adoptado
                //Se imprimen todos los datos necesarios
                    System.out.println("Nombre : " + persona.getNombre() + " " + persona.getApellido());
                    System.out.println("Cedula : " + persona.getCedula());
                    System.out.println("Telefono : " + persona.getTelefono());
                    System.out.println("Correo : " + persona.getCorreo());
                    System.out.println("");
                    System.out.println("Datos del perro adoptado");//Se pone fil porque son los datos ya filtrados
                    System.out.println("Nombre : " + fil.getNombre());
                    System.out.println("Raza : " + fil.getRaza());
                    System.out.println("Tamaño : " + fil.getTamano());
                    System.out.println("Color : " + fil.getColor());
                    System.out.println("Tipo de pelo : " + fil.getTipoDePelo());
                    System.out.println("Genero : " + fil.getGenero());
            }
            else{//En caso de nada pasa esto
                System.out.println("Perro no disponible");
            }
        });
    }   
    }
    //**************************************Zona de creación de los métodos de la clase***************************************************
}

