/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

/**
 *
 * @author samuel
 */
public class Soldado extends Personaje {
    
    
    Soldado(String nombre, int fuerza){
        super(nombre, fuerza);
    }

    @Override
    public void ataqueNormal() {
        System.out.println("Disparando con fusil");
    }

    @Override
    public void ataqueEspecial() {
        System.out.println("Disparando un cohete");
    }

    @Override
    public void defensa() {
        System.out.println("Cuerpo a tierra!!!");
    }

   
    
    
    
}
