package com.mycompany.aula5exe03;

public class NavioGuerra extends Navio{
    protected double blindagem, ataque;

    public NavioGuerra(double blindagem, double ataque, int numTripulantes, String nome) {
        super(numTripulantes, nome);
        this.blindagem = blindagem;
        this.ataque = ataque;
    }

    public void setBlindagem(double blindagem) {
        this.blindagem = blindagem;
    }
    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getBlindagem() {
        return blindagem;
    }
    public double getAtaque() {
        return ataque;
    }

    public void poderDeFogo(){
        System.out.println("Ataque...............: " + getAtaque());     
    }
    
    public void exibirArmas(){
        this.poderDeFogo();
        System.out.println("Blindagem............: " + getBlindagem()); 
    }
    
    @Override
    public void exibirInfoGeral(){
        super.exibirInfoGeral();
        this.exibirArmas();
    }
    
}
