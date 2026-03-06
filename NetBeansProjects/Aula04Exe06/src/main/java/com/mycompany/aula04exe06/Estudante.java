/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula04exe06;

/**
 *
 * @author unifgnishi
 */
public class Estudante{
    private String nome, sobrenome;
    private int proximoId;
    public static int id = 0;
    
    public Estudante(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.id++;
        this.proximoId = id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getsobreNome(){
        return this.sobrenome;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome + 
               " Sobrenome: " + this.nome + 
               " ID: " + this.proximoId;
    }
}
