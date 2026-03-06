package com.mycompany.aula04exe08;

import java.util.ArrayList;
import java.util.Scanner;

public class PessoaMain {
    public static void main(String[] args){
        String localNome, localTelefone;
        int closeCheck = 0;
        while(closeCheck == 0){
            ArrayList<Pessoa> agenda = new ArrayList<>();
            Scanner input = new Scanner(System.in);
            System.out.println("=============================================");
            System.out.println("[N] Nova entrada");
            System.out.println("[B] Buscar nome");
            System.out.println("[D] Deletar registro");
            System.out.println("[P] Imprime toda a agenda");
            System.out.println("[S] Sair");
            System.out.println("=============================================");

            String reply = input.nextLine();
            
            if(reply.equalsIgnoreCase("n")){
                System.out.println("Nome: ");
                localNome = input.nextLine();
                System.out.println("Telefone: ");
                localTelefone = input.nextLine();
                agenda.add(new Pessoa(localNome, localTelefone));
            }else if(reply.equalsIgnoreCase("d")){
                System.out.println("Nome: ");
                localNome = input.nextLine();
                System.out.println("=========================================");
                for(int index = 0; index < agenda.size(); index++){
                    if(agenda.get(index).getNome().equalsIgnoreCase(localNome)){
                        System.out.println(agenda.get(index));
                    }
                }
                System.out.println("=========================================");
            }
            else if(reply.equalsIgnoreCase("d")){
                System.out.println("Nome: ");
                localNome = input.nextLine();
                for(Pessoa contato: agenda){
                    if(contato.getNome().equalsIgnoreCase(localNome)){
                        agenda.remove(contato);
                        break;
                    }
                }
            }else if(reply.equalsIgnoreCase("p")){
                System.out.println("=========================================");
                for(Pessoa contato: agenda){
                    System.out.println(contato);
                }
                System.out.println("=========================================");
            }else if(reply.equalsIgnoreCase("s")){
                closeCheck = 1;
            }    
        }
    }
}
