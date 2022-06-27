/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;
import Datos.*;
import java.sql.*;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author AgusGonza
 */
public class Usuario implements ModifDatos<Usuario>{
    
    private int IdUsuario;
    private Rol RolR;
    private String Documento;
    private String NombreCompleto;
    private String Correo;
    private String Telefono;
    private String Clave;
    private boolean Estado;
    
    
    public Usuario(){
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
    
    @Override
    public List<Usuario> listarEntidades() {
        
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

    @Override
    public boolean registrarEntidad(Usuario entidadTextFields) {
        
        PreparedStatement ps;
        
        String query = "INSERT INTO USUARIO (IdRol, Documento, NombreCompleto, Correo, Telefono, Clave, Estado) VALUES(?,?,?,?,?,?,?)";
     
        try {
       
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
            
            ps.setInt(1, entidadTextFields.getRolR().getIdRol());
            ps.setString(2, entidadTextFields.getDocumento());
            ps.setString(3, entidadTextFields.getNombreCompleto());
            ps.setString(4, entidadTextFields.getCorreo());
            ps.setString(5, entidadTextFields.getTelefono());
            ps.setString(6, entidadTextFields.getClave());
            ps.setBoolean(7, entidadTextFields.isEstado());
           
            
            if(usuarioRepetido(entidadTextFields)){
                
                JOptionPane.showMessageDialog(null, "El usuario ya existe. Limpie los campos");
                return false;
            }
            else if(revisionCampos(entidadTextFields) && entidadTextFields.getIdUsuario() == 0){
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Registro Exitoso!");
                return true;
            }
            else if(!(revisionCampos(entidadTextFields))){
                
                JOptionPane.showMessageDialog(null, "Faltan completar campos, intente nuevamente");
                return false;
            }
                    
        } catch (SQLException e) {
            
            System.out.println(e.toString());
            

        }
         
       return false;
    }

    @Override
    public boolean actualizarEntidad(Usuario entidadTextFields) {
        
         PreparedStatement ps;
        
        String query = "UPDATE USUARIO SET IdRol=?, Documento=?, NombreCompleto=?, Correo=?, Telefono=?, Clave=?, Estado=? WHERE IdUsuario=?";
     
        try {
            
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
                       
            ps.setInt(1, entidadTextFields.getRolR().getIdRol());
            ps.setString(2, entidadTextFields.getDocumento());
            ps.setString(3, entidadTextFields.getNombreCompleto());
            ps.setString(4, entidadTextFields.getCorreo());
            ps.setString(5, entidadTextFields.getTelefono());
            ps.setString(6, entidadTextFields.getClave());
            ps.setBoolean(7, entidadTextFields.isEstado());
            ps.setInt(8, entidadTextFields.getIdUsuario());
           
            if(revisionCampos(entidadTextFields) && entidadTextFields.getIdUsuario() > 0){
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Actualizacion Exitosa!");
                return true;
                
            }
            else if(!(revisionCampos(entidadTextFields)) && entidadTextFields.getIdUsuario() > 0){
                
                JOptionPane.showMessageDialog(null, "Faltan completar campos, intente nuevamente.");
                return false;
            }
            else if(entidadTextFields.getIdUsuario() == 0){
                
                JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario de la tabla.");
                return false;
            }
                 
        } 
        catch (SQLException e) {
            
            System.out.println(e.toString()); 
        }
        
        return false;
    }

    @Override
    public boolean eliminarEntidad(Usuario entidadTextFields) {
        
        PreparedStatement ps;
        
        String query = "DELETE FROM USUARIO WHERE IdUsuario=?";
     
        try {
            
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
                       
            ps.setInt(1, entidadTextFields.getIdUsuario());
        
           
            if(entidadTextFields.getIdUsuario() > 0){
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Usuario Eliminado");
                return true;
                
            }
            else if(entidadTextFields.getIdUsuario() == 0){
                
                JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario de la tabla.");
                return false;
            }
                 
        } 
        catch (SQLException e) {
            
            System.out.println(e.toString()); 
        }
        
        return false;
    }

    private boolean revisionCampos(Usuario userTextFields){
        
        return !(userTextFields.getNombreCompleto().equals("") || userTextFields.getDocumento().equals("") || userTextFields.getCorreo().equals("") || userTextFields.getTelefono().equals("") || userTextFields.getClave().equals(""));
        
    }
      
    private boolean usuarioRepetido(Usuario userRegis){
        
        List<Usuario> listaUsuarios = this.listarEntidades();
        
        for (Usuario aux : listaUsuarios){
            
            if (aux.equals(userRegis)){
                
                return true;
            }
        }
        
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.Documento);
        hash = 41 * hash + Objects.hashCode(this.Correo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.Documento, other.Documento) && !Objects.equals(this.Correo, other.Correo)) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "IdUsuario=" + IdUsuario + ", RolR=" + RolR + ", Documento=" + Documento + ", NombreCompleto=" + NombreCompleto + ", Correo=" + Correo + ", Telefono=" + Telefono + ", Clave=" + Clave + ", Estado=" + Estado + '}';
    }

   
    
    
    
   
}