/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

import java.util.*;

/**
 *
 * @author samuel
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        
        Personaje soldado1 = new Soldado("Samuel", 100);
        Personaje mago1 = new Mago("Gabriela", 150);
        
        soldado1.ataqueNormal();
        mago1.defensa();
        
        mago1.ataqueEspecial();
        soldado1.defensa();
        
        Personaje mago2 = (Personaje) mago1.clone();
        System.out.println(mago2.getNombre());
        
        System.out.println(soldado1.compareTo(mago2));
        
        ArrayList<Personaje> soldados = new ArrayList<>();
        
        for(int i=0 ; i<20 ; i++){
            soldados.add(new Soldado("soldado " + i, (int) Math.floor(Math.random()*(100-500+1)+500)));
        }
        
        for(Personaje s : soldados){
            System.out.println(s.getNombre() + " - " +  s.getFuerza());
        }
        
        ArrayList<Personaje> soldadosDebiles = new ArrayList<>();
        
        soldados.stream()
                .filter(soldado -> soldado.getFuerza() < 250)
                .forEach((t) -> {
                    System.out.println(t.getNombre() + " - " +  t.getFuerza());
                });
        
        /*for(Personaje s : soldados){
            System.out.println(s.getNombre() + " - " +  s.getFuerza());
        }*/
        
    }
}
