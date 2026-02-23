package com.mycompany.aula03exe01;

import java.util.Scanner;

public class FuncionarioMain {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String localNome, localSobrenome, localSexo;
        int localIdade, localNumero;
        double localSalarioMensal;
        
        Funcionario f1 = new Funcionario();
        
        System.out.println("=========== Funcionario 1 ===========");
        System.out.println("Nome Completo.:" + f1.getNome() + " " + f1.getSobrenome());
        System.out.println("Sexo..........:" + f1.getSexo());
        System.out.println("Idade.........:" + f1.getIdade());
        System.out.printf( "Numero........: %5d \n", f1.getNumero());
        System.out.printf( "Salario Mensal: %.2f \n", f1.getSalarioMensal());
        System.out.println("=====================================");
        
        System.out.println("\n");
        
        Funcionario f2 = new Funcionario();
        
        System.out.println("Digite o seu nome");
        localNome = input.next();
        f2.setNome(localNome);
        System.out.println("Digite o seu sobrenome");
        localSobrenome = input.next();
        f2.setSobrenome(localSobrenome);
        System.out.println("Digite o seu sexo");
        localSexo = input.next();
        f2.setSexo(localSexo);
        System.out.println("Digite a sua idade");
        localIdade = input.nextInt();
        f2.setIdade(localIdade);
        System.out.println("Digite o seu numero");
        localNumero = input.nextInt();
        f2.setNumero(localNumero);
        System.out.println("Digite o seu salario mensal");
        localSalarioMensal = input.nextDouble();
        f2.setSalarioMensal(localSalarioMensal);
        
        System.out.println("\n");
        
        System.out.println("=========== Funcionario 1 ===========");
        System.out.println("Nome Completo.:" + f2.getNome() + " " + f2.getSobrenome());
        System.out.println("Sexo..........:" + f2.getSexo());
        System.out.println("Idade.........:" + f2.getIdade());
        System.out.printf( "Numero........: %5d \n", f2.getNumero());
        System.out.printf( "Salario Mensal: %.2f \n", f2.getSalarioMensal());
        System.out.println("=====================================");
    }
}
