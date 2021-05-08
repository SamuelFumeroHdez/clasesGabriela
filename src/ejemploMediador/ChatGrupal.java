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
public class ChatGrupal {
    
    public static void main(String[] args){
        Mediador mediador = new Mediador();
        
        Usuario usuario1 = new Usuario("Gabriela");
        Usuario usuario2 = new Usuario("Samuel");
        Usuario usuario3 = new Usuario("Ana");
        
        mediador.agregarUsuario(usuario1);
        mediador.agregarUsuario(usuario2);
        mediador.agregarUsuario(usuario3);
        
        usuario1.comunicar("Hola!!");
        usuario2.comunicar("Hola a todos!!");
    }
    
}
