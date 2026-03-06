package com.mycompany.aula04exe06;

import java.util.ArrayList;

public class EstudanteMain {
    public static void main(String[] Args){
        ArrayList<Estudante> aluno = new ArrayList<>();
        
        for(int i = 0; i < 30; i++){
            aluno.add(new Estudante("NULL", "NULL"));
        }
        System.out.println("Tamanho: " + aluno.size());
        
        for(Estudante estudante: aluno){
            System.out.println(estudante);
        }
    }
}
