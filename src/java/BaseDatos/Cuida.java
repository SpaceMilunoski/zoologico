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
public class Cuida {
    String Id;
    String Id_cuidador;
    String Id_animal;
    String Turno;
    String Fecha;

    public Cuida(JsonObject cuida) {
        this.Id = cuida.getString("Id");
        this.Id_cuidador = cuida.getString("Id_cuidador");
        this.Id_animal = cuida.getString("Id_animal");
        this.Turno = cuida.getString("Turno");
        this.Fecha = cuida.getString("Fecha");
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getId_cuidador() {
        return Id_cuidador;
    }

    public void setId_cuidador(String Id_cuidador) {
        this.Id_cuidador = Id_cuidador;
    }

    public String getId_animal() {
        return Id_animal;
    }

    public void setId_animal(String Id_animal) {
        this.Id_animal = Id_animal;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
}
