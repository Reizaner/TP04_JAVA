/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp0004_lucianoaraujo;

/**
 *
 * @author Alumno
 */
public class Cliente {
    
    private String nombre;
    private int edad;
    private String sexo;
    private Boolean isEmbarazada;
    private int prioridad;

    public Cliente(String nombre, int edad, String sexo, Boolean isEmbarazada) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        setIsEmbarazada(isEmbarazada);
    }

    public Cliente() {
    }

    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Boolean getIsEmbarazada() {
        return isEmbarazada;
    }

    public void setIsEmbarazada(Boolean isEmbarazada) {
        
        if ("F".equals(getSexo()) || "f".equals(getSexo()) && getEdad() <= 45){
            this.isEmbarazada = isEmbarazada;
        }
        else{
            this.isEmbarazada = false;
        }
        
        
        
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
    
    
}
