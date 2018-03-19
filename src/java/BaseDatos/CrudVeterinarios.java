/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

/**
 *
 * @author Miguel Angel
 */
public class CrudVeterinarios extends Conexion {
    public void insertarVeterinarios (Veterinarios veterinario){
        try{
            conexionbd();
            String insertar ="call insertarVeterinario ('"+veterinario.getId()+"', '"+veterinario.getNombre()+"', '"+veterinario.getApellidos()+"', '"+veterinario.getEspecialidad()+"', '"+veterinario.getFechaIngreso()+"', '"+veterinario.getSalario()+"');";
            sentencia.executeQuery(insertar);
        }catch (Exception e){
            
        }
    }
    public void consultarVeterinarios (Veterinarios veterinario){
        try{
            conexionbd();
            String consultar ="select *from veterinarios";
            sentencia.execute(consultar);
        }catch (Exception e){
            
        }
    }
    public void asignarRevisiones (Veterinarios veterinario){
        try{
            conexionbd();
            String asignar ="select *from veterinarios";
            sentencia.execute(asignar);
        }catch (Exception e){
            
        }
    }
}
