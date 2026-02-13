package com.mycompany.aula02exe02;

import java.util.Scanner;

public class SwapperDemo {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int local_x, local_y;
        
        Swapper index = new Swapper();
        
        System.out.println("Digite o valor de X: ");
        local_x = input.nextInt();
        index.setX(local_x);
        
        System.out.println("Digite o valor de Y: ");
        local_y = input.nextInt();
        index.setY(local_y);
        
        System.out.println("\n");
        
        System.out.println("X: " + index.getX());
        System.out.println("Y: " + index.getY());
        
        System.out.println("\n");
        
        index.swap();
        System.out.println("X: " + index.getX());
        System.out.println("Y: " + index.getY());
    }
}
