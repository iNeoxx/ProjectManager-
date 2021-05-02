/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.administradordeproyectos.Colaborador;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author antho
 */
public class ColaboradorContainer {
    //HashMap almacen
     private static Map<String,ColaboradorEntity> cColaborador = new HashMap<String,ColaboradorEntity>();
     //KEY es identificador de colaborador
     //CRUD
     public static boolean add(ColaboradorEntity colaborador){
         if(!cColaborador.containsKey(colaborador.getCedula())){
             cColaborador.put(colaborador.getCedula(), colaborador);
             return true;
         }
         return false;
     }
     //verifica existencia
     public static boolean exist(String cedula){
         if(cColaborador.containsKey(cedula)){
             
             return true;
         }
         return false;
     }
     //busca y retorna colaborador
     public static ColaboradorEntity find(String identificador){
         ColaboradorEntity colaborador;
         
         if(cColaborador.containsKey(identificador)){ 
             colaborador = cColaborador.get(identificador);
             return colaborador;
         }
         return null;
     }
     
      public static boolean update(ColaboradorEntity colaborador){
        return false;
    }
      
    public static boolean delete(String cedula){
        if(!cColaborador.containsKey(cedula)){
            cColaborador.remove(cedula);
            return true;
        }
        return false;
    }
    
     public static List getAll(){
        return null;
    }
}
