package com.mycompany.aula04exe04;

public class ContaCorrente {
    private double saldo;
    
    ContaCorrente(double saldo){
        this.saldo = saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void sacar(double valor){
        if(valor > 0){
            this.saldo -= valor;
        }
    }
    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }
    }
    
    @Override
    public String toString(){
        return "Saldo: " + this.saldo;
    }
}
