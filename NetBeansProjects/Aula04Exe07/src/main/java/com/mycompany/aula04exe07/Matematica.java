/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04exe07;

/**
 *
 * @author unifgnishi
 */
public class Matematica {
    public static int max3(int n1, int n2, int n3){
        int maior = n2;
        if(n1 > maior){
            maior = n1;
        }
        if(n3 > maior){
            maior = n3;
        }
        return maior;
    }
    
    public static boolean impar(boolean n1, boolean n2, boolean n3){
        return !n1 && !n2 && n3 || !n1 && n2 && !n3 || n1 && !n2 &&!n3 || n1 && n2 &&n3;
    }
    
    public static boolean maioria(boolean n1, boolean n2, boolean n3){
        return !n1 && n2 && n3 || n1 && !n2 && n3 || n1 && n2 &&!n3 || n1 && n2 &&n3;
    }
    
    public static void main(String[] args){
        System.out.println(Matematica.max3(1, 2, 3));
        System.out.println(Matematica.max3(3, 1, 2));
        System.out.println(Matematica.max3(2, 3, 1));
        System.out.println(Matematica.impar(true, false, false));
        System.out.println(Matematica.maioria(true, false, true));
    }
    
    
}


