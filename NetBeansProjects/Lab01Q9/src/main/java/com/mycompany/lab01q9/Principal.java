package com.mycompany.lab01q9;

public class Principal {
    public static void main(String[] args){
        PrintType f1 = new PrintType();
        PrintType f2 = new PrintType();
        PrintType f3 = new PrintType();
        
        f3.printTipo("AAA", "BBB");
        f2.printTipo(10);
        f1.printTipo(10.0);
    }
}
