package com.mycompany.lab03exe01;

public class Carro {
    
    private String modelo, cor;
    private int ano;
    private double preco, km;
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setKm(double km){
        this.km = km;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public String getCor(){
        return this.cor;
    }
    public int getAno(){
        return this.ano;
    }
    public double getPreco(){
        return this.preco;
    }
    public double getKm(){
        return this.km;
    }
    
    public Carro(){
        this.modelo = "NULL";
        this.cor = "NULL";
        this.ano = 0;
        this.preco = 0;
        this.km = 0;
    }
    
    public Carro(String modelo, int ano, double preco){
        this.modelo = modelo;
        this.cor = "NULL";
        this.ano = ano;
        this.preco = preco;
        this.km = 0;
    }
    
    public Carro(String modelo, String cor, int ano, double preco, double km){
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
        this.km = km;
    }
}
