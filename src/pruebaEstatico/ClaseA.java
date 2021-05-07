/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaEstatico;

/**
 *
 * @author samuel
 */
public class ClaseA {
    private int atr1;
    private int atr2;
    
    ClaseA(int atr1, int atr2){
        this.atr1 = atr1;
        this.atr2 = atr2;
    }

    public void getAtr1() {
        System.out.println("Atr1: " + this.atr1);
    }

    public void getAtr2() {
        System.out.println("Atr2: " + this.atr2);
    }
    
    public static void metodoDeClase(){
        System.out.println("Esto es un metodo de clase");
    }
}
