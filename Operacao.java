/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica4pilha;

/**
 *
 * @author Ana Rute
 */
public class Operacao {
    private char code;
    private double a, b;

    public Operacao(char code, double a, double b) {
        this.code = code;
        this.a = a;
        this.b = b;
    }

    public Operacao(double a) {
        this.code = 'e';
        this.a = a;
    }
        
    public String toString(){
        if(code=='e'){
            return String.valueOf(this.a);
        }else{
            return String.valueOf(this.code);
        }
    }
    
    public char getCode() {
        return code;
    }

    public void setCode(char code) {
        this.code = code;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
