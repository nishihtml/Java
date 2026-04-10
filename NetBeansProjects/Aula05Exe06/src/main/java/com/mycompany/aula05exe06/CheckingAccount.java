package com.mycompany.aula05exe06;

public class CheckingAccount extends Account {
    private double taxaTransacao;

    public CheckingAccount(double taxaTransacao, double salario) {
        super(salario);
        this.taxaTransacao = taxaTransacao;
    }

    public double getTaxaTransacao() {
        return taxaTransacao;
    }

    public void setTaxaTransacao(double taxaTransacao) {
        this.taxaTransacao = taxaTransacao;
    }

    @Override
    public void debit(double salario) {
        if(salario <= this.salario * taxaTransacao){
            super.salario = super.salario - (salario * taxaTransacao);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void credit(double salario) {
        super.salario = super.salario + (salario*(1 - taxaTransacao));
    }
            
            
}
