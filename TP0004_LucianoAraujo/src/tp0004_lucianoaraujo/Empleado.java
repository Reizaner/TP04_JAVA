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
public class Empleado extends Cliente{
    
    private Boolean isEmpleado;

    public Empleado(String nombre, int edad, String sexo, Boolean isEmbarazada) {
        super(nombre, edad, sexo, isEmbarazada);
        this.isEmpleado = true;
    }

    public Empleado() {
    }

    
    
    public Boolean getIsEmpleado() {
        return isEmpleado;
    }
    
    
}
