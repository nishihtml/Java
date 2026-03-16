package com.mycompany.aula5exe03;

public class NavioMercante extends Navio{
    private double capacidadeCarga, carga;

    public NavioMercante(double capacidadeCarga, double carga, int numTripulantes, String nome) {
        super(numTripulantes, nome);
        this.capacidadeCarga = capacidadeCarga;
        this.carga = carga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    public double getCarga() {
        return carga;
    }
    
    
    
    public void carregamento(){
        System.out.printf("Carregamento.........: %.2f \n", this.capacidadeCarga 
                                                            + this.carga);
    }
    
    @Override
    public void exibirInfoGeral(){
        System.out.println("=================================================");
        super.exibirInfoGeral();
        System.out.println("Capacidade da Carga..: " + getCapacidadeCarga());
        System.out.println("Carga do Navio.......: " + getCarga());
        this.carregamento();
        System.out.println("================================================="); 
    }
}
