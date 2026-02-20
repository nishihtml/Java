package com.mycompany.lab02exe03;

public class Funcionario {
    private String nome, sobrenome;
    private double salario;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public double getSalario(){
        return this.salario;
    }
}
