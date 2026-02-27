package com.mycompany.lab03exe01;

import java.util.Scanner;

public class CarroMain {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        Carro c1 = new Carro();
        Carro c2 = new Carro("Ram", 2016, 108000.00);
        Carro c3 = new Carro("BYD", "Branco", 2016, 276367.69, 200);
        
        System.out.println("\n");
        System.out.println("==================== Carro 1 ====================");
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Cor...: " + c1.getCor());
        System.out.println("Ano...: " + c1.getAno());
        System.out.printf( "Preco.: %.2f \n", c1.getPreco());
        System.out.printf( "Km....: %.2f \n", c1.getKm());
        System.out.println("=================================================");
        
        System.out.println("\n");
        System.out.println("==================== Carro 2 ====================");
        System.out.println("Modelo: " + c2.getModelo());
        System.out.println("Cor...: " + c2.getCor());
        System.out.println("Ano...: " + c2.getAno());
        System.out.printf( "Preco.: %.2f \n", c2.getPreco());
        System.out.printf( "Km....: %.2f \n", c2.getKm());
        System.out.println("=================================================");
        
        System.out.println("\n");
        System.out.println("==================== Carro 3 ====================");
        System.out.println("Modelo: " + c3.getModelo());
        System.out.println("Cor...: " + c3.getCor());
        System.out.println("Ano...: " + c3.getAno());
        System.out.printf( "Preco.: %.2f \n", c3.getPreco());
        System.out.printf( "Km....: %.2f \n", c3.getKm());
        System.out.println("=================================================");
    }
}
