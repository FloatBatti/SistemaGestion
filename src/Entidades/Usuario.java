/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;
import Datos.*;
import Vista.General.Presentacion;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author AgusGonza
 */
public class Usuario {
    
    private int IdUsuario;
    private Rol RolR;
    private String Documento;
    private String NombreCompleto;
    private String Correo;
    private String Telefono;
    private String Clave;
    private boolean Estado;
    
    
    public Usuario() {
    }

    //<editor-fold defaultstate="collapsed" desc="Getters Ans Setters">
    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public Rol getRolR() {
        return RolR;
    }

    public void setRolR(Rol RolR) {
        this.RolR = RolR;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    //</editor-fold>
    
    static public List<Usuario> listarUsuarios(){
       
        PreparedStatement ps;
        ResultSet rs;
        
        List<Usuario> listaUsuarios = new ArrayList();
        
        StringBuilder query = new StringBuilder();
        query.append("select u.IdUsuario, u.IdRol, u.Documento, u.NombreCompleto, u.Correo, u.Telefono, u.Clave, u.Estado, r.IdRol, r.Descripcion from USUARIO u");
        query.append("\n");
        query.append("inner join ROL r on r.IdRol = u.IdRol");
        
        try {
       
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query.toString());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Usuario userAux = new Usuario();
                Rol rolAux = new Rol();
                userAux.setIdUsuario(rs.getInt("IdUsuario"));
                userAux.setDocumento(rs.getString("Documento"));
                userAux.setNombreCompleto(rs.getString("NombreCompleto"));
                userAux.setCorreo(rs.getString("Correo"));
                userAux.setTelefono(rs.getString("Telefono"));
                userAux.setClave(rs.getString("Clave"));
                userAux.setEstado(rs.getBoolean("Estado"));
                rolAux.setIdRol(rs.getInt("IdRol"));
                rolAux.setDescripcion(rs.getString("Descripcion"));
                userAux.setRolR(rolAux);
                 
                listaUsuarios.add(userAux);
            }
            
        } catch (SQLException e) {
            
            System.out.println(e.toString());
        }
        
        
        
        return listaUsuarios; 
        
    }
    
    static public void registrarUsuarios(Usuario usuarioCreado){
       
        PreparedStatement ps;
        ResultSet rs;
        
        String query = "INSERT INTO USUARIO (IdRol, Documento, NombreCompleto, Correo, Telefono, Clave, Estado)";
        
        try {
       
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query.toString());
            
            
            //ps.setString(1, );
           
            rs = ps.executeQuery();    
            
            
            
        } catch (SQLException e) {
            
            System.out.println(e.toString());
        }
        

    }

    @Override
    public String toString() {
        return "Usuario{" + "IdUsuario=" + IdUsuario + ", IdRolR=" + RolR + ", Documento=" + Documento + ", NombreCompleto=" + NombreCompleto + ", Correo=" + Correo + ", Telefono=" + Telefono + ", Clave=" + Clave + ", Estado=" + Estado + ", FechaCreacion=" + '}';
    }
    
    
}
