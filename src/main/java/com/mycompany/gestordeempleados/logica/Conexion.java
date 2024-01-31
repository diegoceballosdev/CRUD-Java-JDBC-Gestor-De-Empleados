package com.mycompany.gestordeempleados.logica;

import java.sql.*;

public class Conexion {
    
    private static Connection conexion;
    private static Conexion instancia;
    
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost/gestor_empleados";
    
    
    public Connection conectar(){
   
        try {       
            //CARGA DEL DRIVER EN LA MEMORIA:
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //SE ESTALECE LA CONEXION A LA BD:
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            
            System.out.println("CONECTADO: Conexion Establecida");
            
            return conexion;         
        } 
        catch (Exception e) {
            
            System.out.println("ERROR: " + e.getMessage());       
        }
        
        //RETORNAR LA CONEXION (AQUI PODRIA SER UN 'null'):
        return conexion;     
    }
    
    
    public void desconectar(){
        
        try {     
            //SE CIERRA LA CONEXION A LA BD:
            conexion.close();
            
            System.out.println("DESCONECTADO: Conexion Finalizada");       
        } 
        catch (Exception e) {
            
            System.out.println("ERROR: " + e.getMessage());
        }
    }
    
    
    public static Conexion getInstancia(){
        
        if (instancia == null) {
            
            instancia = new Conexion();        
        } 
            
        return instancia;
    }
    
}
