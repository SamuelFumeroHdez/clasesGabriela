/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploMediador;

import java.util.ArrayList;

/**
 *
 * @author samuel
 */
public class Mediador implements IMediador{
    
    private ArrayList<Usuario> listaUsuarios;
    
    public Mediador(){
        this.listaUsuarios = new ArrayList<>();
    }
    
    public void agregarUsuario(Usuario usuario){
        this.listaUsuarios.add(usuario);
        usuario.setMediador(this);
    }

    @Override
    public void enviar(String mensaje, Usuario origen) {
        for(Usuario u : this.listaUsuarios){
            if(u!=origen){
                u.recibir(mensaje);
            }
        }
    }
    
}
