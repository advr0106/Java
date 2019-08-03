/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase6_1_2;

import Clase6_1.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author alexv
 */
public class Main {

    public static void main(String[] args) {

        Cliente c = new Cliente();
        c.tarjetas = new ArrayList();

        c.setClienteId(20);
        c.setApellido("Valenzuela");
        c.setPrimerNombre("Alex");
        c.setFechaNacimiento(29);

        c.getTarjetas().add(new TarjetasCredito());
        c.getTarjetas().add(new TarjetasDebito());

        System.out.println(c.getClienteId());
        System.out.println(c.getPrimerNombre());
        System.out.println(c.getApellido());
        System.out.println(c.getFechaNacimiento());
        c.tarjetas.forEach(tar -> {
            tar.imprimirTipo();
            System.out.println("");

        });

    }
}
