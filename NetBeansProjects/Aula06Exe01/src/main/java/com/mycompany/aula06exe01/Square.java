/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06exe01;

public class Square {
    public static int square(int x){
        return x * x;
    }
    public static double square(double x){
        return x * x;
    }
    
    public static void main(String[] args){
        int a = 8;
        double b = 6.7;
        
        System.out.println(square(a));
        System.out.println(square(b));
    }
}
