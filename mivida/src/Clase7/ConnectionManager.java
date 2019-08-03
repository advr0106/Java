/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.derby.jdbc.ClientDriver;

/**
 *
 * @author alex
 */
public class ConnectionManager {

    public static void main(String[] args) throws SQLException {
        Connection connection = getConnection();
        Statement s = connection.createStatement();

        ResultSet result= s.executeQuery("select * from cliente");
        
        while (result.next()) {            
            System.out.println("id: " + result.getString("cliente_id"));
            System.out.println("Nombre: " + result.getString("first_name"));
            System.out.println("Apellido: " + result.getString("last_name"));
        }
        s.close();
        connection.close();
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();//Cargo el driver
            connection = DriverManager
                    .getConnection("jdbc:derby://localhost:1527/PuntoDeVentas", "alex", "avalenzuela");//Creo la coneccion
        } catch (ClassNotFoundException | InstantiationException
                | IllegalAccessException | SQLException e) {
            System.err.println("Error en la coneccion");
        }
        return connection;
    }
}
