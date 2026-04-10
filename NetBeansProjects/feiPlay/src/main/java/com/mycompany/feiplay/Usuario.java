package com.mycompany.feiplay;

public class Usuario {
    private String nome, senha;
    
    //SET
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    //GET
    public String getNome() {
        return nome;
    }
    public String getSenha() {
        return senha;
    }
}
