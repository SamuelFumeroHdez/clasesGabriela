package modelo;

import java.io.*;
import java.util.Scanner;

/**
 * @author Gabriela Mercado
 * @version 1.0
 */
public class Utilidades {

    /**
     *M\u00e9todo para pedir un String por teclado al usuario
     * @param texto Texto que se imprimir\u00e1o por pantalla con las indicaciones para el usuario
     * @return Devuelve la cadena introducida por teclado
     */
    
    public static String introducirString (String texto){
        String cadena;
        Scanner teclado = new Scanner (System.in);
        System.out.print (texto);
        cadena = teclado.nextLine();
        
        return cadena;
    }
    
    /**
     *  M\u00e9todo que lee un n\u00famero por teclado y devuelve el valor introducido
     * @param texto Texto que se imprimir\u00e1p por pantalla
     * @return Devuelve el valor del n\u00famero introducido por teclado
     */
    public static int introducirEntero (String texto){
    int n;
        Scanner teclado = new Scanner (System.in);
        System.out.print (texto);
        n = teclado.nextInt();
        
    return n;
    }
    
    /**
     * M\u00e9todo para imprimir por pantalla sin salto de l\u00ednea
     * @param texto Texto que ser\u00e1 impreso por pantalla
     */
    public static void impr(String texto){
        System.out.print (texto);
    }
    
    /**
     * M\u00e9todo que imprime por pantalla texto con salto de l\u00ednea
     * @param texto Texto que ser\u00e1 impreso por pantalla
     */
    public static void imprln(String texto){
        System.out.println (texto);
    }
    
    /**
     * M\u00e9todo para dibujar l\u00edneas o separadores con un tama\u00f1o pasado por par\u00e1metro
     * @param n Tama\u00f1o que tendr\u00e1 la l\u00ednea
     */
    public static void dibujaLineas(int n){
        
        for (int i = 0; i <= n; i++) {
            impr("-");
        }
        System.out.println();
    }
    
    /**
     * M\u00e9todo para crear un Array seg\u00fan un determinado tama\u00f1o
     * @param size Tama\u00f1o que tendr\u00e1 el array
     * @return Devuelve el array creado
     */
    public static String [] crearArray(int size){
        String [] array = new String[size];
    return array;
    }
    
    /**
     * M\u00e9todo que guarda las l\u00edneas de un documento en un array
     * @param ruta Ruta donde se encuentra el fichero a guardar en el array
     * @return Devuelve el array con el contenido del fichero
     * @throws FileNotFoundException Excepci\u00f3n que puede darse
     * @throws IOException Excepci\u00f3n que puede darse
     */
    public static String[] file2Array(String ruta) throws FileNotFoundException, IOException{
        
        BufferedReader convertir = new BufferedReader(new FileReader(ruta));
        
        int contador=0;
        String line = convertir.readLine();
        //contador con cantidad de lineas
        
        while(line != null) {
            contador++;
            line = convertir.readLine();
        }
        
        convertir = new BufferedReader (new FileReader(ruta));
        String [] miArray = crearArray(contador);
        
        for (int i = 0; i < miArray.length; i++) {
            line = convertir.readLine();
            miArray[i]=line;
            System.out.println(miArray[i]);
        }
        
        
        convertir.close();
        return miArray;
    }
    
    /**
     * M\u00e9todo que escribe el contenido de un array en un fichero
     * @param array Array cuyo contenido se guarda en el fichero
     * @param ruta Ruta donde se encuentra el fichero en el que escribir
     */
    public static void array2File(String [] array, String ruta){
        
        try {
            BufferedWriter escribir = new BufferedWriter (new FileWriter(ruta,true));
            
            for (int i = 0; i < array.length; i++) {
                escribir.write(array[i]);
                escribir.newLine();
            }
            
            escribir.close();
                
        } catch (IOException ex) {
            System.out.println("Ha ocurrido un error: "+ex);
        }
    
    }
    
    /**
     *M\u00e9todo que pide al usuario una ruta de un fichero o directori
     * @return Devuelve la ruta que se ha introducido por teclado
     */
    public static String pedirRutaDefault(){
        String ruta;
            Scanner teclado = new Scanner (System.in);
            System.out.print ("Introduza la ruta a procesar: ");
            ruta = teclado.nextLine();

        return ruta;
    }
    
    public static String pedirRutaAgain (){
        String ruta;
            Scanner teclado = new Scanner (System.in);
            System.out.print ("Introduza una ruta v\u00e1lida: ");
            ruta = teclado.nextLine();

        return ruta;
    }
    
    /**
     * M\u00e9todo main donde se comprueba el funcionamiento de los m\u00e9todos y funciones
     * @param args Argumentos del main
     */
    public static void main(String[] args) {
       String ruta = "C:\\Users\\Usuario\\Desktop\\Pruebas\\codigo.txt";
       String ruta2 = "C:\\Users\\Usuario\\Desktop\\Pruebas\\documento.txt";
      
        try {
            System.out.println("El siguiente contenido se guardar\u00e1 en el fichero: ");
            array2File(file2Array(ruta),ruta2);
        } catch (IOException ex) {
            System.out.println("Ha ocurrido un error: "+ex);
        }
    }
    
}

