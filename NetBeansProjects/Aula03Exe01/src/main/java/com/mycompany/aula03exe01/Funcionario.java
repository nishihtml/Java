package com.mycompany.aula03exe01;

public class Funcionario {
    private String nome, sobrenome, sexo;
    private double salarioMensal;
    private int idade, numero;
    
    public Funcionario(){
        nome = "NULL";
        sobrenome = "NULL";
        sexo = "NULL";
        numero = 0;
        salarioMensal = 0;
        idade = 0;
    }
    
    public Funcionario(String nome, String sobrenome, String sexo, 
                       int idade, int numero, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.idade = idade;
        this.numero = numero;
        this.salarioMensal = salarioMensal;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void setIdade(int idade){
        if(idade >= 0){
            this.idade = idade;
        }else{
            this.idade = 0;    
        }
    }
    public void setNumero(int numero){
        if(numero >= 0 && numero <= 99999){
            this.numero = numero;
        }else{
            this.numero = numero;    
        }
    }
    public void setSalarioMensal(double salarioMensal){
        if(salarioMensal >= 0){
            this.salarioMensal = salarioMensal;
        }else{
            this.salarioMensal = 0;    
        }
    }
    
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public String getSexo(){
        return sexo;
    }
    public int getIdade(){
        return idade;
    }
    public int getNumero(){
        return numero;
    }
    public double getSalarioMensal(){
        return salarioMensal;
    }
}

