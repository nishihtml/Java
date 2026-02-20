package com.mycompany.lab02exe05;

import java.util.Scanner;

public class PerfilDeSaudeMain {
    
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        PerfilDeSaude perfil_1 = new PerfilDeSaude();
        
        String localNome, localSobrenome;
        int localSexo, localDia, localMes, localAno;
        double localAltura, localPeso;
        
        System.out.println("Digite o seu nome");
        localNome = input.next();
        perfil_1.setNome(localNome);
        System.out.println("Digite o seu sobrenome");
        localSobrenome = input.next();
        perfil_1.setSobrenome(localSobrenome);
        System.out.println("Digite o seu sexo");
        System.out.println("[1]Masculino");
        System.out.println("[2]Feminino");
        System.out.println("[3]Intersexo");
        localSexo = input.nextInt();
        perfil_1.setSexo(localSexo);
        perfil_1.setSobrenome(localSobrenome);
        System.out.println("Digite o dia do seu nascimento");
        localDia = input.nextInt();
        perfil_1.setDia(localDia);
        System.out.println("Digite o mes do seu nascimento");
        localMes = input.nextInt();
        perfil_1.setMes(localMes);
        System.out.println("Digite o ano do seu nascimento");
        localAno = input.nextInt();
        perfil_1.setAno(localAno);
        System.out.println("Digite a sua altura");
        localAltura = input.nextDouble();
        perfil_1.setAltura(localAltura);
        System.out.println("Digite o seu peso");
        localPeso = input.nextDouble();
        perfil_1.setPeso(localPeso);
        
        System.out.println("\n");
        
        System.out.println("\n");
        System.out.println("====================================================");
        System.out.println("Nome Completo.....: " + perfil_1.getNome() + " " + perfil_1.getSobrenome());
        System.out.println("Sexo..............: " + perfil_1.getSexo());
        System.out.println("Data de Nascimento: " + perfil_1.getDia() + "/" + perfil_1.getMes() + "/" + perfil_1.getAno());
        System.out.println("Idade.............: " + perfil_1.getIdade());
        System.out.printf( "Altura............: %.1f \n", perfil_1.getAltura());
        System.out.printf( "Peso..............: %.1f \n", perfil_1.getPeso());
        System.out.printf( "IMC...............: %.1f \n", perfil_1.getImc());
        System.out.println("====================================================");
    }
}
