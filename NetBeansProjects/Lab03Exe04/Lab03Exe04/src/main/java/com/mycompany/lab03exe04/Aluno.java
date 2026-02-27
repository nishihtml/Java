package com.mycompany.lab03exe04;

public class Aluno {
     
    protected String nome, ra, curso;
    private Disciplina disciplina01;
    
    public void setNome(String nome){
        this.nome = nome;
    } 
    public void setRa(String ra){
        this.ra = ra;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public void setDisciplina01(Disciplina disciplina01){
        this.disciplina01 = disciplina01;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getRa(){
        return this.ra;
    }
    public String getCurso(){
        return this.curso;
    }
    public Disciplina getDisciplina01(){
        return this.disciplina01;
    }
    
    public Aluno(String nome, String ra, String curso, Disciplina disciplina01){
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
        this.disciplina01 = disciplina01;
    }
}
