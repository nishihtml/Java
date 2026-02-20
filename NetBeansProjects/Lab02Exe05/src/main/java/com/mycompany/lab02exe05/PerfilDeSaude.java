package com.mycompany.lab02exe05;

public class PerfilDeSaude {
    private String nome, sobrenome;
    int sexo, dia, mes, ano, idade;
    double altura, peso;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setSexo(int sexo){
        this.sexo = sexo;
    }
    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }
    public double getAltura(){
        return this.altura;
    }
    public double getPeso(){
        return this.peso;
    }
    public String getSexo(){
        if(this.sexo == 1){
            return("Masculino");
        }else if(this.sexo == 2){
            return("Feminino");
        }else if(this.sexo == 3){
            return("Intersexo");
        }else{
            return("Nao informado");
        }
    }
    
    public int getIdade(){
        this.idade = 2026 - this.ano;
        if(this.mes > 2){
            this.idade = this.idade - 1;
        }else{
            if(this.dia > 20){
                this.idade = this.idade - 1;
            }
        }
        return this.idade;
    }
    
    public double getImc(){
        return this.peso / (this.altura * this.altura);
    }
}
