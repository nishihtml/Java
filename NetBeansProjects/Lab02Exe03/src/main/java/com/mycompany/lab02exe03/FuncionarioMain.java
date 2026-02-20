package com.mycompany.lab02exe03;

import java.util.Scanner;

public class FuncionarioMain {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String localNome, localSobrenome;
        double localSalario;
        
        Funcionario fun1 = new Funcionario();
        Funcionario fun2 = new Funcionario();
        
        System.out.println("-- Funcionario 1 --");
        
        System.out.println("Digite o seu nome");
        localNome = input.next();
        fun1.setNome(localNome);
        
        System.out.println("Digite o seu sobrenome");
        localSobrenome = input.next();
        fun1.setSobrenome(localSobrenome);
        
        System.out.println("Digite o seu salario mensal");
        localSalario = input.nextDouble();
        if (localSalario < 0){
            fun1.setSalario(0);
        }else{
            fun1.setSalario(localSalario);
        }
        
        System.out.println("-- Funcionario 2 --");
        
        System.out.println("Digite o seu nome");
        localNome = input.next();
        fun2.setNome(localNome);
        
        System.out.println("Digite o seu sobrenome");
        localSobrenome = input.next();
        fun2.setSobrenome(localSobrenome);
        
        System.out.println("Digite o seu salario mensal");
        localSalario = input.nextDouble();
        if (localSalario < 0){
            fun2.setSalario(0);
        }else{
            fun2.setSalario(localSalario);
        }
        
        System.out.println("\n");
        
        System.out.println( "===================================");
        System.out.println( "Nome Completo: " + fun1.getNome() + " " + fun1.getSobrenome());
        System.out.printf(  "Salario anual: %.2f \n", fun1.getSalario() * 1.1 * 12);
        System.out.println( "===================================");
        System.out.println( "===================================");
        System.out.println( "Nome Completo: " + fun2.getNome() + " " + fun2.getSobrenome());
        System.out.printf(  "Salario anual: %.2f \n", fun2.getSalario() * 1.1 * 12);
        System.out.println( "===================================");
    }
}
