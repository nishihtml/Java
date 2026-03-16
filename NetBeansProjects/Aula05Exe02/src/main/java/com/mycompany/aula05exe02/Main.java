package com.mycompany.aula05exe02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String localNome, localPartido, localEstado, localMunicipio;
        
        Scanner input = new Scanner(System.in);
        ArrayList<Prefeito> p = new ArrayList<>();
        ArrayList<Vereador> v = new ArrayList<>();
        
        System.out.println("Prefeito");
        for(int i = 0; i < 3; i++){
            
            System.out.println("Nome.....: ");
            localNome = input.next();
            System.out.println("Partido..: ");
            localPartido = input.next();
            System.out.println("Estado...: ");
            localEstado = input.next();
            System.out.println("Municipio: ");
            localMunicipio = input.next();
            
            p.add(new Prefeito(localNome, localPartido, localEstado, localMunicipio));
        }
        
        System.out.println("Vereador");
        for(int i = 0; i < 3; i++){
            
            System.out.println("Nome.....: ");
            localNome = input.next();
            System.out.println("Partido..: ");
            localPartido = input.next();
            System.out.println("Estado...: ");
            localEstado = input.next();
            System.out.println("Municipio: ");
            localMunicipio = input.next();
            
            v.add(new Vereador(localNome, localPartido, localEstado, localMunicipio));
        }
        
        for(Prefeito prefeito: p){
            prefeito.apresentacao();
        }
        for(Vereador vereador: v){
            vereador.apresentacao();
        }
    }
}
