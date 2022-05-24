/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Datos.GeneralConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Rol{
    
    private int IdRol;
    private String Descripcion;

    public Rol() {
    }

    public int getIdRol() {
        return IdRol;
    }

    public void setIdRol(int IdRol) {
        this.IdRol = IdRol;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    static public List<Rol> listarRoles(){
      
        PreparedStatement ps;
        ResultSet rs;
        
        List<Rol> listaRoles = new ArrayList();
        
        String query = "select * from ROL";
        
        try {
       
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
            rs = ps.executeQuery();
            
            while (rs.next()) {
               
                Rol rolAux = new Rol();

                rolAux.setIdRol(rs.getInt("IdRol"));
                rolAux.setDescripcion(rs.getString("Descripcion"));

               
                listaRoles.add(rolAux);
            }
            
        } catch (SQLException e) {
            
            System.out.println(e.toString());
        }
        
        
        
        return listaRoles; 
        
    }

    @Override
    public String toString() {
        return "Rol{" + "IdRol=" + IdRol + ", Descripcion=" + Descripcion + '}';
    }
    
    
}
    
   
