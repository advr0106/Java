/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase6_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author alexv
 */
public class Main {

    public static void main(String[] args) {

        TarjetasDebito td = new TarjetasDebito();
        TarjetasFidelizacion tf = new TarjetasFidelizacion();
        TarjetasMonedero tm = new TarjetasMonedero();
        TarjetasCredito tc = new TarjetasCredito();

        Cliente c = new Cliente();
        c.tarjetas = new ArrayList();

        c.getTarjetas().add(new Cliente(12, "Gonzalo", "Beraz", 12, "Tarjeta de Credito"));
        c.getTarjetas().add(new Cliente(12, "Gonzalo", "Beraz", 12, "Tarjeta de Debito"));
        c.getTarjetas().add(new Cliente(12, "Gonzalo", "Beraz", 12, "Tarjeta de fidelizacion"));
        c.getTarjetas().add(new Cliente(12, "Gonzalo", "Beraz", 12, "Tarjeta de monedero"));

        c.tarjetas.forEach(clien -> {
            System.out.println(clien.getClienteId());
            System.out.println(clien.getPrimerNombre());
            System.out.println(clien.getApellido());
            System.out.println(clien.getFechaNacimiento());
            System.out.println(clien.getTTarjetas());
            if ("Tarjeta de Credito".equals(clien.getTTarjetas())) {
                tc.imprimirTipo();
            } else if ("Tarjeta de Credito".equals(clien.getTTarjetas())) {
                td.imprimirTipo();
            } else if ("Tarjeta de Fidelizacion".equals(clien.getTTarjetas())) {
                tf.imprimirTipo();
            } else if ("Tarjeta de Monedero".equals(clien.getTTarjetas())) {
                tm.imprimirTipo();
            }
            System.out.println("");

        });

    }
}
