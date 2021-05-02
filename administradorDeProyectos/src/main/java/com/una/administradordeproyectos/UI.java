/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.una.administradordeproyectos;

/**
 *
 * @author antho
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Console;
import java.io.IOException;

public class UI {//LA UI ES GENERICA *la misma del proe*
    private static Console console=System.console();
    private static BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
    //BufferedReader = readLine();
    
    public static String input(String msg){//ingresar y verificar
       boolean opt=false;
       String data="";
       String answer;
       do{
           outLine(msg); //muestra al usuario lo que se pide
           data=readLine(); //lee lo que metio el usuario y lo almacena en data
           outLine("Confirma la entrada?[y/n]");
           answer=readLine();
           if(answer.startsWith("y")){
               opt=true;
           }
       }while(!opt);
       return data;
    }
    
    /*         0     1      2     3    4
        array[e1,    e2,   e3,    e4,  e5] 
    
    */
    public static String[] input(String name, String[] msgs){//almacenar
        String[] data = new String[msgs.length];
        outLine("-------"+name+"-------");
        for(int i=0;i<msgs.length;i++){
            data[i]=input(msgs[i]);
        }
        return data;
    }
    public static String readLine(){
        if(console!=null){
            return console.readLine();
        }else{
            try {
                return reader.readLine();
            } catch (IOException ex) {
                outLine("Error de lectura del sistema");
                return null;
            }
        }
    }
    /*
        [3      ]
    */
    public static void outLine(String msg){
        System.out.println(msg);
    }
    
            /* TIPO DE DATOS COMPUESTO    Metodos de conversión                 PRIMITIVO
            Integer                       parse / valueOf                       int
            Boolean                       parse / valueOf                       boolean
            Double                        parse / valueOf                       double
            String                        parse / valueOf                       char
            */
    
    public static int menu(String title, String[] options){
        int opt=-1;
        outLine("==============="+title.toUpperCase()+"===============");
        outLine("Seleccione una opcion del menu.\n");
        for(int i=0;i<options.length;i++){
            outLine((i+1)+"------------------"+options[i]);
        }
        do{
            opt=Integer.parseInt(readLine().trim());
            if(opt>options.length || opt<=0){
                outLine("Ingrese una opcion entre 1 y "+options.length);
                opt=-1;
            }
            
        }while(opt==-1);
        
        return opt-1;
    }
}
