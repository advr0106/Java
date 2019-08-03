/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase6_1;

import java.util.ArrayList;
import java.util.List;
import Clase6_1.TarjetasCredito;

/**
 *
 * @author alexv
 */
public class Cliente extends TarjetasCredito {

    private int clienteId;
    private String primerNombre;
    private String apellido;
    private int fechaNacimiento;
    private String tTarjetas;
    List<Cliente> tarjetas = new ArrayList();

    public Cliente(int clienteId, String primerNombre, String apellido, int fechaNacimiento,String tTarjetas, Tarjetas tarjeta, TarjetasCredito tc, TarjetasDebito td, TarjetasFidelizacion tf, TarjetasMonedero tm) {
        this.clienteId = clienteId;
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.tTarjetas=tTarjetas;
        /*if (tarjeta == td) {
            td.imprimirTipo();
        } else if (tarjeta == tc) {
            tc.imprimirTipo();
        } else if (tarjeta == td) {
            td.imprimirTipo();
        } else if (tarjeta == tf) {
            tf.imprimirTipo();
        } else if (tarjeta == tm) {
            tm.imprimirTipo();
        }*/

    }

    Cliente() {

    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(List tarjetas) {
        this.tarjetas = tarjetas;
    }
        public String getTTarjetas() {
        return tTarjetas;
    }

    public void setTTarjetas(List tarjetas) {
        this.tTarjetas = tTarjetas;
    }

}
