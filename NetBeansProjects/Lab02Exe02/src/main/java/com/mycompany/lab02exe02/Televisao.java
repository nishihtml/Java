package com.mycompany.lab02exe02;

public class Televisao {
    private String modelo;
    private double preco, tamanho;
    private int volume, canal;
    private boolean ligada;
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setTamanho(double tamanho){
        this.tamanho = tamanho;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public void setCanal(int canal){
        this.canal = canal;
    }
    public void setLigada(boolean ligada){
        this.ligada = true;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public double getPreco(){
        return this.preco;
    }
    public double getTamanho(){
        return this.tamanho;
    }
    public int getVolume(){
        return this.volume;
    }
    public int getCanal(){
        return this.canal;
    }
    public boolean getLigada(){
        return this.ligada;
    }
    
    public void aumentarCanal(){
        if(this.canal < 255){
            this.canal = this.canal + 1;
        }else{
            this.canal = 255;
        }
    }
    public void diminiurCanal(){
        if(this.canal > 0){
            this.canal = this.canal - 1;
        }else{
            this.canal = 0;
        }
    }
    
    public void aumentarVolume(){
        if(this.volume < 100){
            this.volume = this.volume + 5;
        }else{
            this.volume = 100;
        }
    }
    public void diminiurVolume(){
        if(this.volume > 0){
            this.volume = this.volume - 5;
        }else{
            this.volume = 0;
        }
    }
}
