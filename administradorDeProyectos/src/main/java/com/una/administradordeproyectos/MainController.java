/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.administradordeproyectos;
//se importan los paquetes si no no funca
import com.una.administradordeproyectos.Colaborador.ColaboradorController;
import com.una.administradordeproyectos.Colaborador.ColaboradorInterface;

/**
 *
 * @author antho
 */
public class MainController {
    public static void main(String[] args) {
        int option;
        String answer;
        String menuOptions[] = {"Module Colaborador","Module","Module","Module","Module"};
        do{
            option = UI.menu("Menu Modules",menuOptions);//Se crea el menu y se retorna la opcion que dijito el usuario
            switch(option){
                case 0://Module collaborator
                    moduleCollaborator();
                    break;
                case 1://module
                    break;
                case 2://module
                    break;
                case 3://module
                    break;
                case 4://module
                    break;
                case 5://exit
                    break;
            }
        }while(option != 5);
    }
    //Modulos
    private static void moduleCollaborator(){
        ColaboradorInterface collaborator = new ColaboradorController();//instancia de controlador
        int option;
        String identifier;
        String answer;
        String menuOptions[] = {"Crear","Find","Modificar","Eliminar","Mostrar todos"};
        do{
            option = UI.menu("SubMenu Colaborador",menuOptions);//muestra el menu y retorna la opcion del usuario
            switch(option){
                case 0://Create
                    String data[] = {"Cedula","Nombre","Apellidos","Telefono","Email","Especialidad", "Estado"};
                    data = UI.input("Datos del Colaborador", data);
                    answer = collaborator.crear(data);//Create de controlador
                    UI.outLine(answer);//respuesta
                    break;
                case 1://Find
                    identifier = UI.input("Ingrese la cedula del colaborador");
                    String collaboratorData[] = collaborator.find(identifier);//se manda el identificador y retorna los datos del colaborador
                   if(collaboratorData != null){
                       UI.outLine("------Datos del Colaborador almacenado------");
                       for(String line:collaboratorData){
                           UI.outLine(line);
                       }
                   }else{
                       UI.outLine("No existe ningun colaborador con esa cedula");
                   }
                    break;
                case 2://modify
                    break;
                case 3://Delete
                    break;
                case 4://Show All
                    break;
                case 5://exit
                    break;
            }
        }while(option != 5);
        
    }
}
