/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica4pilha;

import java.util.LinkedList;

/**
 *
 * @author Ana Rute
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
        if(this.estaVazia()){
            throw new Error("Pilha vazia");
        }else{
            return conteudo.removeFirst();
        }
    }
     
     public T topo(){
         if(this.estaVazia()){
            throw new Error("Pilha vazia");
        }else{
            return conteudo.getFirst();
        }
     }
     
     public boolean estaVazia(){
         return conteudo.isEmpty();
     }
     
     public String toString(){
        return conteudo.toString();
     }
     
     public void reinicialize(){
         conteudo.clear();
     }
     
     public String toStringInverse(){
         Pilha p1 = new Pilha();
         Pilha p2 = new Pilha();
         p1.conteudo = this.conteudo;
         while(!p1.estaVazia()){
             p2.empilha(p1.topo());
             p1.desempilha();
         }
         return p2.toString();
     }
    
    
}
