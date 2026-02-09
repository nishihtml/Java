package com.mycompany.aula02exe01;

import java.util.Scanner;

public class TestePessoa {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        String nomeLocal, cpfLocal;
        int idadeLocal;
        
        Pessoa p1 = new Pessoa();
        
        System.out.println("Digite o nome da 1 pessoa: ");
        nomeLocal = teclado.nextLine();
        p1.setNome(nomeLocal);
        
        System.out.println("Digite o cpf da 1 pessoa: ");
        cpfLocal = teclado.nextLine();
        p1.setCpf(cpfLocal);
        
        System.out.println("Digite a idade da 1 pessoa: ");
        idadeLocal = teclado.nextInt();
        p1.setIdade(idadeLocal);
        
        System.out.println("\n");
        
        System.out.println("--------------------------------------------");
        System.out.println("-------------Dados da 1 pessoa--------------");
        System.out.println("--------------------------------------------");
        System.out.println("Nome:......: " + p1.getNome());
        System.out.println("CPF:.......: " + p1.getCpf());
        System.out.println("Idade:.....: " + p1.getIdade());
        System.out.println("--------------------------------------------");
    }
}
