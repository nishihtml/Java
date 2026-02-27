package com.mycompany.lab03exe04;

public class AlunoMain {
    public static void main(String[] args){
        
        Aluno aluno = new Aluno("Gustavo", "24.125.033-1", "Ciencia da Computação", new Disciplina("CCM310", "Java", new Professor("Gabi", "CC")));
        
        System.out.println(aluno.getNome() + aluno.getRa() + aluno.getCurso() + aluno.getDisciplina01());
    }
}
