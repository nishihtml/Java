package com.mycompany.aula06exe03;

public class Retangulo extends Forma{
    private double comprimento, largura;

    public Retangulo() {
    }

    public Retangulo(double comprimento, double largura) {
        super("Retangulo");
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    
    @Override
    public double perimetro(){
        return 2 * comprimento + 2 * largura;
    }
    @Override
    public void print(){
        System.out.println("Tipo.........: " + super.getTipo());
        System.out.println("Comprimento..: " + this.comprimento);
        System.out.println("Largura......: " + this.largura);
        System.out.println("Perimetro....: " + this.perimetro());
    }
}
