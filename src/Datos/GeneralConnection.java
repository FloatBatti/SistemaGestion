/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.sql.*;


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
    
    
}
