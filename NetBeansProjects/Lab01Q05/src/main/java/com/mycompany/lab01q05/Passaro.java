package com.mycompany.lab01q05;

public class Passaro {
    private String cor;
    private boolean voa;
    private int tamanho;

    public Passaro(int tamanho) {
        this.tamanho = tamanho;
    }

    public Passaro(int tamanho, String cor) {
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public Passaro(int tamanho, boolean voa, String cor) {
        this.cor = cor;
        this.voa = voa;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
  
    
}
