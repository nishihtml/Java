package com.mycompany.aula02exe01;

import java.util.Scanner;

public class TestePessoa {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        String nomeLocal, cpfLocal;
        int idadeLocal;
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        
        System.out.println("Pessoa 1");
        System.out.println("Digite o nome da 1 pessoa: ");
        nomeLocal = teclado.nextLine();
        p1.setNome(nomeLocal);
        System.out.println("Digite o cpf da 1 pessoa: ");
        cpfLocal = teclado.nextLine();
        p1.setCpf(cpfLocal);
        System.out.println("Digite a idade da 1 pessoa: ");
        idadeLocal = teclado.nextInt();
        p1.setIdade(idadeLocal);
        
        teclado.nextLine();
        
        System.out.println("Pessoa 2");
        System.out.println("Digite o nome da 2 pessoa: ");
        nomeLocal = teclado.nextLine();
        p2.setNome(nomeLocal);
        System.out.println("Digite o cpf da 2 pessoa: ");
        cpfLocal = teclado.nextLine();
        p2.setCpf(cpfLocal);
        System.out.println("Digite a idade da 2 pessoa: ");
        idadeLocal = teclado.nextInt();
        p2.setIdade(idadeLocal);
        
        teclado.nextLine();
        
        System.out.println("Pessoa 3");
        System.out.println("Digite o nome da 3 pessoa: ");
        nomeLocal = teclado.nextLine();
        p3.setNome(nomeLocal);
        System.out.println("Digite o cpf da 3 pessoa: ");
        cpfLocal = teclado.nextLine();
        p3.setCpf(cpfLocal);
        System.out.println("Digite a idade da 3 pessoa: ");
        idadeLocal = teclado.nextInt();
        p3.setIdade(idadeLocal);
        
        System.out.println("\n");
        System.out.println("--------------------------------------------");
        System.out.println("-------------Dados da 1 pessoa--------------");
        System.out.println("--------------------------------------------");
        System.out.println("Nome:......: " + p1.getNome());
        System.out.println("CPF:.......: " + p1.getCpf());
        System.out.println("Idade:.....: " + p1.getIdade());
        System.out.println("--------------------------------------------");
        System.out.println("\n");
        
        System.out.println("--------------------------------------------");
        System.out.println("-------------Dados da 2 pessoa--------------");
        System.out.println("--------------------------------------------");
        System.out.println("Nome:......: " + p2.getNome());
        System.out.println("CPF:.......: " + p2.getCpf());
        System.out.println("Idade:.....: " + p2.getIdade());
        System.out.println("--------------------------------------------");
        
        System.out.println("\n");
        System.out.println("--------------------------------------------");
        System.out.println("-------------Dados da 3 pessoa--------------");
        System.out.println("--------------------------------------------");
        System.out.println("Nome:......: " + p3.getNome());
        System.out.println("CPF:.......: " + p3.getCpf());
        System.out.println("Idade:.....: " + p3.getIdade());
        System.out.println("--------------------------------------------");
    }
}
