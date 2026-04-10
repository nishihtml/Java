package com.mycompany.lab01q7;

public class Pessoa {
   protected String cpf, mome;

    public Pessoa(String cpf, String mome) {
        this.cpf = cpf;
        this.mome = mome;
    }
   
   
   
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMome() {
        return mome;
    }

    public void setMome(String mome) {
        this.mome = mome;
    }
    
    
}

public class Funcionario extends Pessoa{
    private String cargo;
    private double salario;

    public Funcionario(String cargo, double salario, String cpf, String mome) {
        super(cpf, mome);
        this.cargo = cargo;
        this.salario = salario;
    }
    
    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void ganharAumento(){
        this.salario = this.salario * 1.10;
    }
}
