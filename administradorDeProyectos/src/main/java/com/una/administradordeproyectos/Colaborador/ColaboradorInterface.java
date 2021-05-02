/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.administradordeproyectos.Colaborador;

/**
 *
 * @author antho
 */
public interface ColaboradorInterface {
    public String crear(String[]data);
    public String modificar();
    public String[] find(String cedula);
    public String eliminar(String cedula);
    public String mostrarTodos();
}
