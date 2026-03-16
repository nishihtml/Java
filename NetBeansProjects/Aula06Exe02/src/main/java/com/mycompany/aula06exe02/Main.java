package com.mycompany.aula06exe02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double a, b;
        int reply;
        
        Scanner input = new Scanner(System.in);
      
        OperacaoMatematica operacao;
        
        System.out.println("[1]Soma");
        System.out.println("[2]Subtracao");
        System.out.println("[3]Multiplicacao");
        System.out.println("[4]Divisao");
        reply = input.nextInt();
        
        operacao = switch (reply) {
            case 1 -> new Soma();
            case 2 -> new Subtracao();
            case 3 -> new Multiplicacao();
            default -> new Divisao();
        };
        
        if(reply > 0 && reply < 5){
            System.out.println("Digite o primeiro valor:");
            a = input.nextDouble();
            System.out.println("Digite o segundo valor:");
            b = input.nextDouble();
            System.out.println("Resultado: " + operacao.calcular(a, b));
        }
    }
}
