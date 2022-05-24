/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


public class Cliente {
    
    private int IdCliente;
    private String NombreCompleto;
    private String Documento;
    private String Correo;
    private String Telefono;
    private String Descripcion;
    private String FechaCumpleaños;
    private String Frecuencia;
    private boolean Estado;
    private String HorarioEntrega;
    private String FechaRegistro;

    public Cliente() {
    }

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

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFechaCumpleaños() {
        return FechaCumpleaños;
    }

    public void setFechaCumpleaños(String FechaCumpleaños) {
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

    public String getFechaRegistro() {
        return FechaRegistro;
    }

    public void setFechaRegistro(String FechaRegistro) {
        this.FechaRegistro = FechaRegistro;
    }
    
    
}
