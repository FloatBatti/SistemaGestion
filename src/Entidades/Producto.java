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


public class Producto implements ModifDatos<Producto>{
    
    private int IdProducto;
    private Categoria CategoriaR;
    private Proveedor ProveedorR;
    private String Codigo;
    private String Nombre;
    private String Descripcion;
    private double StockRifer;
    private double StockCamion;
    private double PrecioVenta;
    private double PrecioCompra;
    private boolean Estado;

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

    public Proveedor getProveedorR() {
        return ProveedorR;
    }

    public void setProveedorR(Proveedor ProveedorR) {
        this.ProveedorR = ProveedorR;
    }

    
    //</editor-fold>
    
    @Override
    public List<Producto> listarEntidades(){
       
        PreparedStatement ps;
        ResultSet rs;
        
        List<Producto> listaProductos= new ArrayList();
        
        StringBuilder query = new StringBuilder();
        query.append("select p.IdProducto, p.IdCategoria, p.IdProveedor, p.Codigo, p.Nombre, p.Descripcion, p.StockRifer, p.StockCamion, p.PrecioVenta, p.PrecioCompra, p.Estado, c.Nombre, c.Descripcion, c.Estado, v.IdProveedor, v.RazonSocial from PRODUCTO p");
        query.append("\n");
        query.append("inner join CATEGORIA c on c.IdCategoria = p.IdCategoria");
        query.append("\n");
        query.append("inner join PROVEEDOR v on v.IdProveedor = p.IdProveedor");
        
        try {
       
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query.toString());
            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Producto prodAux = new Producto();
                Categoria catAux = new Categoria();
                Proveedor provAux = new Proveedor();
                
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
                catAux.setEstado(rs.getBoolean("c.Estado"));
                
                provAux.setIdProveedor(rs.getInt("IdProveedor"));
                provAux.setRazonSocial(rs.getString("RazonSocial"));
             
                prodAux.setCategoriaR(catAux);
                prodAux.setProveedorR(provAux);
                listaProductos.add(prodAux);
                
            }
            
         
        } catch (SQLException e) {
            
            System.out.println(e.toString());
        }
        
        
        
        return listaProductos; 
        
    }
    
    @Override
    public boolean registrarEntidad(Producto entidadTextFields){
       
        PreparedStatement ps;
        
        String query = "INSERT INTO PRODUCTO (IdCategoria, IdProveedor, Codigo, Nombre, Descripcion, PrecioVenta, PrecioCompra, Estado) VALUES(?,?,?,?,?,?,?,?)";
     
        try {
       
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
            
            ps.setInt(1, entidadTextFields.getCategoriaR().getIdCategoria());
            ps.setInt(2, entidadTextFields.getProveedorR().getIdProveedor());
            ps.setString(3, entidadTextFields.getCodigo());
            ps.setString(4, entidadTextFields.getNombre());
            ps.setString(5, entidadTextFields.getDescripcion());
            ps.setDouble(6, entidadTextFields.getPrecioVenta());
            ps.setDouble(7, entidadTextFields.getPrecioCompra());
            ps.setBoolean(8, entidadTextFields.isEstado());
            
            
            if(productoRepetido(entidadTextFields)){
                
                JOptionPane.showMessageDialog(null, "El codigo de producto ya existe. Limpie los campos");
                return false;
            }
            else if(revisionCampos(entidadTextFields) && entidadTextFields.getIdProducto() == 0){
                
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
    public boolean actualizarEntidad(Producto entidadTextFields){
        
        PreparedStatement ps;
        
        String query = "UPDATE PRODUCTO SET IdCategoria=?, IdProveedor=?, Codigo=?, Nombre=?, Descripcion=?, PrecioVenta=?, PrecioCompra=?, Estado=? WHERE IdProducto=?";
     
        try {
            
         
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
                       
            ps.setInt(1, entidadTextFields.getCategoriaR().getIdCategoria());
            ps.setInt(2, entidadTextFields.getProveedorR().getIdProveedor());
            ps.setString(3, entidadTextFields.getCodigo());
            ps.setString(4, entidadTextFields.getNombre());
            ps.setString(5, entidadTextFields.getDescripcion());
            ps.setDouble(6, entidadTextFields.getPrecioVenta());
            ps.setDouble(7, entidadTextFields.getPrecioCompra());
            ps.setBoolean(8, entidadTextFields.isEstado());
            ps.setInt(9, entidadTextFields.getIdProducto());
           
            if(revisionCampos(entidadTextFields) && entidadTextFields.getIdProducto()> 0){
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Actualizacion Exitosa!");
                return true;
                
            }
            else if(!(revisionCampos(entidadTextFields)) && entidadTextFields.getIdProducto()> 0){
                
                JOptionPane.showMessageDialog(null, "Faltan completar campos, intente nuevamente.");
                return false;
            }
            else if(entidadTextFields.getIdProducto()== 0){
                
                JOptionPane.showMessageDialog(null, "Debe seleccionar un producto de la tabla.");
                return false;
            }
                 
        } 
        catch (SQLException e) {
            
            System.out.println(e.toString()); 
        }
        
        return false;
    }
        
    @Override
    public boolean eliminarEntidad(Producto entidadTextFields){
        
        PreparedStatement ps;
        
        String query = "DELETE FROM PRODUCTO WHERE IdProducto=?";
     
        try {
            
            ps = GeneralConnection.getGeneralConnection().prepareStatement(query);
                       
            ps.setInt(1, entidadTextFields.getIdProducto());
        
           
            if(entidadTextFields.getIdProducto() > 0){
                
                ps.execute();
                JOptionPane.showMessageDialog(null, "Producto Eliminado");
                return true;
                
            }
            else if(entidadTextFields.getIdProducto() == 0){
                
                JOptionPane.showMessageDialog(null, "Debe seleccionar un producto de la tabla.");
                return false;
            }
                 
        } 
        catch (SQLException e) {
            
            System.out.println(e.toString()); 
        }
        
        return false;
    }
    
    private boolean productoRepetido(Producto prodResgis){
        
        List<Producto> listaProductos = this.listarEntidades();
        
        for (Producto aux : listaProductos){
            
            if (aux.equals(prodResgis)){
                
                return true;
            }
        }
        
        return false;
    }
    
    private boolean revisionCampos(Producto prodTextFields){
        
        return !(prodTextFields.getNombre().equals("")  || prodTextFields.getCodigo().equals(""));
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.Codigo);
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
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.Codigo, other.Codigo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" + "IdProducto=" + IdProducto + ", CategoriaR=" + CategoriaR + ", Codigo=" + Codigo + ", Nombre=" + Nombre + ", Descripcion=" + Descripcion + ", StockRifer=" + StockRifer + ", StockCamion=" + StockCamion + ", PrecioVenta=" + PrecioVenta + ", PrecioCompra=" + PrecioCompra + ", Estado=" + Estado + '}';
    }
    
}
