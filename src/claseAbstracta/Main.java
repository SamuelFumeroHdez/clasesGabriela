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
public class Main {
    
    public static void main(String[] args){
        
        
        Empleado directorRecursosHumanos = new Directivo("Carlos");
        Departamento recursosHumanos = new Departamento("Recursos Humanos", directorRecursosHumanos, "922642700", "rrhh@empresa.com");
        directorRecursosHumanos.setDepartamento(recursosHumanos);
        
        Empleado supervisorRecursosHumanos = new Supervisor("Beatriz");
        supervisorRecursosHumanos.setDepartamento(recursosHumanos);
        
        Empleado tecnicoRecursosHumanos = new Tecnico("Alejandro");
        tecnicoRecursosHumanos.setDepartamento(recursosHumanos);
        
        
        System.out.println(directorRecursosHumanos.realizarTarea());
        System.out.println(directorRecursosHumanos.getSalario());
        
        System.out.println("-------------------------");
        
        System.out.println(supervisorRecursosHumanos.realizarTarea());
        System.out.println(supervisorRecursosHumanos.getSalario());
        
        System.out.println("-------------------------");
        
        System.out.println(tecnicoRecursosHumanos.realizarTarea());
        System.out.println(tecnicoRecursosHumanos.getSalario());
        
      
        
    }
    
}
