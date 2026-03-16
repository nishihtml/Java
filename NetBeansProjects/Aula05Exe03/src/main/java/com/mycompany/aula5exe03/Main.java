package com.mycompany.aula5exe03;

public class Main {
    public static void main(String[] args){
        Navio navio01 = new Navio(50, "Kasato Maru");
        navio01.exibirInfoGeral();
        
        NavioMercante navio02 = new NavioMercante(1000, 500, 60, "Trade Winds");
        navio02.exibirInfoGeral();
        
        Cruzador navio03 = new Cruzador(100, 7, 100, 300, "Forever");
        navio03.exibirInfoGeral();
        
        PortaAvioes navio04 = new PortaAvioes(30, 5, 100, 350, "Ventania");
        navio04.exibirInfoGeral();
    }
}
