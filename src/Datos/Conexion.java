/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    private String db="depezmdq_SistemaGestion";
    private String url="jdbc:mysql://cpl27.main-hosting.eu:3306/";
    private String user="depezmdq_Admin";
    private String password="Pescadofeliz2021";
    private String driver="com.mysql.cj.jdbc.Driver";
    Connection cx;

    public Conexion (){

    }

    public Connection conectar (){

        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url + db, user, password);
            //System.out.println("Conectado a la base de datos");
        } catch (ClassNotFoundException |SQLException ex) {
            //System.out.println("Error al conectar a la base de datos");
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);

        }
        return cx ;
    }


        public void desconectar(){

        try {
            cx.close();
                System.out.println("Desconectado de la base");
                    } catch (SQLException ex) {

            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        Conexion conexion= new Conexion();
        conexion.conectar();
    }
}
