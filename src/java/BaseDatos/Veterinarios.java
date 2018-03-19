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
public class Veterinarios {
    int id;
    String nombre;
    String apellidos;
    String especialidad;
    String f_ingreso;
    String salario;
    
    public Veterinarios (JsonObject veterinario){
        this.id = veterinario.getInt("Id");
        this.nombre = veterinario.getString("Nombre");
        this.apellidos = veterinario.getString("Apellidos");
        this.especialidad = veterinario.getString("Especialidad");
        this.f_ingreso = veterinario.getString("F_ingreso");
        this.salario = veterinario.getString("Salario");
    }
    //-------------------------------------------
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    //-------------------------------------------
    public String getNombre(){
        return nombre;
    }
    public void setId(String nombre){
        this.nombre = nombre;
    }
    //-------------------------------------------
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    //-------------------------------------------
    public String getEspecialidad(){
        return especialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    //-------------------------------------------
    public String getFechaIngreso(){
        return f_ingreso;
    }
    public void setFechaIngreso(String f_ingreso){
        this.f_ingreso = f_ingreso;
    }
    //-------------------------------------------
    public String getSalario(){
        return salario;
    }
    public void setSalario(String salario){
        this.salario = salario;
    }
}
