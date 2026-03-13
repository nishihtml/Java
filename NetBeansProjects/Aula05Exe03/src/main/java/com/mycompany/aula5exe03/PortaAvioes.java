package com.mycompany.aula5exe03;

public class PortaAvioes extends NavioGuerra{
    private int numAvioes;

    public PortaAvioes(int numAvioes, double blindagem, double ataque, int numTripulantes, String nome) {
        super(blindagem, ataque, numTripulantes, nome);
        this.numAvioes = numAvioes;
    }

    public void setNumAvioes(int numAvioes) {
        this.numAvioes = numAvioes;
    }
    
    
    public int getNumAvioes() {
        return numAvioes;
    }
    
    
    public void PoderdeFogo(){
        System.out.println("Poder de Fogo........: " + super.getAtaque() * 
                                                       Math.pow(numAvioes, 2)); 
    }
    
    @Override
    public void exibirInfoGeral(){
        System.out.println("=================================================");
        super.exibirInfoGeral();
        this.poderDeFogo();
        System.out.println("================================================="); 
    }
}
