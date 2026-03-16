package com.mycompany.aula05exe05;

public class Funcionario extends Pessoa{
    protected double salario;
    protected Data admissao;    

    public Funcionario(double salario, Data admissao, String nome, long cpf, Data nascimento) {
        super(nome, cpf, nascimento);
        this.salario = salario;
        this.admissao = admissao;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setAdmissao(Data admissao) {
        this.admissao = admissao;
    }
  
    public double getSalario() {
        return salario;
    }
    public Data getAdmissao() {
        return admissao;
    }
    
    @Override
    public void print(){
        super.print();
        System.out.printf( "Salario: %.2f \n", this.salario);
        System.out.println("Data de Admissao: " + this.admissao);
    }
}
