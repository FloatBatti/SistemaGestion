/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


public class Producto {
    
    private int IdProducto;
    private int IdCategoriaR;
    private String Codigo;
    private String Nombre;
    private String Descripcion;
    private float StockRifer;
    private float StockCamion;
    private float PrecioVenta;
    private float PrecioCompra;
    private boolean Estado;
    private String FechaCracion;

    public Producto() {
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public int getIdCategoriaR() {
        return IdCategoriaR;
    }

    public void setIdCategoriaR(int IdCategoriaR) {
        this.IdCategoriaR = IdCategoriaR;
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

    public float getStockRifer() {
        return StockRifer;
    }

    public void setStockRifer(float StockRifer) {
        this.StockRifer = StockRifer;
    }

    public float getStockCamion() {
        return StockCamion;
    }

    public void setStockCamion(float StockCamion) {
        this.StockCamion = StockCamion;
    }

    public float getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(float PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public float getPrecioCompra() {
        return PrecioCompra;
    }

    public void setPrecioCompra(float PrecioCompra) {
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
    
    
}
