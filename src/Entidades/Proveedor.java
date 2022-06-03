/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Datos.GeneralConnection;
import static Entidades.Usuario.listarUsuarios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;


public class Proveedor {
    
    private int IdProveedor;
    private String Nombre ="";
    private String RazonSocial;
    private String Correo="";
    private String Telefono="";
    private String Descripcion="";
    private double saldoDeudor= 0.0;
    private boolean Estado = true;

    public Proveedor() {
    }

    //<editor-fold defaultstate="collapsed" desc="Getters Ans Setters">
    public int getIdProveedor() {
        return IdProveedor;
    }

    public void setIdProveedor(int IdProveedor) {
        this.IdProveedor = IdProveedor;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public double getSaldoDeudor() {
        return saldoDeudor;
    }

    public void setSaldoDeudor(double saldoDeudor) {
        this.saldoDeudor = saldoDeudor;
    }
    
    
    
      //</editor-fold>
    
    static public List<Proveedor> listarProveedores(){
       
        PreparedStatement ps;
        ResultSet rs;
        
        List<Proveedor> listaProveedores= new ArrayList();
        
        String query = "select * from PROVEEDOR";
       
        
        try {
       
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query.toString());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Proveedor provAux = new Proveedor();
                
              
                provAux.setIdProveedor(rs.getInt("IdProveedor"));
                provAux.setNombre(rs.getString("Nombre"));
                provAux.setRazonSocial(rs.getString("RazonSocial"));
                provAux.setCorreo(rs.getString("Correo"));
                provAux.setTelefono(rs.getString("Telefono"));
                provAux.setDescripcion(rs.getString("Descripcion"));
                provAux.setSaldoDeudor(rs.getDouble("SaldoDeudor"));
                provAux.setEstado(rs.getBoolean("Estado"));
             
                listaProveedores.add(provAux);
                
            }
         
        } catch (SQLException e) {
            
            System.out.println(e.toString());
        }
        
        
        
        return listaProveedores; 
        
    }
    
    static public boolean  registrarProveedor(Proveedor provTextFields){
       
        PreparedStatement ps;
        
        String query = "INSERT INTO PROVEEDOR (Nombre, RazonSocial, Correo, Telefono, Descripcion, Estado) VALUES(?,?,?,?,?,?)";
     
        try {
       
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
            
            ps.setString(1, provTextFields.getNombre());
            ps.setString(2, provTextFields.getRazonSocial());
            ps.setString(3, provTextFields.getCorreo());
            ps.setString(4, provTextFields.getTelefono());
            ps.setString(5, provTextFields.getDescripcion());
            ps.setBoolean(6, provTextFields.isEstado());
           
            
            if(proveedorRepetido(provTextFields)){
                
                JOptionPane.showMessageDialog(null, "El proveedor ya existe. Limpie los campos");
                return false;
            }
            else if(revisionCampos(provTextFields) && provTextFields.getIdProveedor() == 0){
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Registro Exitoso!");
                return true;
            }
            else if(!(revisionCampos(provTextFields))){
                
                JOptionPane.showMessageDialog(null, "Faltan completar campos, intente nuevamente");
                return false;
            }
                    
        } catch (SQLException e) {
            
            System.out.println(e.toString());
            

        }
         
       return false;
    }
    
    static public boolean actualizarProveedor(Proveedor provTextFields){
        
        PreparedStatement ps;
        
        String query = "UPDATE PROVEEDOR SET Nombre=?, RazonSocial=?, Correo=?, Telefono=?, Descripcion=?, Estado=? WHERE IdProveedor=?";
     
        try {
            
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
                       
            ps.setString(1, provTextFields.getNombre());
            ps.setString(2, provTextFields.getRazonSocial());
            ps.setString(3, provTextFields.getCorreo());
            ps.setString(4, provTextFields.getTelefono());
            ps.setString(5, provTextFields.getDescripcion());
            ps.setBoolean(6, provTextFields.isEstado());
            ps.setInt(7, provTextFields.getIdProveedor());

           
            if(revisionCampos(provTextFields) && provTextFields.getIdProveedor()> 0){
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Actualizacion Exitosa!");
                return true;
                
            }
            else if(!(revisionCampos(provTextFields)) && provTextFields.getIdProveedor()> 0){
                
                JOptionPane.showMessageDialog(null, "Faltan completar campos, intente nuevamente.");
                return false;
            }
            else if(provTextFields.getIdProveedor()== 0){
                
                JOptionPane.showMessageDialog(null, "Debe seleccionar un proveedor de la tabla.");
                return false;
            }
                 
        } 
        catch (SQLException e) {
            
            System.out.println(e.toString()); 
        }
        
        return false;
    }
    
    static public boolean  eliminarProveedor(Proveedor provTextFields){
        
        PreparedStatement ps;
        
        String query = "DELETE FROM PROVEEDOR WHERE IdProveedor=?";
     
        try {
            
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
                       
            ps.setInt(1, provTextFields.getIdProveedor());
        
           
            if(provTextFields.getIdProveedor() > 0){
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Usuario Eliminado");
                return true;
                
            }
            else if(provTextFields.getIdProveedor() == 0){
                
                JOptionPane.showMessageDialog(null, "Debe seleccionar un usuario de la tabla.");
                return false;
            }
                 
        } 
        catch (SQLException e) {
            
            System.out.println(e.toString()); 
        }
        
        return false;
    }
    
    
    private static boolean revisionCampos(Proveedor provTextFields){
        
        return !(provTextFields.getTelefono().equals("") || provTextFields.getRazonSocial().equals(""));
        
    }
      
    static private boolean proveedorRepetido(Proveedor provRegis){
        
        List<Proveedor> listaProveedores = listarProveedores();
        
        for (Proveedor aux : listaProveedores){
            
            if (aux.equals(provRegis)){
                
                return true;
            }
        }
        
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.RazonSocial);
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
        final Proveedor other = (Proveedor) obj;
        if (!Objects.equals(this.RazonSocial, other.RazonSocial)) {
            return false;
        }
        return true;
    }
    
}
