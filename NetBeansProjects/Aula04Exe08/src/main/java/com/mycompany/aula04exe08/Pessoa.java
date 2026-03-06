package com.mycompany.aula04exe08;

public class Pessoa {
    private String nome, telefone;
    private int id, proximoId;
    
    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        this.proximoId++;
        this.id = proximoId;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getTelefone(){
        return this.telefone;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome + 
               " Telefone: " + this.telefone + 
               " ID: " + this.id;
    }
}
