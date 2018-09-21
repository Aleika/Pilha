/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author C6-PROF
 */
public class CalcRPN {
    Pilha<Double> aPilha;
    Pilha<Operacao> hist;
    
    public CalcRPN(){
        aPilha = new Pilha<>();
        hist = new Pilha<>();
    }
    
    public void mais() {
        Double a = aPilha.desempilha();
        Double b = aPilha.desempilha();
        Double resultado = b+a;
        aPilha.empilha(resultado);
    }
    
    public void cancela(){
        
    }
}
