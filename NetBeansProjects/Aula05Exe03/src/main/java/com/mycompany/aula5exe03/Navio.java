package com.mycompany.aula5exe03;

public class Navio {
    private int numTripulantes;
    private String nome;

    public Navio(int numTripulantes, String nome) {
        this.numTripulantes = numTripulantes;
        this.nome = nome;
    }

    public void setNumTripulantes(int numTripulantes) {
        this.numTripulantes = numTripulantes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumTripulantes() {
        return numTripulantes;
    }

    public String getNome() {
        return nome;
    }
    
    public void exibirInfoGeral(){
        System.out.println("Numero de Tripulantes: " + getNumTripulantes());
        System.out.println("Nome do Navio........: " + getNome());
    }
}
