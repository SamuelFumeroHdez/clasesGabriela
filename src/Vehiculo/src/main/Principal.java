/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controlador.Controlador;
import modelo.Vehiculo;
import java.util.ArrayList;
import modelo.Modelo;
import vista.Vista;
/**
 *
 * @author Gabriela MP
 */
public class Principal {
    public static void main(String[] args) {
      
        ArrayList <Vehiculo> cochecitos = new ArrayList <Vehiculo>();
        
        Modelo modelo = new Modelo(cochecitos);
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        
        vista.setControlador(controlador);
        vista.menuVehiculos();
        
        
    }
}
