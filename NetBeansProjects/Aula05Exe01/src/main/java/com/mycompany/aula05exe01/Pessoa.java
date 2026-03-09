package com.mycompany.aula05exe01;

public class Pessoa {
    protected String nome, sobrenome;
    protected int idade;
    
    public Pessoa(){
        
    }
    
    public Pessoa(String nome, String sobrenome, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome =  sobrenome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public int getIdade(){
        return this.idade;
    }
}
