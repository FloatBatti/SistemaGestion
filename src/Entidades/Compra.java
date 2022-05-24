/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


public class Compra {
    
    private int IdCompra;
    private int IdUsuarioR;
    private int IdProveedorR;
    private String TipoDocumentoC;
    private String NumeroDocumento;
    private float MontoTotal;
    private String FechaCompra;

    public Compra() {
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

    public int getIdProveedorR() {
        return IdProveedorR;
    }

    public void setIdProveedorR(int IdProveedorR) {
        this.IdProveedorR = IdProveedorR;
    }

    public String getTipoDocumentoC() {
        return TipoDocumentoC;
    }

    public void setTipoDocumentoC(String TipoDocumentoC) {
        this.TipoDocumentoC = TipoDocumentoC;
    }

    public String getNumeroDocumento() {
        return NumeroDocumento;
    }

    public void setNumeroDocumento(String NumeroDocumento) {
        this.NumeroDocumento = NumeroDocumento;
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
