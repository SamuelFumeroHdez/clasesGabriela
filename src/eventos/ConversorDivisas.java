/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuel
 */
public class ConversorDivisas extends JFrame{
    
    private JPanel panelPrincipal;
    private JLabel etiqueta;
    private JLabel etiquetaResultado;
    private JTextField campo;
    private JComboBox comboBox;
    private JButton boton;
    
    private ArrayList<String> listaOpciones;
    
    private String nombreFichero;
    
    public ConversorDivisas(String nombreFichero){
        
        //Configuracion del marco
        super("Conversor de divisas");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        this.nombreFichero = nombreFichero;
        
        //Pintamos los componentes en el frame. Se podría hacer aquí, pero es una buena práctica modularizar lo máximo posible
        pintar();
                
        setVisible(true);
        
        ManejadorEventos manejador = new ManejadorEventos(); 
        boton.addActionListener(manejador); //Agregar listener al boton
        
        
    }
    
    public void pintar(){
        panelPrincipal = new JPanel(new FlowLayout());
        etiqueta = new JLabel("Introduzca cantidad");
        campo = new JTextField("0.0", 10);
        listaOpciones = new ArrayList<>();
        
        File fichero = new File(this.nombreFichero);
        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            
            
            String linea;
            try {
                while((linea=br.readLine())!=null){
                    this.listaOpciones.add(linea);
                }
            } catch (IOException ex) {
                Logger.getLogger(ConversorDivisas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConversorDivisas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //Agregar elementos swing al panel
        this.add(panelPrincipal);
        panelPrincipal.add(etiqueta);
        panelPrincipal.add(campo);
        
        
        //Agrupar opciones
        comboBox = new JComboBox();
    
        for(String opcion : listaOpciones){
            comboBox.addItem(opcion);
        }
        panelPrincipal.add(comboBox);
        
        boton = new JButton("Calcular");
        panelPrincipal.add(boton);
        
        etiquetaResultado = new JLabel("");
        panelPrincipal.add(etiquetaResultado);
          
    }
    
    private class ManejadorEventos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == boton){
                double valorEuro = Double.parseDouble(campo.getText());
                String opcion = comboBox.getSelectedItem().toString();
                
                String textoResultado = campo.getText() + " euros son ";
                
                switch(opcion){
                    case "Dolares": textoResultado += (String.valueOf(euroDolar(valorEuro))) + " dolares";
                    break;
                    case "Libras": textoResultado += (String.valueOf(euroLibra(valorEuro))) + " libras";
                    break;
                    case "Yuanes": textoResultado += (String.valueOf(euroYuan(valorEuro))) + " yuanes";
                    break;
                    default: etiquetaResultado.setText("ERROR!!");
                    
                }
                
                etiquetaResultado.setText(textoResultado);
            }
            
            
        }
        
    }
    
    private double euroDolar(double cantidad){
        return cantidad * 1.20;
    }
    private double euroLibra(double cantidad){
        return cantidad * 0.87;
    }
    private double euroYuan(double cantidad){
        return cantidad * 7.78;
    }
    
    public static void main(String[] args){
        ConversorDivisas conversorDivisas = new ConversorDivisas("C:\\Users\\samuel\\Documents\\NetBeansProjects\\ClasesGabriela\\src\\eventos\\opcionesConversor.txt");
    }
    
}
