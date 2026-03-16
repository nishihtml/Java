package com.mycompany.aula05exe05;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Gerente> g = new ArrayList<>();
        
        g.add(new Gerente(2,new Data(20, 9, 2010), 2000, new Data(11, 5, 2005), "Carlo", 11122233344L, new Data(10, 12, 1996)));
        
        for(Gerente gerente: g){
            gerente.print();
        }
    }
}
