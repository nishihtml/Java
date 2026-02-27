package com.mycompany.lab03exe04;

public class Disciplina {
    protected String codigo, nome;
    private Professor professor;
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    public String getNome(){
        return this.nome;
    }
    public Professor getProfessor(){
        return this.professor;
    }
    
    public Disciplina(String codigo, String nome, Professor professor){
        this.codigo = codigo;
        this.nome = nome;
        this.professor = professor;
    }
}
