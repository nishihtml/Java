package com.mycompany.aula05exe06;

public class Account {
    protected double salario;

    public Account(double salario) {
        if(salario >= 0){
            this.salario = salario;
        }else{
            this.salario = 0;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void checkSalario(double salario){
        if(salario < 0){
            System.out.println("Informacao invalida");
        }
    }
    
    public void credit(double salario){
        this.salario = this.salario + salario;
    }
    public void debit(double salario){
        if(salario <= this.salario){
            this.salario = this.salario - salario;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void getBalace(){
        System.out.println("Saldo: " + this.salario);
    }
}
