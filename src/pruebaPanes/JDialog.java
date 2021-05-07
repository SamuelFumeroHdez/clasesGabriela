/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaPanes;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author samuel
 */
public class JDialog{
    
    private int edad;
    
    public JDialog() {
        
    }
    
    public void introEdad(){
        edad = Integer.parseInt(JOptionPane.showInputDialog("Intro edad"));
        mostrarEdad();
    }
    
    public void mostrarEdad(){
        JOptionPane.showMessageDialog(null, "Tu edad es: " + edad);
    }
    
}
