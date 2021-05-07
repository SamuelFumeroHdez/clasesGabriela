/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaPanes;

import javax.swing.JOptionPane;

/**
 *
 * @author samuel
 */
public class Main {
    public static void main(String[] args){
        /*int edad;
        edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
        
        if(edad<18)
            JOptionPane.showMessageDialog(null, "No puedes entrar");
        else{
            JOptionPane.showMessageDialog(null, "Bienvenido");
        }*/
        
        JDialog jdialog = new JDialog();
        jdialog.introEdad();
        
    }
}
