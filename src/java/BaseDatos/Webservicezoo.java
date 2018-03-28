/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
//import com.google.gson.Gson;
import BaseDatos.*;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.json.Json;
import com.google.gson.Gson;
import javax.json.JsonObject;
import javax.mail.Message;
import jdk.nashorn.internal.parser.JSONParser;

/**
 *
 * @author daniel
 */
@WebService(serviceName = "Webservicezoo")
public class Webservicezoo {
    //////////////////////////////////////////////////////////////////////////////////////////////
    CrudVeterinarios crudv = new CrudVeterinarios();
    
    CrudCuidadores crud = new CrudCuidadores();
    @WebMethod(operationName = "IngresarCuidadores")
    public String IngresarCuidadores(@WebParam(name = "jsonCuidadores") String jsonCuidadores) {        
        JsonObject cuidador =  Json.createReader(new StringReader(jsonCuidadores)).readObject();
        Cuidadores cuidadores=new Cuidadores(cuidador);
        try {
            crud.insertarCuidadores(cuidadores);
            return "Se a agregado con exito";
        } catch (Exception e) {
            return null;
        }
    }

    @WebMethod(operationName = "eliminarCuidadores")
    public String eliminarCuidadores(@WebParam(name = "Id") String Id) {
        //TODO write your implementation code here:
        try {
            crud.eliminarCuidador(Id);
            return "Exito";
        } catch (Exception e) {
            return null;
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////////////
    crudHabitad cHabitad = new crudHabitad();
    @WebMethod(operationName = "agregarHabitad")
    public String agregarHabitad(@WebParam(name = "jsonHabitad") String jsonHabitad) {
        //TODO write your implementation code here:
        JsonObject habitadj = Json.createReader(new StringReader(jsonHabitad)).readObject();
        Habitad habitad = new Habitad(habitadj);
        
        try {
            cHabitad.insertarHabitad(habitad);
        } catch (Exception e) {
        }
        return null;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////
    crudPrestados_Permanentes cpp = new crudPrestados_Permanentes();
    @WebMethod(operationName = "Prestados")
    public String Prestados(@WebParam(name = "jPrestados") String jPrestados) {
        JsonObject jprestados = Json.createReader(new StringReader(jPrestados)).readObject();
        animalesPrestados prestados = new animalesPrestados(jprestados);
        try {
            cpp.insertarPrestados(prestados);
        } catch (Exception e) {
        }
        return null;
    }

    @WebMethod(operationName = "Permanentes")
    public String Permanentes(@WebParam(name = "jPermanentes") String jPermanentes) {
        JsonObject jpermanentes = Json.createReader(new StringReader(jPermanentes)).readObject();
        animalesPermanentes permanentes = new animalesPermanentes(jpermanentes);
        try {
            cpp.insertarPermanentes(permanentes);
        } catch (Exception e) {
        
        }
        return null;
    }
    
    @WebMethod(operationName = "eliminarPermanetes")
    public String eliminarPermanetes(@WebParam(name = "Id") String Id) {
        //TODO write your implementation code here:
        try {
            cpp.eliminarPermanentes(Id);
        } catch (Exception e) {
        }
        return null;
    }
    
    @WebMethod(operationName = "eliminarPrestados")
    public String eliminarPrestados(@WebParam(name = "Id") String Id) {
        //TODO write your implementation code here:
        try {
            cpp.eliminarPrestados(Id);
        } catch (Exception e) {
        }
        return null;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////
    CrudCuidadores ccuida = new CrudCuidadores();
    @WebMethod(operationName = "agregarCuida")
    public String agregarCuida(@WebParam(name = "jCuidadores") String jCuidadores) {
        //TODO write your implementation code here:
        return null;
    }
    
    @WebMethod(operationName = "eliminarCuida")
    public String eliminarCuida(@WebParam(name = "Id") String Id) {
        //TODO write your implementation code here:
        return null;
    }
    
    @WebMethod(operationName = "consultaCuidadores")
    public String consultaCuidadores() {
        ResultSet rsCuidadores;
        ArrayList<Cuidadores> alCuidadores= new ArrayList<Cuidadores>();
        try{
            rsCuidadores = crud.Cuidadores();
            while(rsCuidadores.next()){
                String cuidadorstring="{\"Id\":\""+rsCuidadores.getString("id")+"\",\"Nombre\":\""+rsCuidadores.getString("nombre")+"\",\"Apellidos\":\""+rsCuidadores.getString("apellidos")+"\",\"Nacionalidad\":\""+rsCuidadores.getString("nacionalidad")+"\",\"Telefono\":\""+rsCuidadores.getString("telefono")+"\",\"Estatus\":\""+rsCuidadores.getString("estatus")+"\",\"Fecha_ingreso\":\""+rsCuidadores.getString("fecha_ingreso")+"\"}";
                JsonObject cuidadorjson =Json.createReader(new StringReader(cuidadorstring)).readObject();
                alCuidadores.add(new Cuidadores(cuidadorjson));
            }
        }catch(Exception e){
           
        }
        Gson gson = new Gson();
        String formatoJSON = gson.toJson(alCuidadores);
        return formatoJSON;
    }
    
    @WebMethod(operationName = "agregarRevisiones")
    public String agregarRevisiones(@WebParam(name = "revisionesj") String revisionesj) {
        //TODO write your implementation code here:
        return null;
    }
    
    @WebMethod(operationName = "eliminarRevision")
    public String eliminarRevision(@WebParam(name = "Id") String id) {
        //TODO write your implementation code here:
        return null;
    }
    
    @WebMethod(operationName = "consultarHabitads")
    public String consultarHabitads() {
        ArrayList<Habitad> alHabitads= new ArrayList<Habitad>();
        try{   
            ResultSet rsHabitads = cHabitad.Habitad();
            while(rsHabitads.next()){
            String habitadstring="{\"Id\":\""+rsHabitads.getString("id")+
                                   "\",\"Descripcion\":\""+rsHabitads.getString("descripcion")+
                                    "\",\"Clima\":\""+rsHabitads.getString("clima")+
                                    "\",\"Dimension\":\""+rsHabitads.getFloat("dimension")+"\"}";
                JsonObject habitadsjson =Json.createReader(new StringReader(habitadstring)).readObject();
                alHabitads.add(new Habitad(habitadsjson));
            }
        }catch(Exception e){
           
        }
        Gson gson = new Gson();
        String formatoJSON = gson.toJson(alHabitads);
        return formatoJSON;
    }


    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarAnimales")
    public String consultarAnimales() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarRevisiones")
    public String consultarRevisiones() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarVeterinarios")
    public String consultarVeterinarios() {
        ResultSet rsVeterinarios;
        ArrayList<Veterinarios> alVeterinarios= new ArrayList<Veterinarios>();
        try{
            rsVeterinarios = crudv.Veterinarios();
            while(rsVeterinarios.next()){
                String veterinariostring="{\"Id\":\""+rsVeterinarios.getString("id")+"\",\"Nombre\":\""+rsVeterinarios.getString("nombre")+"\",\"Apellidos\":\""+rsVeterinarios.getString("apellidos")+"\",\"Especialidad\":\""+rsVeterinarios.getString("especialidad")+"\",\"Fecha de ingreso\":\""+rsVeterinarios.getString("f_ingreso")+"\",\"Salario\":\""+rsVeterinarios.getString("salario")+"\"}";
                JsonObject veterinariojson =Json.createReader(new StringReader(veterinariostring)).readObject();
                alVeterinarios.add(new Veterinarios(veterinariojson));
            }
        }catch(Exception e){
           
        }
        Gson gson = new Gson();
        String formatoJSON = gson.toJson(alCuidadores);
        return formatoJSON;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "consultarCuidados")
    public String consultarCuidados() {
        //TODO write your implementation code here:
        return null;
    }

}
