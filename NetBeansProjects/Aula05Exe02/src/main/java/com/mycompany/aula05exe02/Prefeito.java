package com.mycompany.aula05exe02;

public class Prefeito extends Politico{
    private String municipio;
    
    public Prefeito(){
        
    }
    
    public Prefeito(String municipio, String nome, 
                    String partido, String estado){
        super(nome, partido, estado, "Prefeito");
        this.municipio = municipio;
    }
    
    public void setMunicipio(String municipio){
        this.municipio = municipio;
    }
    
    public String getMunicipio(){
        return this.municipio;
    }
    
    public void apresentacao(){
        System.out.println("====================Prefeito=====================");
        System.out.println("Nome.....: " + getNome());
        System.out.println("Partido..: " + getPartido());
        System.out.println("Estado...: " + getEstado());
        System.out.println("Funcao...: " + getFuncao());
        System.out.println("Municipio: " + getMunicipio());
        System.out.println("=================================================");
    }
}
