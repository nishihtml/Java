package com.mycompany.aula04exe03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes1 = new ArrayList<>();

        nomes1.add("A");
        nomes1.add("B");
        nomes1.add("C");
        nomes1.add("D");
       
        ArrayList<String> nomes2 = new ArrayList<>(nomes1);
        
        nomes1.set(0, "E");
        
        System.out.println(nomes1);
        System.out.println(nomes2);
    }
}