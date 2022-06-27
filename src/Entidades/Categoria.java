/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Datos.GeneralConnection;
import Datos.ModifDatos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;


public class Categoria implements ModifDatos<Categoria>{
    
    private int IdCategoria;
    private String Nombre;
    private String Descripcion ="";
    private boolean Estado;

    public Categoria() {
    }

    //<editor-fold defaultstate="collapsed" desc="Getters Ans Setters">
    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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
    
    //</editor-fold>

    @Override
    public List<Categoria> listarEntidades(){
      
        PreparedStatement ps;
        ResultSet rs;
        
        List<Categoria> listaCategorias = new ArrayList();
        
        String query = "select * from CATEGORIA";
        
        try {
       
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
            rs = ps.executeQuery();
            
            while (rs.next()) {
               
                Categoria catAux = new Categoria();

                catAux.setIdCategoria(rs.getInt("IdCategoria"));
                catAux.setNombre(rs.getString("Nombre"));
                catAux.setDescripcion(rs.getString("Descripcion"));
                catAux.setEstado(rs.getBoolean("Estado"));

               
                listaCategorias.add(catAux);
            }
            
        } catch (SQLException e) {
            
            System.out.println(e.toString());
        }
        
        
        
        return listaCategorias; 
        
    }
    
    @Override
    public boolean registrarEntidad(Categoria entidadTextFields){
       
        PreparedStatement ps;
        
        String query = "INSERT INTO CATEGORIA (Nombre, Descripcion, Estado) VALUES(?,?,?)";
     
        try {
       
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
            
            ps.setString(1, entidadTextFields.getNombre());
            ps.setString(2, entidadTextFields.getDescripcion());
            ps.setBoolean(3, entidadTextFields.isEstado());

            if(categoriaRepetida(entidadTextFields)){
                
                JOptionPane.showMessageDialog(null, "La categoria ya existe. Limpie los campos");
                return false;
            }
            else if(revisionCampos(entidadTextFields) && entidadTextFields.getIdCategoria()== 0){
                
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
    public boolean actualizarEntidad(Categoria entidadTextFields){
        
        PreparedStatement ps;
        
        String query = "UPDATE CATEGORIA SET Nombre=?, Descripcion=?, Estado=? WHERE IdCategoria=?";
     
        try {
            
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
                       
            ps.setString(1, entidadTextFields.getNombre());
            ps.setString(2, entidadTextFields.getDescripcion());
            ps.setBoolean(3, entidadTextFields.isEstado());
            ps.setInt(4, entidadTextFields.getIdCategoria());
           
            if(revisionCampos(entidadTextFields) && entidadTextFields.getIdCategoria() > 0){
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Actualizacion Exitosa!");
                return true;
                
            }
            else if(!(revisionCampos(entidadTextFields)) && entidadTextFields.getIdCategoria()> 0){
                
                JOptionPane.showMessageDialog(null, "Faltan completar campos, intente nuevamente.");
                return false;
            }
            else if(entidadTextFields.getIdCategoria()== 0){
                
                JOptionPane.showMessageDialog(null, "Debe seleccionar una categoria de la tabla.");
                return false;
            }
                 
        } 
        catch (SQLException e) {
            
            System.out.println(e.toString()); 
        }
        
        return false;
    }
    
    @Override
    public boolean eliminarEntidad(Categoria entidadTextFields){
        
        PreparedStatement ps;
        
        String query = "DELETE FROM CATEGORIA WHERE IdCategoria=?";
     
        try {
            
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
                       
            ps.setInt(1, entidadTextFields.getIdCategoria());
        
           
            if(entidadTextFields.getIdCategoria()> 0){
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Categoria Eliminada");
                return true;
                
            }
            else if(entidadTextFields.getIdCategoria() == 0){
                
                JOptionPane.showMessageDialog(null, "Debe seleccionar una categoria de la tabla.");
                return false;
            }
                 
        } 
        catch (SQLException e) {
            
            System.out.println(e.toString()); 
        }
        
        return false;
    }
    
    private boolean categoriaRepetida(Categoria catResgis){
        
        List<Categoria> listaCategorias = this.listarEntidades();
        
        for (Categoria aux : listaCategorias){
            
            if (aux.equals(catResgis)){
                
                return true;
            }
        }
        
        return false;
    }
    
    private boolean revisionCampos(Categoria catTextFields){
        
        return !(catTextFields.getNombre().equals(""));
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.Nombre);
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
        final Categoria other = (Categoria) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Categoria{" + "IdCategoria=" + IdCategoria + ", Nombre=" + Nombre + ", Descripcion=" + Descripcion + ", Estado=" + Estado + '}';
    }

   
}
