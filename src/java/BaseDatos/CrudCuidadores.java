/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;
import javax.json.*;
/**
 *
 * @author daniel
 */
public class CrudCuidadores extends Conexion{
    //Conexion con = new Conexion();
    public void insertarCuidadores(Cuidadores cuidador){
        try {
            conexionbd();
            String insertar ="call zoologico.insertar_cuidadores('"+cuidador.getId()+"', '"+cuidador.getNombre()+"', '"+cuidador.getApellidos()+"', '"+cuidador.getNacionalidad()+"', '"+cuidador.getTelefono()+"', '"+cuidador.getEstatus()+"', '"+cuidador.getFecha_ingreso()+"');";
            //String insertar ="call zoologico.insertar_cuidadores('"+cuidador.getId()+"', '1', '1', '1', '1', '1', '2018/03/12');";
            sentencia.execute(insertar);
        } catch (Exception e) {
            
        }
    }
    public void eliminarCuidador(String id){
        try {
            conexionbd();
            String eliminar ="call zoologico.eliminar_cuidador('"+id+"');";
            sentencia.execute(eliminar);
        } catch (Exception e) {
        }
        
    }
    public void agregarCuida(Cuida cuida){
        try {
            String query ="call zoologico.cuidadorCuida("+cuida.Id+", '"+cuida.Id_cuidador+"', "+cuida.Id_animal+", '"+cuida.Turno+"', '"+cuida.Fecha+"');";
        } catch (Exception e) {
        }
    }
}
