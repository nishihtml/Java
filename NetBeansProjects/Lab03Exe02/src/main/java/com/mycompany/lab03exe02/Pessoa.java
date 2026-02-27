package com.mycompany.lab03exe02;

public class Pessoa {
    protected String nome, endereco;
    protected double renda;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setRenda(double renda){
        this.renda = renda;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public double getRenda(){
        return this.renda;
    }
}
