package com.mycompany.lab01q9;

public class PrintType {
    public void printTipo(){
        System.out.println("Vazio");
    }
    public void printTipo(String valor){
        System.out.println("Tipo String: " + valor);
    }
    public void printTipo(String valorx, String valory){
        System.out.println("Tipo String: " + valorx + " + " + valory);
    }
    public void printTipo(int valor){
        System.out.println("Tipo int: " + valor);
    }
    public void printTipo(double valor){
        System.out.println("Tipo double: " + valor);
    }
}
