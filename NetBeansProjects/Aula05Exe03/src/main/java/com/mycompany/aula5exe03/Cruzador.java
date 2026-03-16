package com.mycompany.aula5exe03;

public class Cruzador extends NavioGuerra{
    private int numCanhoes;

    public Cruzador(int numCanhoes, double blindagem, double ataque,
                    int numTripulantes, String nome) {
        super(blindagem, ataque, numTripulantes, nome);
        this.numCanhoes = numCanhoes;
    }

    public void setNumCanhoes(int numCanhoes) {
        this.numCanhoes = numCanhoes;
    }
    
    public int getNumCanhoes() {
        return numCanhoes;
    }

    public void poderDeFogo(){
        System.out.println("Poder de Fogo........: " + super.getAtaque() * 
                                                       Math.sqrt(numCanhoes));
    }
    
    @Override
    public void exibirInfoGeral(){
        System.out.println("=================================================");
        super.exibirInfoGeral();
        this.poderDeFogo();
        System.out.println("================================================="); 
    }
}
