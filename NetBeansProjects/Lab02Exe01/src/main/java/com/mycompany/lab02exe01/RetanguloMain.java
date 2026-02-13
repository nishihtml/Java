package com.mycompany.lab02exe01;

import java.util.Scanner;

public class RetanguloMain {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int localLado1, localLado2;
        
        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo();
        
        System.out.println("RET_1");
        
        System.out.println("Digite o valor do lado 1: ");
        localLado1 = input.nextInt();
        ret1.setLado1(localLado1);
        
        System.out.println("Digite o valor do lado 2: ");
        localLado2 = input.nextInt();
        ret1.setLado2(localLado2);
        
        System.out.println("\n");
        
        System.out.println("RET_2");
        
        System.out.println("Digite o valor do lado 1: ");
        localLado1 = input.nextInt();
        ret2.setLado1(localLado1);
        
        System.out.println("Digite o valor do lado 2: ");
        localLado2 = input.nextInt();
        ret2.setLado2(localLado2);
        
        System.out.println("\n");
        
        System.out.println("-----------------------------------");
        System.out.println("---------------RET_1---------------");
        System.out.println("-----------------------------------");
        System.out.println("Lado 1........: " + ret1.getLado1());
        System.out.println("Lado 2........: " + ret1.getLado2());
        System.out.println("Area..........: " + ret1.area());
        System.out.println("Perimetro.....: " + ret1.perimetro());
        System.out.println("-----------------------------------");
        
        System.out.println("\n");
        
        System.out.println("-----------------------------------");
        System.out.println("---------------RET_2---------------");
        System.out.println("-----------------------------------");
        System.out.println("Lado 1........: " + ret2.getLado1());
        System.out.println("Lado 2........: " + ret2.getLado2());
        System.out.println("Area..........: " + ret2.area());
        System.out.println("Perimetro.....: " + ret2.perimetro());
        System.out.println("-----------------------------------");
    }
}
