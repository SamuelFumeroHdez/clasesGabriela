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
public abstract class Empleado {
    protected int salario;
    protected Departamento departamento;
    private String nombre;
    
    Empleado(String nombre){
        this.nombre = nombre;
    }
    
    /*
    Los métodos abstractos deben ser desarrollados en las clases que hereden
    de la clase abstraca
    */
    public abstract String getSalario();
    public abstract String realizarTarea();
    
    /*
    Estos métodos ya están implicitamente en las clases hijas
    */
    public Departamento getDepartamento(){
       return this.departamento;
    }
    
    public void setDepartamento(Departamento departamento){
       this.departamento = departamento;
    }
    
   
}

class Directivo extends Empleado{
    
    private Departamento departamento;
    
    Directivo(String nombre){
        super(nombre);
        
        this.salario = 5000;
    }

    @Override
    public String getSalario() {
        return "Tengo un gran salario de mas de " + this.salario + " euros";
    }

    @Override
    public String realizarTarea() {
        return "Estoy gestionando el departamento de " + this.getDepartamento().getNombre();
    }
    
    
            
}

class Supervisor extends Empleado{
    
    
    
    Supervisor(String nombre){
        super(nombre);
        
        this.salario = 3000;
    }

    @Override
    public String getSalario() {
        return "Tengo un salario bueno de mas de " + this.salario + " euros";
    }

    @Override
    public String realizarTarea() {
        return "Estoy supervisando el trabajo de los empleados del departamento de " + this.getDepartamento().getNombre();
    }

            
}

class Tecnico extends Empleado{
    
    
    
    Tecnico(String nombre){
        super(nombre);
        
        this.salario = 1500;
    }
    
    @Override
    public String getSalario() {
        return "Tengo un salario mediocre de " + this.salario + " euros";
    }

    @Override
    public String realizarTarea() {
        return "Estoy haciendo un trabajo duro en el departamento de " + this.getDepartamento().getNombre();
    }
            
}






