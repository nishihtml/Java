package com.mycompany.lab02exe06;

import java.util.Random;

public class Adivinhacao {
    private static final Random randomNumbers = new Random();
    int numeroSorteado  = 1 + randomNumbers.nextInt( 1000 );
    
    public void setNumeroSorteado(int numeroSorteado){
        this.numeroSorteado = numeroSorteado;
    }
    
    public int getNumeroSorteado(){
        return this.numeroSorteado;
    }
}
