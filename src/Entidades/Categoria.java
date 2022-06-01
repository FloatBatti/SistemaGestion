/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import Datos.GeneralConnection;
import static Entidades.Producto.listarProductos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Categoria {
    
    private int IdCategoria;
    private String Nombre;
    private String Descripcion;
    private boolean Estado;

    public Categoria() {
    }

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

    static public List<Categoria> listarCategorias(){
      
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
    
    static public boolean registrarCategoria(Categoria catTextFields){
       
        PreparedStatement ps;
        
        String query = "INSERT INTO CATEGORIA (Nombre, Descripcion, Estado) VALUES(?,?,?)";
     
        try {
       
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
            
            ps.setString(1, catTextFields.getNombre());
            ps.setString(2, catTextFields.getDescripcion());
            ps.setBoolean(3, catTextFields.isEstado());

            if(productoRepetido(catTextFields)){
                
                JOptionPane.showMessageDialog(null, "La categoria ya existe. Limpie los campos");
                return false;
            }
            else if(revisionCampos(catTextFields) && catTextFields.getIdCategoria()== 0){
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Registro Exitoso!");
                return true;
            }
            else if(!(revisionCampos(catTextFields))){
                
                JOptionPane.showMessageDialog(null, "Faltan completar campos, intente nuevamente");
                return false;
            }
                    
        } catch (SQLException e) {
            
            System.out.println(e.toString());
            

        }
         
       return false;
    }
    
    static public boolean actualizarCategoria(Categoria catTextFields){
        
        PreparedStatement ps;
        
        String query = "UPDATE CATEGORIA SET Nombre=?, Descripcion=?, Estado=? WHERE IdCategoria=?";
     
        try {
            
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
                       
            ps.setString(1, catTextFields.getNombre());
            ps.setString(2, catTextFields.getDescripcion());
            ps.setBoolean(3, catTextFields.isEstado());
            ps.setInt(4, catTextFields.getIdCategoria());
           
            if(revisionCampos(catTextFields) && catTextFields.getIdCategoria() > 0){
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Actualizacion Exitosa!");
                return true;
                
            }
            else if(!(revisionCampos(catTextFields)) && catTextFields.getIdCategoria()> 0){
                
                JOptionPane.showMessageDialog(null, "Faltan completar campos, intente nuevamente.");
                return false;
            }
            else if(catTextFields.getIdCategoria()== 0){
                
                JOptionPane.showMessageDialog(null, "Debe seleccionar una categoria de la tabla.");
                return false;
            }
                 
        } 
        catch (SQLException e) {
            
            System.out.println(e.toString()); 
        }
        
        return false;
    }
    
    static public boolean  eliminarCategoria(Categoria catTextFields){
        
        PreparedStatement ps;
        
        String query = "DELETE FROM CATEGORIA WHERE IdCategoria=?";
     
        try {
            
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
                       
            ps.setInt(1, catTextFields.getIdCategoria());
        
           
            if(catTextFields.getIdCategoria()> 0){
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Categoria Eliminada");
                return true;
                
            }
            else if(catTextFields.getIdCategoria() == 0){
                
                JOptionPane.showMessageDialog(null, "Debe seleccionar una categoria de la tabla.");
                return false;
            }
                 
        } 
        catch (SQLException e) {
            
            System.out.println(e.toString()); 
        }
        
        return false;
    }
    
    static private boolean productoRepetido(Categoria catResgis){
        
        List<Categoria> listaCategorias = listarCategorias();
        
        for (Categoria aux : listaCategorias){
            
            if (aux.getNombre().equals(catResgis.getNombre())){
                
                return true;
            }
        }
        
        return false;
    }
    
    private static boolean revisionCampos(Categoria catTextFields){
        
        return !(catTextFields.getNombre().equals("")  || catTextFields.getDescripcion().equals(""));
        
    }

    @Override
    public String toString() {
        return "Categoria{" + "IdCategoria=" + IdCategoria + ", Nombre=" + Nombre + ", Descripcion=" + Descripcion + ", Estado=" + Estado + '}';
    }
    
    
}
