package com.example.web07.model;

public class FolhaPagamento {
    private double salarioBruto;
    private double descontoInss;
    private double descontoIr;

    public FolhaPagamento(double salarioBruto,
                          double descontoInss,
                          double descontoIr) {
        this.salarioBruto = salarioBruto;
        this.descontoInss = descontoInss;
        this.descontoIr = descontoIr;
    }

    public double getSalarioLiquido(){
        return salarioBruto - descontoInss - descontoIr;
    }



}
