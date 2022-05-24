/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


public class DetalleCompra {
    
    private int IdDetalleCompra;
    private int IdCompraR;
    private int IdProducto;
    private float PrecioCompra;
    private float PrecioVenta;
    private float KilosVendidos;
    private float MontoTotal;
    private String FechaCompra;

    public DetalleCompra() {
    }

    public int getIdDetalleCompra() {
        return IdDetalleCompra;
    }

    public void setIdDetalleCompra(int IdDetalleCompra) {
        this.IdDetalleCompra = IdDetalleCompra;
    }

    public int getIdCompraR() {
        return IdCompraR;
    }

    public void setIdCompraR(int IdCompraR) {
        this.IdCompraR = IdCompraR;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public float getPrecioCompra() {
        return PrecioCompra;
    }

    public void setPrecioCompra(float PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }

    public float getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(float PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public float getKilosVendidos() {
        return KilosVendidos;
    }

    public void setKilosVendidos(float KilosVendidos) {
        this.KilosVendidos = KilosVendidos;
    }

    public float getMontoTotal() {
        return MontoTotal;
    }

    public void setMontoTotal(float MontoTotal) {
        this.MontoTotal = MontoTotal;
    }

    public String getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(String FechaCompra) {
        this.FechaCompra = FechaCompra;
    }
    
    
}
