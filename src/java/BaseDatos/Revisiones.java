/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import javax.json.JsonObject;
/**
 *
 * @author Miguel Angel
 */
public class Revisiones {
    int id;
    String descripcion;
    String fecha_ingreso;
    String fecha_salida;
    String tratamiento;
    String observaciones;
    String estatus;
    int id_animal;
    int concentrado;
    int id_veterinario;
    
    public Revisiones(JsonObject revision){
        this.id=revision.getInt("Id");
        this.descripcion=revision.getString("Descripcion");
        this.fecha_ingreso=revision.getString("FechaIngreso");
        this.fecha_salida=revision.getString("FechaSalida");
        this.tratamiento=revision.getString("Tratamiento");
        this.observaciones=revision.getString("Observaciones");
        this.estatus=revision.getString("Estatus");
        this.id_animal=revision.getInt("IdAnimal");
        this.concentrado=revision.getInt("Conectrado");
        this.id_veterinario=revision.getInt("IdVeterinario");
    }
    //-------------------------------------
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    //-------------------------------------
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    //-------------------------------------
    public String getFechaIngreso(){
        return fecha_ingreso;
    }
    public void setFechaIngreso(String fecha_ingreso){
        this.fecha_ingreso = fecha_ingreso;
    }
    //-------------------------------------
    public String getFechaSalida(){
        return fecha_salida;
    }
    public void setFechasalida(String fecha_salida){
        this.fecha_salida = fecha_salida;
    }
    //-------------------------------------
    public String getTratamiento(){
        return tratamiento;
    }
    public void setTratamiento(String tratamiento){
        this.tratamiento = tratamiento;
    }
    //-------------------------------------
    public String getObservaciones(){
        return observaciones;
    }
    public void setObservaciones(String observaciones){
        this.observaciones = observaciones;
    }
    //-------------------------------------
    public String getEstatus(){
        return estatus;
    }
    public void setEstatus(String estatus){
        this.estatus = estatus;
    }
    //-------------------------------------
    public int getIdAnimal(){
        return id_animal;
    }
    public void setIdAnimal(int id_animal){
        this.id_animal = id_animal;
    }
    //-------------------------------------
    public int getConcentrado(){
        return concentrado;
    }
    public void setConcentrado(int concentrado){
        this.concentrado = concentrado;
    }
    //-------------------------------------
    public int getIdVeterinario(){
        return id_veterinario;
    }
    public void setIdVeterinario(int id_veterinario){
        this.id_veterinario = id_veterinario;
    }
}
