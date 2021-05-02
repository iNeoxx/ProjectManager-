/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.administradordeproyectos.Tareas;

import com.una.administradordeproyectos.Sprints.SprintsEntity;

/**
 *
 * @author antho
 */
public class TareaEntity {
    private long identificador;
    private String descripcion;
    private String nombreColaborador;
    private SprintsEntity sprints;
    private String fechaInicio;
    private String fechaCierre;
    private String recursos;
}
