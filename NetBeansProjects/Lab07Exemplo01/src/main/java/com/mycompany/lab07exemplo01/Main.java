package com.mycompany.lab07exemplo01;

public class Main {
    
    public static void Xtest(int test){
        System.out.println("Inside Xtest: " + test);
        if(test == 2){
            throw new IntException("erro");
        }
    }
    
    public static void main(String args[]){
        System.out.println("Start\n");
        try{
            System.out.println("Inside block try");
            Xtest(0);
            Xtest(1);
            Xtest(2);
        }catch(RuntimeException e){
            System.out.println("Caught an exception " + e);
        }
        
        System.out.println("fin");
    }
}
