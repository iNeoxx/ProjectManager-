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
public class ColaboradorController implements ColaboradorInterface{

    @Override
    public String crear(String[] data) {//Funcion crear recibe por parametro un array de datos de colaborador
        String respuesta = "Colaborador ya creado previamente";
        if(!ColaboradorContainer.exist(data[0])){//Se verifica que no exista un colaborador con esa cedula
            ColaboradorEntity nColaborador = new ColaboradorEntity(data);//se crea el colaborador
            if(ColaboradorContainer.add(nColaborador)){//Se llama la funcion add del contenedor y se manda por parametro para almacenar
                respuesta = "Usuario agregado correstamente";
            }else{//Hubo un error
                respuesta = "Error al agregar al almacen de datos";
            }
        }
        return respuesta;
    }

    @Override
    public String modificar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] find(String cedula) {
        ColaboradorEntity colaborador;
        if(ColaboradorContainer.exist(cedula)){
            colaborador = ColaboradorContainer.find(cedula);
            String[] data = {colaborador.getCedula(), colaborador.getNombre(), colaborador.getApellidos(), colaborador.getTelefono(), colaborador.getEmail(), colaborador.getEspecialidad(), colaborador.getEstado()};
            return data;
        }
        return null;
    }

    @Override
    public String eliminar(String cedula) {
        String respuesta = "No existe ningun colaborador con esa cedula";
        if(!ColaboradorContainer.exist(cedula)){
            respuesta = "Colaborador eliminado correctamente";
            ColaboradorContainer.delete(cedula);
        }else{
            respuesta = "Error al eliminar al colaborador";
        }
        
        return respuesta;
    }

    @Override
    public String mostrarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
