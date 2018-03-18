/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;


import javax.json.Json;
import javax.json.JsonObject;
import java.sql.Date;

/**
 *
 * @author daniel
 */
public class Cuidadores {
    String id;
    String Nombre;
    String Apellidos;
    String Nacionalidad;
    String Telefono;
    String Estatus;
    String Fecha_ingreso;

    public Cuidadores(JsonObject cuidador) {
        this.id = cuidador.getString("Id");
        this.Nombre = cuidador.getString("Nombre");
        this.Apellidos = cuidador.getString("Apellidos");
        this.Nacionalidad = cuidador.getString("Nacionalidad");
        this.Telefono = cuidador.getString("Telefono");
        this.Estatus = cuidador.getString("Estatus");
        this.Fecha_ingreso = cuidador.getString("Fecha_ingreso");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

    public String getFecha_ingreso() {
        return Fecha_ingreso;
    }

    public void setFecha_ingreso(String Fecha_ingreso) {
        this.Fecha_ingreso = Fecha_ingreso;
    }
    
}
