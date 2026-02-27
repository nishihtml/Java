package com.mycompany.lab03exe04;

public class Professor {
    protected String nome, departamento;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getDepartamento(){
        return this.departamento;
    }
    
    public Professor(String nome, String departamento){
        this.nome = nome;
        this.departamento = departamento;
    }
}
