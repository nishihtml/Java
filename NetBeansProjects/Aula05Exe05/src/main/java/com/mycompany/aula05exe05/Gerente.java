package com.mycompany.aula05exe05;

public class Gerente extends Funcionario{
    private int departamento;
    private Data promocaoGerente;

    public Gerente(int departamento, Data promocaoGerente, double salario, Data admissao, String nome, long cpf, Data nascimento) {
        super(salario, admissao, nome, cpf, nascimento);
        this.departamento = departamento;
        this.promocaoGerente = promocaoGerente;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }
    public void setPromocaoGerente(Data promocaoGerente) {
        this.promocaoGerente = promocaoGerente;
    }

    public int getDepartamento() {
        return departamento;
    }
    public Data getPromocaoGerente() {
        return promocaoGerente;
    }
            
    @Override
    public void print(){
        super.print();
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Data de Promocao: " + this.promocaoGerente.print());
    }
}
