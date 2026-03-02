package com.mycompany.aula04exe02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cores1 = new ArrayList<>();
        ArrayList<String> cores2 = new ArrayList<>();
        ArrayList<String> cores3 = new ArrayList<>();

        cores1.add("Vermelho");
        cores1.add("Amarelo");
        cores1.add("Azul");

        cores2.add("Magenta");
        cores2.add("Amarelo");
        cores2.add("Ciano");

        for(int i = 0; i < cores1.size(); i++){
            if(cores1.contains(cores2.get(i))){
                System.out.println("Cores iguais: " + cores2.get(i));
            }else{
                System.out.println("Cores diferentes: " + cores2.get(i));
            }

        }
        
    }
}
