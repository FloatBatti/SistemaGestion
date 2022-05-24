/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.sql.*;
import javax.swing.JOptionPane;


public class GeneralConnection {
    
    private static Connection generalConnection = null;

    public GeneralConnection() {
    }

    public static Connection getGeneralConnection() {
        return generalConnection;
    }

    public static void setGeneralConnection(Connection generalConnection) {
        GeneralConnection.generalConnection = generalConnection;
    }
    
    static public void firewallConnection(){
        
        try {
            
            if(GeneralConnection.getGeneralConnection().isClosed()){
                JOptionPane.showMessageDialog(null, "Se perdio la conexion con la base de datos, intente nuevamente");
                GeneralConnection.setGeneralConnection(new Conexion().conectar());
            }
            
        } catch (com.mysql.cj.jdbc.exceptions.CommunicationsException e) {
               
            System.out.println(e);
            
        }catch (Exception ex) {
            
            System.out.println(ex);
        }
        
    }
}
