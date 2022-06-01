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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;


public class Producto {
    
    private int IdProducto;
    private Categoria CategoriaR;
    private String Codigo;
    private String Nombre;
    private String Descripcion;
    private double StockRifer;
    private double StockCamion;
    private double PrecioVenta;
    private double PrecioCompra;
    private boolean Estado;
    private String FechaCracion;

    public Producto() {
    }

    //<editor-fold defaultstate="collapsed" desc="Getters Ans Setters">
    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public Categoria getCategoriaR() {
        return CategoriaR;
    }

    public void setCategoriaR(Categoria CategoriaR) {
        this.CategoriaR = CategoriaR;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
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

    public double getStockRifer() {
        return StockRifer;
    }

    public void setStockRifer(double StockRifer) {
        this.StockRifer = StockRifer;
    }

    public double getStockCamion() {
        return StockCamion;
    }

    public void setStockCamion(double StockCamion) {
        this.StockCamion = StockCamion;
    }

    public double getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(double PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public double getPrecioCompra() {
        return PrecioCompra;
    }

    public void setPrecioCompra(double PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public String getFechaCracion() {
        return FechaCracion;
    }

    public void setFechaCracion(String FechaCracion) {
        this.FechaCracion = FechaCracion;
    }
    
    //</editor-fold>
    
    static public List<Producto> listarProductos(){
       
        PreparedStatement ps;
        ResultSet rs;
        
        List<Producto> listaProductos= new ArrayList();
        
        StringBuilder query = new StringBuilder();
        query.append("select p.IdProducto, p.IdCategoria, p.Codigo, p.Nombre, p.Descripcion, p.StockRifer, p.StockCamion, p.PrecioVenta, p.PrecioCompra, p.Estado, c.IdCategoria, c.Nombre, c.Descripcion, c.Estado from PRODUCTO p");
        query.append("\n");
        query.append("inner join CATEGORIA c on c.IdCategoria = p.IdCategoria");
        
        try {
       
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query.toString());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Producto prodAux = new Producto();
                Categoria catAux = new Categoria();
                
                prodAux.setIdProducto(rs.getInt("IdProducto"));
                prodAux.setCodigo(rs.getString("Codigo"));
                prodAux.setNombre(rs.getString("Nombre"));
                prodAux.setDescripcion(rs.getString("Descripcion"));
                prodAux.setStockRifer(rs.getDouble("StockRifer"));
                prodAux.setStockCamion(rs.getDouble("StockCamion"));
                prodAux.setPrecioVenta(rs.getDouble("PrecioVenta"));
                prodAux.setPrecioCompra(rs.getDouble("PrecioCompra"));
                prodAux.setEstado(rs.getBoolean("Estado"));
                catAux.setIdCategoria(rs.getInt("IdCategoria"));
                catAux.setNombre(rs.getString("c.Nombre"));
                catAux.setDescripcion(rs.getString("c.Descripcion"));
                catAux.setEstado(rs.getBoolean("c.Estado"));
             
                prodAux.setCategoriaR(catAux);
                listaProductos.add(prodAux);
                
            }
         
        } catch (SQLException e) {
            
            System.out.println(e.toString());
        }
        
        
        
        return listaProductos; 
        
    }
    
    static public boolean registrarProducto(Producto prodTextFields){
       
        PreparedStatement ps;
        
        String query = "INSERT INTO PRODUCTO (IdCategoria, Codigo, Nombre, Descripcion, PrecioVenta, PrecioCompra, Estado) VALUES(?,?,?,?,?,?,?)";
     
        try {
       
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
            
            ps.setInt(1, prodTextFields.getCategoriaR().getIdCategoria());
            ps.setString(2, prodTextFields.getCodigo());
            ps.setString(3, prodTextFields.getNombre());
            ps.setString(4, prodTextFields.getDescripcion());
            ps.setDouble(5, prodTextFields.getPrecioVenta());
            ps.setDouble(6, prodTextFields.getPrecioCompra());
            ps.setBoolean(7, prodTextFields.isEstado());
            
            
            if(productoRepetido(prodTextFields)){
                
                JOptionPane.showMessageDialog(null, "El codigo de producto ya existe. Limpie los campos");
                return false;
            }
            else if(revisionCampos(prodTextFields) && prodTextFields.getIdProducto() == 0){
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Registro Exitoso!");
                return true;
            }
            else if(!(revisionCampos(prodTextFields))){
                
                JOptionPane.showMessageDialog(null, "Faltan completar campos, intente nuevamente");
                return false;
            }
                    
        } catch (SQLException e) {
            
            System.out.println(e.toString());
            

        }
         
       return false;
    }
    
        static public boolean actualizarProducto(Producto prodTextFields){
        
        PreparedStatement ps;
        
        String query = "UPDATE PRODUCTO SET IdCategoria=?, Codigo=?, Nombre=?, Descripcion=?, PrecioVenta=?, PrecioCompra=?, Estado=? WHERE IdProducto=?";
     
        try {
            
            System.out.println(prodTextFields);
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
                       
            ps.setInt(1, prodTextFields.getCategoriaR().getIdCategoria());
            ps.setString(2, prodTextFields.getCodigo());
            ps.setString(3, prodTextFields.getNombre());
            ps.setString(4, prodTextFields.getDescripcion());
            ps.setDouble(5, prodTextFields.getPrecioVenta());
            ps.setDouble(6, prodTextFields.getPrecioCompra());
            ps.setBoolean(7, prodTextFields.isEstado());
            ps.setInt(8, prodTextFields.getIdProducto());
           
            if(revisionCampos(prodTextFields) && prodTextFields.getIdProducto()> 0){
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Actualizacion Exitosa!");
                return true;
                
            }
            else if(!(revisionCampos(prodTextFields)) && prodTextFields.getIdProducto()> 0){
                
                JOptionPane.showMessageDialog(null, "Faltan completar campos, intente nuevamente.");
                return false;
            }
            else if(prodTextFields.getIdProducto()== 0){
                
                JOptionPane.showMessageDialog(null, "Debe seleccionar un producto de la tabla.");
                return false;
            }
                 
        } 
        catch (SQLException e) {
            
            System.out.println(e.toString()); 
        }
        
        return false;
    }
        
    static public boolean  eliminarProducto(Producto prodTextFields){
        
        PreparedStatement ps;
        
        String query = "DELETE FROM PRODUCTO WHERE IdProducto=?";
     
        try {
            
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
                       
            ps.setInt(1, prodTextFields.getIdProducto());
        
           
            if(prodTextFields.getIdProducto() > 0){
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Producto Eliminado");
                return true;
                
            }
            else if(prodTextFields.getIdProducto() == 0){
                
                JOptionPane.showMessageDialog(null, "Debe seleccionar un producto de la tabla.");
                return false;
            }
                 
        } 
        catch (SQLException e) {
            
            System.out.println(e.toString()); 
        }
        
        return false;
    }
    
    static private boolean productoRepetido(Producto prodResgis){
        
        List<Producto> listaProductos = listarProductos();
        
        for (Producto aux : listaProductos){
            
            if (aux.getCodigo().equals(prodResgis.getCodigo())){
                
                return true;
            }
        }
        
        return false;
    }
    
    private static boolean revisionCampos(Producto prodTextFields){
        
        return !(prodTextFields.getNombre().equals("")  || prodTextFields.getCodigo().equals("") || (prodTextFields.getPrecioCompra() == 0.0) || (prodTextFields.getPrecioVenta()== 0.0));
        
    }

    @Override
    public String toString() {
        return "Producto{" + "IdProducto=" + IdProducto + ", CategoriaR=" + CategoriaR + ", Codigo=" + Codigo + ", Nombre=" + Nombre + ", Descripcion=" + Descripcion + ", StockRifer=" + StockRifer + ", StockCamion=" + StockCamion + ", PrecioVenta=" + PrecioVenta + ", PrecioCompra=" + PrecioCompra + ", Estado=" + Estado + '}';
    }

    
    
    
}
