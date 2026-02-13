package com.mycompany.aula02exe01;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    
    void setNome(String nome){
        this.nome = nome;
    }
    void setCpf(String cpf){
        this.cpf = cpf;
    }
    void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public int getIdade(){
        return this.idade;
    }
}
