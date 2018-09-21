/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.LinkedList;

/**
 *
 * @author C6-PROF
 */
public class Pilha<T> {
    private LinkedList<T>  conteudo;
    
    public Pilha(){
        conteudo = new LinkedList<>();
    }
    
    public void empilha(T novoElemento){
        conteudo.addFirst(novoElemento);
    }
    
     public T desempilha(){
        return conteudo.removeFirst();
    }
     
     public T topo(){
         return conteudo.getFirst();
     }
     
     public boolean estaVazia(){
         return conteudo.isEmpty();
     }
    
    
}
