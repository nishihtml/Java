package com.mycompany.aula05exe06;

public class SavingsAccount extends Account{
    private double taxaJuros;

    public SavingsAccount(double taxaJuros, double salario) {
        super(salario);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
    
    public Double calculateInterest(){
        return super.getSalario() * this.taxaJuros;
    }

    @Override
    public void debit(double salario) {
        super.debit(salario);
    }

    @Override
    public void credit(double salario) {
        super.credit(salario);
    }

    
}
