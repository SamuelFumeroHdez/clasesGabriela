/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseAbstracta;

/**
 *
 * @author samuel
 */
public class Departamento {
    
    private String nombre;
    private Empleado jefe;
    private String telefono;
    private String correo;
    
    Departamento(String nombre, Empleado jefe, String telefono, String correo){
        this.nombre = nombre;
        this.jefe = jefe;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    //GETTERS
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Empleado getJefe(){
        return this.jefe;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public String getCorreo(){
        return this.correo;
    }
    
    
    //SETTERS
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setJefe(Empleado jefe){
        this.jefe = jefe;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    
    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    
}
