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
public abstract class Personaje implements IAtacar, IDefender, Cloneable, Comparable<Personaje>{
    private String nombre;
    private int fuerza;
    
    Personaje(String nombre, int fuerza){
        this.nombre = nombre;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    
    public Personaje clone() throws CloneNotSupportedException{
        return (Personaje)super.clone();
    }
    
    public int compareTo(Personaje pers){
        if(this.fuerza > pers.getFuerza()){
            return 1;
        }else if(this.fuerza == pers.getFuerza()){
            return 0;
        }else{
            return -1;
        }
    }
    
    
    
    
    
}
