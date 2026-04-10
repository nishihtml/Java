package com.mycompany.aula07exe02;

public class Main {
    public static void main(String[] args){
        Mensagem objeto = null;
        
        try{
            objeto.mensagem();
        }catch(NullPointerException e){
            System.out.println(e);
            objeto = new Mensagem();
            objeto.mensagem();
        }
    }
}
