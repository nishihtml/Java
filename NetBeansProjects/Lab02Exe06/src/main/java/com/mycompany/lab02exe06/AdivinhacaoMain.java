package com.mycompany.lab02exe06;

import java.util.Scanner;

public class AdivinhacaoMain {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        Adivinhacao Random = new Adivinhacao();
        Random.setNumeroSorteado()
        
        int numero, tentativas;
        boolean winner = false;
        tentativas = 1;
        
        while(winner == false){
            System.out.println("Digite um numero de 1 a 1000");
            numero = input.nextInt();
            if(numero > Random.getNumeroSorteado()){
                System.out.println("Tente algo menor");
            }
        }
    }
}
