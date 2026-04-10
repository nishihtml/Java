package com.mycompany.lab01q04;

public class Passaro {
    private String cor;
    private boolean voa;
    private int tamanho;

    public Passaro(String cor, boolean voa, int tamanho) {
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

    @Override
    public String toString() {
        return "Passaro{" + "cor=" + cor + ", voa=" + voa + ", tamanho=" + tamanho + '}';
    }
    
    
}
