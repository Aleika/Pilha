/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica4pilha;

import java.io.IOException;

/**
 *
 * @author Ana Rute
 */
public class Pratica4 {

    /**
     * @param args the command line arguments
     */
    static void test1() {
        Pilha<Double> aPilha = new Pilha<Double>();
        aPilha.empilha(1.1);
        aPilha.empilha(2.1);
        aPilha.empilha(3.1);
        aPilha.empilha(4.1);
        aPilha.empilha(5.1);
        double valor = 0.0;
        valor = aPilha.topo();
        System.out.println("topo pilha = " + valor);
        valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor);
        valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor);
        valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor);
        valor = aPilha.topo();
        System.out.println("topo pilha = " + valor);
        valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor);
    }

    static void test2() {
        Pilha<Double> aPilha = new Pilha<Double>();
        System.out.println(aPilha);
        aPilha.empilha(1.1);
        System.out.println(aPilha);
        aPilha.empilha(2.1);
        System.out.println(aPilha);
        aPilha.empilha(3.1);
        System.out.println(aPilha);
        double valor = 0.0;
        valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor);
        System.out.println(aPilha);
        valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor);
        System.out.println(aPilha);
        valor = aPilha.desempilha();
        System.out.println("topo pilha = " + valor);
        System.out.println(aPilha);
    }

    static void test3() {
        CalcRPN calc = new CalcRPN();
        System.out.print("3 2 + = ");
        calc.aPilha.empilha(3.0);
        calc.aPilha.empilha(2.0);
        calc.mais();
        System.out.println(calc.resultado());
        calc = new CalcRPN();
        System.out.print("3 2 - = ");
        calc.aPilha.empilha(3.0);
        calc.aPilha.empilha(2.0);
        calc.menos();
        System.out.println(calc.resultado());
        calc = new CalcRPN();
        System.out.print("3 2 * = ");
        calc.aPilha.empilha(3.0);
        calc.aPilha.empilha(2.0);
        calc.vezes();
        System.out.println(calc.resultado());
        calc = new CalcRPN();
        System.out.print("3 2 / = ");
        calc.aPilha.empilha(3.0);
        calc.aPilha.empilha(2.0);
        calc.dividido();
        System.out.println(calc.resultado());
        calc = new CalcRPN();
        System.out.print("1 2 + 3 4 - / 10 3 - * = ");
        calc.aPilha.empilha(1.0);
        calc.aPilha.empilha(2.0);
        calc.mais();
        calc.aPilha.empilha(3.0);
        calc.aPilha.empilha(4.0);
        calc.menos();
        calc.dividido();
        calc.aPilha.empilha(10.0);
        calc.aPilha.empilha(3.0);
        calc.menos();
        calc.vezes();
        System.out.println(calc.resultado());
    }

    public static void main(String[] args) throws IOException {
        CalcRPN.interfaceUsuario();
    }
}


