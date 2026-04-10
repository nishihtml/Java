package com.mycompany.aula07exe01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true){
            
            try{
                System.out.println("Digite um numero");
                int numero01 = input.nextInt();
                System.out.println("Digite outro numero");
                int numero02 = input.nextInt();
                int resultado = numero01/numero02;
                System.out.printf("A divisao de %d/%d = %d\n", numero01, numero02, resultado);
                break;
            }catch(ArithmeticException e){
                System.out.println("Erro " + e.getMessage());
            }catch(InputMismatchException e){
                System.out.println("Erro " + e.getMessage());
                input.nextInt();
            }
        }
        
        
        System.out.println("Fim do programa");
    }
}
