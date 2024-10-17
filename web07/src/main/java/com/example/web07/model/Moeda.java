package com.example.web07.model;

public class Moeda {
    private String moeda_atual;
    private String moeda_convertida;
    private double valor;

    public Moeda(double valor, String moeda_atual, String moeda_convertida) {
        this.valor = valor;
        this.moeda_atual = moeda_atual;
        this.moeda_convertida = moeda_convertida;
    }

    public double getValorConvertido(){
        if(moeda_convertida.equalsIgnoreCase("EURO")){
            return valor / 6.0;
        }
        if(moeda_convertida.equalsIgnoreCase("DOLAR")){
            return valor / 5.0;
        }
        return valor;
    }
}
