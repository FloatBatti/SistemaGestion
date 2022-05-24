/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


public class Permiso {
    
    private int IdPermiso;
    private int IdRolR;
    private String NombreMenu;
    private String FechaCreacion;

    public Permiso() {
    }

    public int getIdPermiso() {
        return IdPermiso;
    }

    public void setIdPermiso(int IdPermiso) {
        this.IdPermiso = IdPermiso;
    }

    public int getIdRolR() {
        return IdRolR;
    }

    public void setIdRolR(int IdRolR) {
        this.IdRolR = IdRolR;
    }

    public String getNombreMenu() {
        return NombreMenu;
    }

    public void setNombreMenu(String NombreMenu) {
        this.NombreMenu = NombreMenu;
    }

    public String getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(String FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }
    
    
}
