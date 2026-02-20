package com.mycompany.lab02exe04;

import java.util.Scanner;

public class InvoiceMain {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        Invoice iv1 = new Invoice();
        
        String localId, localDesc;
        int localQtd;
        double localPreco;
        
        System.out.println("Digite o ID do item");
        localId = input.next();
        iv1.setId(localId);
        System.out.println("Digite a descrisao do item");
        localDesc = input.next();
        iv1.setDesc(localDesc);
        System.out.println("Digite a quantidade do item");
        localQtd = input.nextInt();
        if (localQtd < 0){
            iv1.setQtd(0);
        }else{
            iv1.setQtd(localQtd);
        }
        System.out.println("Digite o preco do item");
        localPreco = input.nextDouble();
        if (localPreco < 0){
            iv1.setPreco(0);
        }else{
            iv1.setPreco(localPreco);
        }
        
        System.out.println("\n");
        System.out.println("===================================");
        System.out.println("ID:..............: " + iv1.getId());
        System.out.println("Descricao........: " + iv1.getDesc());
        System.out.println("Quantidade.......: " + iv1.getQtd());
        System.out.printf( "Preco............: %.2f \n", iv1.getPreco());
        System.out.printf( "Quantia da Fatura: %.2f \n", iv1.getInvoiceAmount());
        System.out.println("===================================");
    }
}
