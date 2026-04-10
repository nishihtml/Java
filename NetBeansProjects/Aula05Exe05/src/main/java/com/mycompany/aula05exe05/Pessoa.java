package com.mycompany.aula05exe05;

public class Pessoa {
    protected String nome;
    protected long cpf;
    protected Data nascimento;

    public Pessoa(String nome, long cpf, Data nascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }
    
    public String getNome() {
        return nome;
    }
    public long getCpf() {
        return cpf;
    }
    public Data getNascimento() {
        return nascimento;
    }
    
    public void print(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.nascimento.print());
    }
}
