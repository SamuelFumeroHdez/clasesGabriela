/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.*;
import java.util.regex.*;
import modelo.Modelo;
import modelo.Vehiculo;
import vista.Vista;

/**
 *
 * @author samuel
 */
public class Controlador {
    
    private Modelo modelo;
    private Vista vista;
    
    public Controlador(Modelo m, Vista v){
        this.modelo = m;
        this.vista = v;
    }
    
    /*GETTERS*/
    public Modelo getModelo() {
        return modelo;
    }

    public Vista getVista() {
        return vista;
    }
    
    /*SETTERS*/
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }
    
    /*Metodos CRUD*/
    public String listarVehiculos(){
        
        ArrayList<Vehiculo> listaVehiculos =  modelo.getListaVehiculos();
        
        if(listaVehiculos!=null){
            String cadenaResultado = "";
        
            for(Vehiculo v : listaVehiculos){
                cadenaResultado += v.toString();
                cadenaResultado += "\n";
            }
            return cadenaResultado;
        }else{
            return ("No existe ningun vehiculo");
        }
        
    }
    
    
    
    public void crearVehiculo(String marca, String matricula, int caballos, String color){
        
        if(matriculaValida(matricula)){
            if(modelo.buscadorVehiculo(matricula)==null){
                modelo.crearVehiculo(marca, matricula, caballos, color);
            }else{
                System.out.println("El coche con esta matricula ya existe");
            }
        }else{
            System.out.println(formatoMatriculaError());
        }
    }
    
    public String buscarVehiculo(String matricula){
        
        if(matriculaValida(matricula)){
            Vehiculo v = modelo.buscadorVehiculo(matricula);
            return v != null ? v.toString() : "No existe el vehiculo con matricula " + matricula;
        }
        
        /*Debido a que si existe un vehiculo la funcion va a acabar en el return anterior,
        no haría falta poner el else, pero se puede poner para mejorar la legibilidad del codigo
        */
        return formatoMatriculaError();
        
    }
    
    public String eliminarVehiculo(String matricula){
        if(matriculaValida(matricula)){
            return modelo.eliminarVehiculo(matricula) ? "Vehiculo eliminado" : "No se pudo eliminar el vehiculo";
        }else{
            return formatoMatriculaError();
        }
    }
    
    public String modificarVehiculo(String matricula, String parametro, Object nuevoValor){
        
        if(matriculaValida(matricula)){
            switch(parametro){
                case ("marca"):
                   modelo.buscadorVehiculo(matricula).setMarca((String) nuevoValor);
                   break;
                case ("matricula"):
                    modelo.buscadorVehiculo(matricula).setMatricula((String) nuevoValor);
                    break;
                case ("caballos"):
                    modelo.buscadorVehiculo(matricula).setCaballosVapor(Integer.parseInt((String) nuevoValor));
                    break;
                case ("color"):
                    modelo.buscadorVehiculo(matricula).setColor((String) nuevoValor);
                    break;
                default:
                    return "Parametro no valido";      
            }
            return "Parametro " + parametro + " cambiado";
        }else{
            return formatoMatriculaError();
        }
        
    }
    
    public void guardarVehiculos(){
        modelo.guardarEnFichero();
    }
    
    public String formatoMatriculaError(){
        return "La matricula debe contener 4 numeros seguidos de 3 letras";
    }
    
    public boolean matriculaValida(String matricula){
        Pattern pat =  Pattern.compile("[1-9]{4}[A-Z]{3}");
        Matcher mat = pat.matcher(matricula);
        
        return mat.matches();
    }
    
}
