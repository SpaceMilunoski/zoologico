/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.sql.ResultSet;

/**
 *
 * @author daniel
 */
public class CrudRevisiones extends Conexion{
    public void insertarRevision(Revisiones revision){
        try{
            conexionbd();
            String insertar ="call zoologico.insertarRevision('"+revision.getId()+"', '"+revision.getDescripcion()+"', '"+revision.getFechaIngreso()+"', '"+revision.getFechaSalida()+"', '"+revision.getTratamiento()+"', '"+revision.getObservaciones()+"', '"+revision.getEstatus()+"', '"+revision.getIdAnimal()+"', '"+revision.getConcentrado()+"', '"+revision.getIdVeterinario()+"');";
            sentencia.execute(insertar);
        }catch(Exception e){
            
        }
    }
    
    public ResultSet Revisiones(){
        conexionbd();
       try{
            String query = "select * from revisiones;";
        resultado = sentencia.executeQuery(query);
       }catch(Exception e){
           resultado =null;
       }
        return resultado;
    }
    
    public void actualizarRevisiones(Revisiones revision){
        try{
            conexionbd();
            String actualizar ="call zoologico.actualizarRevision('"+revision.getId()+"', '"+revision.getDescripcion()+"', '"+revision.getFechaIngreso()+"', '"+revision.getFechaSalida()+"', '"+revision.getTratamiento()+"', '"+revision.getObservaciones()+"', '"+revision.getEstatus()+"', '"+revision.getIdAnimal()+"', '"+revision.getConcentrado()+"', '"+revision.getIdVeterinario()+"');";
            sentencia.execute(actualizar);
        }catch(Exception e){
            
        }
    }
    
    public void eliminarRevisiones(Revisiones revision){
        try{
            conexionbd();
            String eliminar ="call eliminarRevision('"+revision.getId()+"');";
            sentencia.execute(eliminar);
        }catch(Exception e){
            
        }
    }
}
