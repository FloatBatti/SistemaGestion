/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Datos;

import java.util.List;

/**
 *
 * @author AgusGonza
 */
public interface ModifDatos<T>{
    
    List<T> listarEntidades();
    boolean registrarEntidad(T entidadTextFields);
    boolean actualizarEntidad(T entidadTextFields);
    boolean eliminarEntidad(T entidadTextFields);  

}
