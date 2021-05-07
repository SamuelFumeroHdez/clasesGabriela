
/**
 *
 * @author Gabriela MP
 */
package vista;

import controlador.Controlador;
import modelo.Vehiculo;
import java.util.ArrayList;
import java.util.Scanner;
import static modelo.Utilidades.*;
import static modelo.Modelo.*;

public class Vista {
    
    private Controlador controlador;
    
    public Vista(){
        
    }
    
    public void setControlador(Controlador c){
        this.controlador = c;
    }
    public void menuVehiculos(){
        
       int n;
        
        do {
            dibujaLineas(200);
            n = imprMenuPrincipal();
            
            switch(n){
                case 1: 
                    
                    mostrarDatos(this.controlador.listarVehiculos());
                    break;
                case 2:
                    /
                    introDatosVehiculo();
                    break;
                case 3: 
                    buscaVehiculo();
                    break;
                case 4:
                    modificarVehiculo();
                    break;
                case 5:
                    eliminaVehiculo();
                case 6:
                    guardarVehiculos();
                    break;
                case -1:
                    break;
                default:
                    System.out.println("Introduzca una opci\u00f3n v\u00e1lida.");
            }
        } while (n != -1);
        
        System.out.println("Cerrando el programa.");
    }
    
    public void mostrarDatos(String datos){
        System.out.println(datos);
    }
    
    public void introDatosVehiculo(){
        String marca, matricula, color;
        int caballos;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce marca: ");
        marca = sc.nextLine();
        
        
        System.out.println("Introduce matricula: ");
        matricula = sc.nextLine();
        
        
        System.out.println("Introduce caballos: ");
        caballos = sc.nextInt();
        sc.nextLine(); //Para limpiar el buffer
        
        System.out.println("Introduce color: ");
        color = sc.nextLine();
       
        
        controlador.crearVehiculo(marca, matricula, caballos, color);
    }
    
    public void buscaVehiculo(){
        
        System.out.println(controlador.buscarVehiculo(introMatricula()));
    }
    
    public void eliminaVehiculo(){
        
        System.out.println(controlador.eliminarVehiculo(introMatricula()));
        
    }
    
    public void modificarVehiculo(){
        String matricula = introMatricula();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca parametro a modificar: ");
        String parametro = sc.nextLine();
        
        System.out.println("Introduzca nuevo valor: ");
        Object nuevoValor = sc.nextLine();
        
        System.out.println(controlador.modificarVehiculo(matricula, parametro, nuevoValor));
        
    }
    
    public void guardarVehiculos(){
        controlador.guardarVehiculos();
    }
    
    public String introMatricula(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce matricula de vehiculo: ");
        
        return sc.nextLine();
    }
    
    public int imprMenuPrincipal (){
        int n = 0;
        
        System.out.println("Men\u00fa de opciones de la BD Veh\u00edculos.");
        dibujaLineas(200);
        
        System.out.println("¿Qu\u00e9 acci\u00f3n quiere realizar?");
        dibujaLineas(200);
        
        System.out.println("1. Mostrar listado existente.\n2. Crear un veh\u00edculo.\n"
                + "3. Buscar un veh\u00edculo.\n4. Modificar un veh\u00edculo.\n5.Eliminar un veh\u00edculo \n6. Guardar en fichero");
        
        n = introducirEntero("\nElige una opci\u00f3n o pulsa -1 para salir : ");
        
        
        
        return n;
    }
}
