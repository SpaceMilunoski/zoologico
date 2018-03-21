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
public class animalesPrestados {
    String Id;
    String Fecha_prestamo;
    String Fecha_devolucion;
    String Zoo_propietario;
    String Contacto;

    public animalesPrestados(JsonObject prestado) {
        this.Id = prestado.getString("Id");
        this.Fecha_prestamo = prestado.getString("Fecha_prestamo");
        this.Fecha_devolucion = prestado.getString("Fecha_devolucion");
        this.Zoo_propietario = prestado.getString("Zoo_propietario");
        this.Contacto = prestado.getString("Contacto");
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getFecha_prestamo() {
        return Fecha_prestamo;
    }

    public void setFecha_prestamo(String Fecha_prestamo) {
        this.Fecha_prestamo = Fecha_prestamo;
    }

    public String getFecha_devolucion() {
        return Fecha_devolucion;
    }

    public void setFecha_devolucion(String Fecha_devolucion) {
        this.Fecha_devolucion = Fecha_devolucion;
    }

    public String getZoo_propietario() {
        return Zoo_propietario;
    }

    public void setZoo_propietario(String Zoo_propietario) {
        this.Zoo_propietario = Zoo_propietario;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }
}
