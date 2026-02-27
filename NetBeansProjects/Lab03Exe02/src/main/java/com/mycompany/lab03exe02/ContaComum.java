package com.mycompany.lab03exe02;

public class ContaComum {
    protected int numero, senha;
    protected double saldo;
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setSenha(int senha){
        this.senha = senha;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public int getNumero(){
        return this.numero;
    }
    public int getSenha(){
        return this.senha;
    }
    public double getSaldo(){
        return this.saldo;
    }
    
    ContaComum(){
        this.numero = 0;
        this.senha = 0;
        this.saldo = 0;
    }
}
