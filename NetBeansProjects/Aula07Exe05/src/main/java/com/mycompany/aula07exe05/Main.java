package com.mycompany.aula07exe05;

public class Main {
    
    public static void Xtest(int test){
        System.out.println("Inside Xtest: " + test);
        if(test < 0){
            throw new NegativeException("erro");
        }
        if(test == 1 || test == 4){
            throw new IntException("erro");
        }
        if(test == 0){
            throw new ZeroException("erro");
        }
    }
    
    public static void main(String args[]){
        System.out.println("Start\n");
        for(int i = -2; i < 7; i++){
            try{
                System.out.println("Inside block try");
                Xtest(i);
                System.out.println("Pass");
            }catch(RuntimeException e){
                System.out.println("Caught an exception " + e);
            }
        }
        
        System.out.println("fin");
    }
}
