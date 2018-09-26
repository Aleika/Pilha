/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica4pilha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ana Rute
 */
public class CalcRPN {

    Pilha<Double> aPilha;
    Pilha<Operacao> hist;

    public CalcRPN() {
        aPilha = new Pilha<>();
        hist = new Pilha<>();
    }

    public void mais() {
        Double a = aPilha.desempilha();
        Double b = aPilha.desempilha();
        Double resultado = b + a;
        aPilha.empilha(resultado);
        Operacao op = new Operacao('+',a,b);
        hist.empilha(op);
    }

    public void menos() {
        Double a = aPilha.desempilha();
        Double b = aPilha.desempilha();
        Double resultado = b - a;
        aPilha.empilha(resultado);
        Operacao op = new Operacao('-',a,b);
        hist.empilha(op);
    }

    public void vezes() {
        Double a = aPilha.desempilha();
        Double b = aPilha.desempilha();
        Double resultado = b * a;
        aPilha.empilha(resultado);
        Operacao op = new Operacao('*',a,b);
        hist.empilha(op);
    }

    public void dividido() {
        Double a = aPilha.desempilha();
        Double b = aPilha.desempilha();
        Double resultado = b / a;
        aPilha.empilha(resultado);
        Operacao op = new Operacao('/',a,b);
        hist.empilha(op);
    }

    public Double resultado() {
        return aPilha.topo();
    }

    void exec(String cmd) {
        double x;
        switch (cmd) {
            case "+":
                this.mais();
                break;
            case "-":
                this.menos();
                break;
            case "*":
                this.vezes();
                break;
            case "/":
                this.dividido();
                break;
            case "clear":
                aPilha.reinicialize();
                break;
            case "hist":
                System.out.println("Historico: " + hist.toStringInverse());
                break;
            case "undo":
                this.cancela();
                System.out.println("Historico: " + hist.toStringInverse());
                break;
            default:
                x = Double.parseDouble(cmd);
                aPilha.empilha(x);
                Operacao op = new Operacao(x);
                hist.empilha(op);
                break;
        }
    }

    public static void interfaceUsuario() throws IOException {
        CalcRPN calc = new CalcRPN();
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while ((line = reader.readLine()) != null) {
            if (line.isEmpty()) {
                continue;
            }
            for (String s : line.split(" ")) {
                calc.exec(s);
            }
            System.out.println("Pilha = " + calc.aPilha);
        }
        System.out.println("Ate logo");
    }

    public void cancela() {
        Operacao aux = hist.topo();
        if(aux.getCode()=='e'){
            aPilha.desempilha();
            hist.desempilha();
        }else{
            aPilha.desempilha();
            aPilha.empilha(hist.topo().getB());
            aPilha.empilha(hist.topo().getA());
            hist.desempilha();
        }
    }
}
