package com.mycompany.lab02exe02;

import java.util.Scanner;

public class TelevisaoMain {
    
    public static void main(String[] args){
        boolean localLigada;
        
        Scanner input = new Scanner(System.in);
        
        Televisao tv1 = new Televisao();
        Televisao tv2 = new Televisao();
        
        tv1.setModelo("Midori");
        tv1.setTamanho(21.60);
        tv1.setPreco(999.99);
        tv1.setCanal(0);
        tv1.setVolume(50);
        tv1.setLigada(true);
        
        tv2.setModelo("Mono Cat");
        tv2.setTamanho(19.90);
        tv2.setPreco(1199.99);
        tv2.setCanal(0);
        tv2.setVolume(50);
        tv2.setLigada(true);
        
        while(true){
            System.out.println(    "-----------------------------------");
            System.out.println(    "----------------TV1----------------");
            System.out.println(    "-----------------------------------");
            System.out.println(    "Modelo......: " + tv1.getModelo());
            System.out.printf(     "Preco.......: %.2fl RS$ \n", tv1.getPreco());
            System.out.printf(     "Tamanho.....: %.2fl cm \n", tv1.getTamanho());
            System.out.println(    "Volume......: " + tv1.getVolume());
            System.out.println(    "Canal.......: " + tv1.getCanal());
            System.out.println(    "-----------------------------------");
            if(tv1.getLigada() == true){
                System.out.println("Status......: Ligada");
            }else{
                System.out.println("Status......: Desligada");
            }
            System.out.println(    "-----------------------------------");
            System.out.println(    "\n");
            
            System.out.println(    "-----------------------------------");
            System.out.println(    "----------------TV2----------------");
            System.out.println(    "-----------------------------------");
            System.out.println(    "Modelo......: " + tv2.getModelo());
            System.out.printf(     "Preco.......: %.2fl RS$ \n", tv2.getPreco());
            System.out.printf(     "Tamanho.....: %.2fl cm \n", tv2.getTamanho());
            System.out.println(    "Volume......: " + tv2.getVolume());
            System.out.println(    "Canal......: " + tv2.getCanal());
            System.out.println(    "----------.-------------------------");
            if(tv2.getLigada() == true){
                System.out.println("Status......: Ligada");
            }else{
                System.out.println("Status......: Desligada");
            }
            System.out.println(    "-----------------------------------");
            System.out.println(    "\n");
            
            System.out.println("[1]Aumentar o Canal");
            System.out.println("[2]Diminuir o Canal");
            System.out.println("[3]Aumentar o Volume");
            System.out.println("[4]Diminuir o Volume");
            System.out.println("[5]Ligar/Desligar");
            
            int reply = input.nextInt();
            if(reply == 1){
                System.out.println("[1]TV1");
                System.out.println("[2]TV2");
                reply = input.nextInt();
                if(reply == 1){
                    tv1.aumentarCanal();
                }else if(reply == 2){
                    tv2.aumentarCanal();
                }
            }else if(reply == 2){
                System.out.println("[1]TV1");
                System.out.println("[2]TV2");
                reply = input.nextInt();
                if(reply == 1){
                    tv1.diminiurCanal();
                }else if(reply == 2){
                    tv2.diminiurCanal();
                }
            }else if(reply == 3){
                System.out.println("[1]TV1");
                System.out.println("[2]TV2");
                reply = input.nextInt();
                if(reply == 1){
                    tv1.aumentarVolume();
                }else if(reply == 2){
                    tv2.aumentarVolume();
                }
            }else if(reply == 4){
                System.out.println("[1]TV1");
                System.out.println("[2]TV2");
                reply = input.nextInt();
                if(reply == 1){
                    tv1.diminiurVolume();
                }else if(reply == 2){
                    tv2.diminiurVolume();
                }
            }else if(reply == 5){
                System.out.println("[1]TV1");
                System.out.println("[2]TV2");
                reply = input.nextInt();
                if(reply == 1){
                    if(tv1.getLigada()== true){
                        localLigada = false;
                        tv1.setLigada(localLigada);
                    }else{
                        localLigada = true;
                        tv1.setLigada(localLigada);
                    }
                }else if(reply == 2){
                    if(tv1.getLigada()== true){
                        localLigada = false;
                        tv2.setLigada(localLigada);
                    }else{
                        localLigada = true;
                        tv2.setLigada(localLigada);
                    }
                }
            }
        }
    }
}
