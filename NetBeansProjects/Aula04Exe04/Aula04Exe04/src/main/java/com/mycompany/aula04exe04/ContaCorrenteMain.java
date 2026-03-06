package com.mycompany.aula04exe04;

import java.util.ArrayList;

public class ContaCorrenteMain{
    
    public static void main(String[] args){
        
        double localSaldo, localValor;
        
        ArrayList<ContaCorrente> contas = new ArrayList<>();
        
        
        for(int i = 0; i < 10; i++){
            contas.add(new ContaCorrente(0));
        }
        
        contas.get(0).depositar(500);
        contas.get(1).depositar(500);
        contas.get(1).sacar(150);
        
        System.out.println(contas);
    }
}
