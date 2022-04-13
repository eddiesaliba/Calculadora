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
    
    private double numero1;
    private double n2;
    private double res;
    
    public Calculadora(){
        
    }
    
    public Calculadora(double n1,double n2){
        this.numero1 = n1;
        this.n2 = n2;
    }
    
    public void adicao(){
        res = numero1 + n2;
    }
    
    public double subtracao(){
        return (numero1 - n2);
    }
    
    public void multiplicacao(double v1, double v2){
        res = v1 * v2;
    }
    
    public double divisao(){
        if(n2 != 0)
            return(numero1 / n2);
        else
            return 0;
    }
    
    public double potenciacao(){
        return (Math.pow(numero1, n2));
    }
    
    public void radiciacao(){
        res = Math.pow(numero1,1.0/n2);
    }

    public double getN1() {
        return numero1;
    }

    public void setN1(double n1) {
        this.numero1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getResultado() {
        return res;
    }
}
