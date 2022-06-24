/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Datos.GeneralConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Cliente {
    
    private int IdCliente;
    private String NombreCompleto;
    private String Correo;
    private String Telefono;
    private String Ubicacion;
    private String Descripcion;
    private String Frecuencia;
    private boolean Estado;
    private String HorarioEntrega;
    private Date FechaRegistro = new Date();;
    private Date FechaCumpleaños = new Date();
  
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

    public Cliente() {
    }

    //<editor-fold defaultstate="collapsed" desc="Getters Ans Setters">
    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
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

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getFechaCumpleaños() {
        return FechaCumpleaños;
    }

    public void setFechaCumpleaños(Date FechaCumpleaños) {
        this.FechaCumpleaños = FechaCumpleaños;
    }

    public String getFrecuencia() {
        return Frecuencia;
    }

    public void setFrecuencia(String Frecuencia) {
        this.Frecuencia = Frecuencia;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public String getHorarioEntrega() {
        return HorarioEntrega;
    }

    public void setHorarioEntrega(String HorarioEntrega) {
        this.HorarioEntrega = HorarioEntrega;
    }

    public Date getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(Date FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }
    
   
    
    //</editor-fold>
    
    static public List<Cliente> listarClientes(){
       
        PreparedStatement ps;
        ResultSet rs;
        
        List<Cliente> listaClientes = new ArrayList();
        
        String query = "select * from CLIENTE";
   
        try {
       
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query.toString());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Cliente clientAux = new Cliente();

                clientAux.setIdCliente(rs.getInt("IdCliente"));
                clientAux.setNombreCompleto(rs.getString("NombreCompleto"));
                clientAux.setCorreo(rs.getString("Correo"));
                clientAux.setTelefono(rs.getString("Telefono"));
                clientAux.setUbicacion(rs.getString("Ubicacion"));
                clientAux.setDescripcion(rs.getString("Descripcion"));
                clientAux.setFrecuencia(rs.getString("Frecuencia"));
                clientAux.setHorarioEntrega(rs.getString("HorarioEntrega"));
                clientAux.setFechaCumpleaños(rs.getDate("FechaCumpleaños"));
                clientAux.setFechaRegistro(rs.getDate("FechaRegistro"));
                clientAux.setEstado(rs.getBoolean("Estado"));
                 
                listaClientes.add(clientAux);
            }
            
        } catch (SQLException e) {
            
            System.out.println(e.toString());
        }
        
        
        
        return listaClientes; 
        
    }
}
