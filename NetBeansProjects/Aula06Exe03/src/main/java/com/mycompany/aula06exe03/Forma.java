package com.mycompany.aula06exe03;

public abstract class Forma {
    private String tipo;
    
    public Forma(){
    }

    public Forma(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public abstract double perimetro();
    public abstract void print();
}
