package com.example.web07.model;

public class Imc {
    private double peso;
    private double altura;

    public Imc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getResultado(){
        return peso / (altura * altura);
    }
}
