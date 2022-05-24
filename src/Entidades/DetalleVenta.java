/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


public class DetalleVenta {
    
    private int IdDetalleVenta;
    private int IdVentarR;
    private int IdProductoR;
    private int IdViajeR;
    private float PrecioVenta;
    private float KilosVendidos;
    private float Subtotal; 
    private String FechaVenta;

    public DetalleVenta() {
    }

    public int getIdDetalleVenta() {
        return IdDetalleVenta;
    }

    public void setIdDetalleVenta(int IdDetalleVenta) {
        this.IdDetalleVenta = IdDetalleVenta;
    }

    public int getIdVentarR() {
        return IdVentarR;
    }

    public void setIdVentarR(int IdVentarR) {
        this.IdVentarR = IdVentarR;
    }

    public int getIdProductoR() {
        return IdProductoR;
    }

    public void setIdProductoR(int IdProductoR) {
        this.IdProductoR = IdProductoR;
    }

    public int getIdViajeR() {
        return IdViajeR;
    }

    public void setIdViajeR(int IdViajeR) {
        this.IdViajeR = IdViajeR;
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

    public float getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(float Subtotal) {
        this.Subtotal = Subtotal;
    }

    public String getFechaVenta() {
        return FechaVenta;
    }

    public void setFechaVenta(String FechaVenta) {
        this.FechaVenta = FechaVenta;
    }
    
    
}
