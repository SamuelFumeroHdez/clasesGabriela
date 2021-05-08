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
public class Mago extends Personaje implements Cloneable{
    
    
    Mago(String nombre, int fuerza){
        super(nombre, fuerza);
    }

    @Override
    public void ataqueNormal() {
        System.out.println("Lanzar hechizo");
    }

    @Override
    public void ataqueEspecial() {
        System.out.println("Hacer desaparecer!!!");
    }

    @Override
    public void defensa() {
        System.out.println("Crear escudo");
    }
    
    
    
}
