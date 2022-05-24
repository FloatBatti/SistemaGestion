/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


public class Venta {
    
    private int IdCompra;
    private int IdUsuarioR;
    private String NombreCliente;
    private String DocumentoCliente;
    private String TipoDocumentoV;
    private String NumeroDocumentoV;
    private float MontoTotal;
    private String FormaPago;
    private String FechaVenta;

    public Venta() {
    }

    public int getIdCompra() {
        return IdCompra;
    }

    public void setIdCompra(int IdCompra) {
        this.IdCompra = IdCompra;
    }

    public int getIdUsuarioR() {
        return IdUsuarioR;
    }

    public void setIdUsuarioR(int IdUsuarioR) {
        this.IdUsuarioR = IdUsuarioR;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getDocumentoCliente() {
        return DocumentoCliente;
    }

    public void setDocumentoCliente(String DocumentoCliente) {
        this.DocumentoCliente = DocumentoCliente;
    }

    public String getTipoDocumentoV() {
        return TipoDocumentoV;
    }

    public void setTipoDocumentoV(String TipoDocumentoV) {
        this.TipoDocumentoV = TipoDocumentoV;
    }

    public String getNumeroDocumentoV() {
        return NumeroDocumentoV;
    }

    public void setNumeroDocumentoV(String NumeroDocumentoV) {
        this.NumeroDocumentoV = NumeroDocumentoV;
    }

    public float getMontoTotal() {
        return MontoTotal;
    }

    public void setMontoTotal(float MontoTotal) {
        this.MontoTotal = MontoTotal;
    }

    public String getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(String FormaPago) {
        this.FormaPago = FormaPago;
    }

    public String getFechaVenta() {
        return FechaVenta;
    }

    public void setFechaVenta(String FechaVenta) {
        this.FechaVenta = FechaVenta;
    }
    
    
}
