package com.mycompany.aula05exe02;

public class Politico {
    protected String nome, partido, estado, funcao;
    
    public Politico(){
        
    }
    
    public Politico(String nome, String partido, String estado, String funcao){
        this.nome = nome;
        this.partido = partido;
        this.estado = estado;
        this.funcao = funcao;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPartido(String partido){
        this.partido = partido;
    }
    public void setEstado(String estado){
        this.estado = estado;
    }
    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getPartido(){
        return this.partido;
    }
    public String getEstado(){
        return this.estado;
    }
    public String getFuncao(){
        return this.funcao;
    }
    
}
