
package javaconexionbasesdedatos;

import java.sql.*;

public class Conexion {

    static String url = "jdbc:mysql://localhost:3306/camiloJava";
    static String user = "root";
    static String password = "1090397640";

    Connection cx;

    public Conexion() {
    }

    public static Connection conectar() {
        Connection con = null;
        try {
            // Registrar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establecer la conexión
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa");
            
        } catch (ClassNotFoundException e) {
            System.out.println("Error al registrar el driver de MySQL: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
        return con;
    }

   
}
