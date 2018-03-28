/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

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
    
    public void mostrarRevisiones(Revisiones revision){
        try{
            conexionbd();
            String consultar ="select * from revisiones;";
            sentencia.execute(consultar);
        }catch(Exception e){
            
        }
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
