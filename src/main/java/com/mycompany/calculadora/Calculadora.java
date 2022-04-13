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
    private double numero2;
    private double resultado;
    
    public Calculadora(){
        
    }
    
    public Calculadora(double n1,double n2){
        this.numero1 = n1;
        this.numero2 = n2;
    }
    
    public void adicao(){
        resultado = numero1 + numero2;
    }
    
    public double subtracao(){
        return (numero1 - numero2);
    }
    
    public void multiplicacao(double v1, double v2){
        resultado = v1 * v2;
    }
    
    public double divisao(){
        if(numero2 != 0)
            return(numero1 / numero2);
        else
            return 0;
    }
    
    public double potenciacao(){
        return (Math.pow(numero1, numero2));
    }
    
    public void radiciacao(){
        resultado = Math.pow(numero1,1.0/numero2);
    }

    public double getN1() {
        return numero1;
    }

    public void setN1(double n1) {
        this.numero1 = n1;
    }

    public double getN2() {
        return numero2;
    }

    public void setN2(double n2) {
        this.numero2 = n2;
    }

    public double getResultado() {
        return resultado;
    }
}
