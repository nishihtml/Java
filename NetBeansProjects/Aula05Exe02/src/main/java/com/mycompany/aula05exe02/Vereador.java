/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05exe02;

/**
 *
 * @author unifgnishi
 */
public class Vereador extends Politico{
    private String municipio;
    
    public Vereador(){
        
    }
    
    public Vereador(String municipio, String nome, 
                    String partido, String estado){
        super(nome, partido, estado, "Vereador");
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
