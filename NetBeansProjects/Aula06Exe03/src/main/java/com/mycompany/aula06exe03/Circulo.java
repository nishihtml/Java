package com.mycompany.aula06exe03;

public class Circulo extends Forma{
    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        super("Circulo");
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double perimetro(){
        return 2 * 3.14159 * this.raio;
    }
    public double area(){
        return 3.14159 * this.raio * this.raio;
    }
    @Override
    public void print(){
        System.out.println("Tipo.......:" + super.getTipo());
        System.out.println("Raio.......:" + this.raio);
        System.out.println("Perimetro..:" + this.perimetro());
        System.out.println("Area.......:" + this.area());
    }
}
