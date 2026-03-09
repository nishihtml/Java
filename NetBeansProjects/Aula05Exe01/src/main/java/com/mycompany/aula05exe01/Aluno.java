package com.mycompany.aula05exe01;

public class Aluno extends Pessoa {
    protected String curso;
    
    public Aluno(String curso, String nome, String sobrenome, int idade){
        super(nome, sobrenome, idade);
        this.curso = curso;
    }
    public Aluno(){
        
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public String getCurso(){
        return this.curso;
    }
 
    public void print(){
        System.out.println("=================================================");
        System.out.println("Nome.: " + getNome() + " " + getSobrenome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Curso: " + getCurso());
        System.out.println("=================================================");
    }
}


