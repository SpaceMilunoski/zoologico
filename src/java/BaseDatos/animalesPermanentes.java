/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import javax.json.JsonObject;

/**
 *
 * @author daniel
 */
public class animalesPermanentes {
    String Id;
    String Descripcion;
    String Fecha_add;
    String estado;

    public animalesPermanentes(JsonObject permanentes) {
        this.Id = Id;
        this.Descripcion = Descripcion;
        this.Fecha_add = Fecha_add;
        this.estado = estado;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFecha_add() {
        return Fecha_add;
    }

    public void setFecha_add(String Fecha_add) {
        this.Fecha_add = Fecha_add;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
