/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author daniel
 */
public class crudHabitad extends Conexion{
    public void insertarHabitad(Habitad habitad){
        conexionbd();
        String query ="call zoologico.insertarHabitad('"+habitad.getId()+"', '"+habitad.getDescripcion()+"', '"+habitad.getClima()+"', "+habitad.getDimension()+");";
        try {
            sentencia.execute(query);
        } catch (SQLException ex) {
           
        }
    }
    public void eliminarHabitad(String Id){
        try {
            conexionbd();
            String query ="call zoologico.eliminarHabitad('"+Id+"');";
            sentencia.execute(query);
        } catch (Exception e) {
        }
    }
    public ResultSet Habitad(){
        conexionbd();
       try{
            String query = "select * from habitad;";
        resultado = sentencia.executeQuery(query);
       }catch(Exception e){
           resultado =null;
       }
        return resultado;
    }
}
