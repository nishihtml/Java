package com.mycompany.Aula04Exe01;

import java.util.Scanner;

public class LaserMain {
    
    public static void main(String[] args){
        
        Laser l[] = new Laser[10];
        String localFabricante, localAlcance, localPrecisao, localMedida;
        
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < l.length; i++){
            System.out.println("Digite o fabricante");
            localFabricante = input.next();
            System.out.println("Digite o alcance");
            localAlcance = input.next();
            System.out.println("Digite o precisao");
            localPrecisao = input.next();
            System.out.println("Digite a medida");
            localMedida = input.next();
            l[i] = new Laser(localFabricante, localAlcance,
                             localPrecisao, localMedida);
        }
        for (Laser l1 : l) {
            System.out.println(l1);
        }
    }
}
