/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculadora;

/**
 *
 * @author lucas
 */
public class Calculadora {
    
    private double n1;
    private double n2;
    private double resultado;
    
    public Calculadora(){
        
    }
    
    public Calculadora(double n1,double n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public void adicao(){
        resultado = n1 + n2;
    }
    
    public double subtracao(){
        return (n1 - n2);
    }
    
    public void multiplicacao(double v1, double v2){
        resultado = v1 * v2;
    }
    
    public double divisao(){
        if(n2 != 0)
            return(n1 / n2);
        else
            return 0;
    }
    
    public double potenciacao(){
        return (Math.pow(n1, n2));
    }
    
    public void radiciacao(){
        resultado = Math.pow(n1,1.0/n2);
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getResultado() {
        return resultado;
    }
}
