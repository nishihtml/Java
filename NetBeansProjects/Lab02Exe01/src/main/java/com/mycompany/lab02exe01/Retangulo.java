package com.mycompany.lab02exe01;

public class Retangulo {
    private int lado1, lado2;
    
    void setLado1(int lado1){
        this.lado1 = lado1;
    }
    void setLado2(int lado2){
        this.lado2 = lado2;
    }
    
    public int getLado1(){
        return this.lado1;
    }
    public int getLado2(){
        return this.lado2;
    }
    
    public int area(){
        return this.lado1 * this.lado2;
    }
    public int perimetro(){
        return (this.lado1 * 2) + (this.lado2 * 2); 
    }
    
    
}
