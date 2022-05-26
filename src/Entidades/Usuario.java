/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;
import Datos.*;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

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
    
    static public boolean  registrarUsuario(Usuario userTextFields){
       
        PreparedStatement ps;
        
        String query = "INSERT INTO USUARIO (IdRol, Documento, NombreCompleto, Correo, Telefono, Clave, Estado) VALUES(?,?,?,?,?,?,?)";
     
        try {
       
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
            
            ps.setInt(1, userTextFields.getRolR().getIdRol());
            ps.setString(2, userTextFields.getDocumento());
            ps.setString(3, userTextFields.getNombreCompleto());
            ps.setString(4, userTextFields.getCorreo());
            ps.setString(5, userTextFields.getTelefono());
            ps.setString(6, userTextFields.getClave());
            ps.setBoolean(7, userTextFields.isEstado());
           
            
            if(usuarioRepetido(userTextFields)){
                
                JOptionPane.showMessageDialog(null, "El usuario ya existe. Limpie los campos");
                return false;
            }
            else if(revisionCampos(userTextFields) && userTextFields.getIdUsuario() == 0){
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Registro Exitoso!");
                return true;
            }
            else if(!(revisionCampos(userTextFields))){
                
                JOptionPane.showMessageDialog(null, "Faltan completar campos, intente nuevamente");
                return false;
            }
                    
        } catch (SQLException e) {
            
            System.out.println(e.toString());
            

        }
         
       return false;
    }
    
    static public boolean actualizarUsuario(Usuario userTextFields){
        
        PreparedStatement ps;
        
        String query = "UPDATE USUARIO SET IdRol=?, Documento=?, NombreCompleto=?, Correo=?, Telefono=?, Clave=?, Estado=? WHERE IdUsuario=?";
     
        try {
            
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
                       
            ps.setInt(1, userTextFields.getRolR().getIdRol());
            ps.setString(2, userTextFields.getDocumento());
            ps.setString(3, userTextFields.getNombreCompleto());
            ps.setString(4, userTextFields.getCorreo());
            ps.setString(5, userTextFields.getTelefono());
            ps.setString(6, userTextFields.getClave());
            ps.setBoolean(7, userTextFields.isEstado());
            ps.setInt(8, userTextFields.getIdUsuario());
           
            if(revisionCampos(userTextFields) && userTextFields.getIdUsuario() > 0){
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Actualizacion Exitosa!");
                return true;
                
            }
            else if(!(revisionCampos(userTextFields)) && userTextFields.getIdUsuario() > 0){
                
                JOptionPane.showMessageDialog(null, "Faltan completar campos, intente nuevamente.");
                return false;
            }
            else if(userTextFields.getIdUsuario() == 0){
                
                JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario de la tabla.");
                return false;
            }
                 
        } 
        catch (SQLException e) {
            
            System.out.println(e.toString()); 
        }
        
        return false;
    }
    
    static public boolean  eliminarUsuario(Usuario userTextFields){
        
        PreparedStatement ps;
        
        String query = "DELETE FROM USUARIO WHERE IdUsuario=?";
     
        try {
            
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
                       
            ps.setInt(1, userTextFields.getIdUsuario());
        
           
            if(userTextFields.getIdUsuario() > 0){
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Usuario Eliminado");
                return true;
                
            }
            else if(userTextFields.getIdUsuario() == 0){
                
                JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario de la tabla.");
                return false;
            }
                 
        } 
        catch (SQLException e) {
            
            System.out.println(e.toString()); 
        }
        
        return false;
    }

    private static boolean revisionCampos(Usuario userRegis){
        
        return !(userRegis.getNombreCompleto().equals("") || userRegis.getDocumento().equals("") || userRegis.getCorreo().equals("") || userRegis.getTelefono().equals("") || userRegis.getClave().equals(""));
        
    }
      
    static private boolean usuarioRepetido(Usuario userRegis){
        
        List<Usuario> listaUsuarios = listarUsuarios();
        
        for (Usuario aux : listaUsuarios){
            
            if (aux.getDocumento().equals(userRegis.getDocumento()) || aux.getCorreo().equals(userRegis.getCorreo()) || userRegis.getIdUsuario() > 0){
                
                return true;
            }
        }
        
        return false;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "IdUsuario=" + IdUsuario + ", IdRolR=" + RolR + ", Documento=" + Documento + ", NombreCompleto=" + NombreCompleto + ", Correo=" + Correo + ", Telefono=" + Telefono + ", Clave=" + Clave + ", Estado=" + Estado +'}';
    }
    
   
}