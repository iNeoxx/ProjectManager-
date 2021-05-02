/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.administradordeproyectos.Colaborador;

import com.una.administradordeproyectos.Persona;

/**
 *
 * @author antho
 */
public class ColaboradorEntity extends Persona{
    //Atributo
    private String especialidad;
    private String estado;
    
     /**
    @param  0=cedula,1=nombre,2=apellidos,3=telefono,4=email,5=especialidad,6=estado
    */
    public ColaboradorEntity(String [] data){
        this.setCedula(data[0]);
        this.setNombre(data[1]);
        this.setApellidos(data[2]);
        this.setTelefono(data[3]);
        this.setEmail(data[4]);
        this.especialidad = data[5];
        this.estado = data[6]; //Estado por el momento es String por que no sabemos si podemos dejarlo boolean
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
