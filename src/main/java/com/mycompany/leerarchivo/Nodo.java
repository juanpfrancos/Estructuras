/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basico.arbolbinario;

/**
 *
 * @author Julian
 */
public class Nodo {
   private int dato;
    private Nodo izquierda, derecha;
    
    public Nodo(int dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;

    }

    Nodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public int getDato() {
        return dato;

    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

}
