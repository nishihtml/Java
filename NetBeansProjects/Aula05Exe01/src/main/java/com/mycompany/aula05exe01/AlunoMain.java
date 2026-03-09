package com.mycompany.aula05exe01;

import java.util.Scanner;
import java.util.ArrayList;

public class AlunoMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Aluno> turma = new ArrayList<>();
        
        String localNome, localSobrenome, localCurso;
        int localIdade;
        
        turma.add(new Aluno());
        
        System.out.println("Digite o seu nome");
        localNome = input.next();
        System.out.println("Digite o seu sobrenome");
        localSobrenome = input.next();
        System.out.println("Digite a sua idade");
        localIdade = input.nextInt();
        System.out.println("Digite o seu curso");
        localCurso = input.next();
        
        turma.add(new Aluno(localCurso, localNome, localSobrenome, localIdade));
        
        for(Aluno aluno: turma){
            aluno.print();
        }
    }
}
