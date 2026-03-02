package com.mycompany.Aula04Exe01;

public class Laser {
    private String fabricante, alcance, precisao, medida;
    
    public Laser(String fabricante, String alcance, String precisao, String medida){
        this.fabricante = fabricante;
        this.alcance = alcance;
        this.precisao = precisao;
        this.medida = medida;
    }
    
    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }
    public void setAlcance(String alcance){
        this.alcance = alcance;
    }
    public void setPrecisao(String precisao){
        this.precisao = precisao;
    }
    public void setMedida(String medida){
        this.medida = medida;
    }
    
    public String getFabricante(){
        return this.fabricante;
    }
    public String getAlcance(){
        return this.alcance;
    }
    public String getPrecisao(){
        return this.precisao;
    }
    public String getMedida(){
        return this.medida;
    }
}
