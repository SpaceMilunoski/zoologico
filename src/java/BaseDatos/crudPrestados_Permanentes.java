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
public class crudPrestados_Permanentes extends Conexion{
    public void insertarPrestados(animalesPrestados aP){
        try {
            String query ="call zoologico.agregarPrestado('"+aP.Id+"', '"+aP.Fecha_prestamo+"', '"+aP.Fecha_devolucion+"', '"+aP.Zoo_propietario+"', '"+aP.Contacto+"');";
            sentencia.execute(query);
        } catch (Exception e) {
        }
    }
    public void eliminarPrestados(String Id){
        try {
            String query ="call zoologico.eliminar_prestado('"+Id+"');";
            sentencia.execute(query);
        } catch (Exception e) {
        }
    }
    public void insertarPermanentes(animalesPermanentes aPerm){
         try {
            String query ="call zoologico.agregarPermanente('"+aPerm.Id+"', '"+aPerm.Descripcion+"', '"+aPerm.Fecha_add+"', '"+aPerm.Estado+"');";
            sentencia.execute(query);
        } catch (Exception e) {
        }
    }
    public void eliminarPermanentes(String Id){
        try {
            String query ="call zoologico.eliminar_permanente('"+Id+"');";
            sentencia.execute(query);
        } catch (Exception e) {
        }
    }
    
}
