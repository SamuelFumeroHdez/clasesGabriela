/**
 *
 * @author Gabriela MP
 * @version 1.0
 */
package modelo;

import controlador.Controlador;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import static modelo.Utilidades.*;

public class Modelo {
    
    private ArrayList<Vehiculo> listaVehiculos;
    
    public Modelo(ArrayList<Vehiculo> listaVehiculos){
        this.listaVehiculos = listaVehiculos;
    }
    
    
    
    /**
     * M\u00e9todo que imprime por pantalla el contenido del ArrayList pasado por par\u00e1metro
     * @return 
     */
    public ArrayList<Vehiculo> getListaVehiculos(){
        
        return !this.listaVehiculos.isEmpty() ? this.listaVehiculos : null;
    }
    
    /**
     * M\u00e9todo para crear un veh\u00edculo nuevo y añadirlo al ArrayList existente
     * @param vehiculos 
     */
    public void crearVehiculo(String marca, String matricula, int caballos, String color){
        
        this.listaVehiculos.add(new Vehiculo(marca, matricula, caballos, color));
    }
    
    public void guardarEnFichero(){
        if(!this.listaVehiculos.isEmpty()){
           try {
            FileWriter fw = new FileWriter(new File("vehiculos.txt"));
            PrintWriter pw = new PrintWriter(fw);
            for(Vehiculo v : this.listaVehiculos){
                System.out.println("Imprimiendo " + v.toString());
                pw.println(v.toString());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } 
    }
        
    }
    
    /**
     * M\u00e9todo que localiza un veh\u00edculo seg\u00fan su matr\u00edcula dentro del ArrayList
     * pasado por par\u00e1metro. En caso de no existir devuelve un null. 
     * @param vehiculos ArrayList que contiene los veh\u00edculos
     * @return Devuelve el veh\u00edculo que coincide o un null si no existe
     */
    public Vehiculo buscadorVehiculo (String matricula){
        
        for(Vehiculo car : this.listaVehiculos){
            if (car.getMatricula().equalsIgnoreCase(matricula)) {
                //encontrado = car; -Esta bien, pero recorreriamos toda la lista de vehiculos, es mas eficiente hacer return nada mas encontrar la coincidencia
                return car;
            }
        }
        return null;
        //return encontrado;
    }
    
    /**
     * M\u00e9todo que elimina un veh\u00edculo seg\u00fan la matr\u00edcula dada por el usuario
     * 
     * @param matricula
     */
    public boolean eliminarVehiculo(String matricula){
        
        /*Con una sola linea de codigo puedes hacer lo siguiente:
        - Si pudo eliminar el vehiculo, devuelves true.
        - Si no pudo eliminar el vehiculo, devuelve false.
        - Luego el controlador es el encargado de interpretar ese "true" o "false"
        */
        return this.listaVehiculos.remove(buscadorVehiculo(matricula));
    }
    
}
