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
public class Animales {
    int id;
    String nombre;
    String especie;
    String pais_origen;
    String estatus;
    float peso;
    float altura;
    String dieta;
    String sexo;
    String nivel_riesgo;
    int id_habitad;
    int pres_prop;
    
    public Animales(JsonObject animal){
        this.id = animal.getInt("Id");
        this.nombre = animal.getString("Animal");
        this.especie = animal.getString("Especie");
        this.pais_origen = animal.getString("Pais_origen");
        this.estatus = animal.getString("Estatus");
        this.peso = animal.getInt("Peso");
        this.altura = animal.getInt("Altura");
        this.dieta = animal.getString("Dieta");
        this.sexo = animal.getString("Sexo");
        this.nivel_riesgo = animal.getString("Nivel_riesgo");
        this.id_habitad = animal.getInt("Id_habitad");
        this.pres_prop = animal.getInt("Pres_prop");
    }
    
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    //-------------------------------------
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    //-------------------------------------
    public String getEspecie(){
        return especie;
    }
    public void setEspecie(String especie){
        this.especie = especie;
    }
    //-------------------------------------
    public String getPaisOrigen(){
        return pais_origen;
    }
    public void setPaisOrigen(String pais_origen){
        this.pais_origen = pais_origen;
    }
    //-------------------------------------
    public String getEstatus(){
        return estatus;
    }
    public void setEstatus(String estatus){
        this.estatus = estatus;
    }
    //-------------------------------------
    public float getPeso(){
        return peso;
    }
    public void setPeso(float peso){
        this.peso = peso;
    }
    //-------------------------------------
    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    //-------------------------------------
    public String getDieta(){
        return dieta;
    }
    public void setDieta(String dieta){
        this.dieta = dieta;
    }
    //-------------------------------------
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    //-------------------------------------
    public String getNivelRiesgo(){
        return nivel_riesgo;
    }
    public void setNivelRiesgo(String nivel_riesgo){
        this.nivel_riesgo = nivel_riesgo;
    }
    //-------------------------------------
    public int getIDHabitad(){
        return id_habitad;
    }
    public void setIDHabitad(int id_habitad){
        this.id_habitad = id_habitad;
    }
    //-------------------------------------
    public int getPresProp(){
        return pres_prop;
    }
    public void setPresProp(int pres_prop){
        this.pres_prop = pres_prop;
    }
}
