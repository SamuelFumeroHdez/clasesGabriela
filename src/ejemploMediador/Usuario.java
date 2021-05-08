/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploMediador;

/**
 *
 * @author samuel
 */
public class Usuario {
    private IMediador mediador;
    private String nombre;
    
    public Usuario(String nombre){
        this.nombre = nombre;
    }
    
    public IMediador getMediador(){
        return this.mediador;
    }
    
    public void setMediador(IMediador mediador){
        this.mediador = mediador;
    }
    
    public void comunicar(String mensaje){
        this.getMediador().enviar(mensaje, this);
    }
    
    public void recibir(String mensaje){
        System.out.println("Mensaje para " + this.nombre + ": " + mensaje);
    }
    
}
