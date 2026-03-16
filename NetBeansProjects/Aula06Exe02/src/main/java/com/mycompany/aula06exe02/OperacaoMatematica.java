package com.mycompany.aula06exe02;

public abstract class OperacaoMatematica {
    public abstract double calcular(double x, double y);
}

class Soma extends OperacaoMatematica{
    @Override
    public double calcular(double x, double y){
        return x + y;
    }
}

class Subtracao extends OperacaoMatematica{
    @Override
    public double calcular(double x, double y){
        return x - y;
    }
}
class Multiplicacao extends OperacaoMatematica{
    @Override
    public double calcular(double x, double y){
        return x * y;
    }
}
class Divisao extends OperacaoMatematica{
    @Override
    public double calcular(double x, double y){
        return x / y;
    }
}