/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import javax.json.Json;
import javax.json.JsonObject;

/**
 *
 * @author daniel
 */
public class Habitad {
    String Id;
    String Descripcion;
    String Clima;
    Float Dimencion;

    public Habitad(JsonObject jHabitad) {
        this.Id =jHabitad.getString("Id");
        this.Descripcion=jHabitad.getString("Descripcion");
        this.Clima=jHabitad.getString("Clima");
        this.Dimencion=Float.parseFloat(jHabitad.getString("Dimencion"));
        
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

    public String getClima() {
        return Clima;
    }

    public void setClima(String Clima) {
        this.Clima = Clima;
    }

    public Float getDimencion() {
        return Dimencion;
    }

    public void setDimencion(Float Dimencion) {
        this.Dimencion = Dimencion;
    }
}
