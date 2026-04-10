package com.mycompany.aula07exe04;

public class Main {
    public static void StringTest(String aaa){
        System.out.println("String: " + aaa);
        if("A".equals(aaa)){
            throw new StringException("erro");
        }
    }
        
    public static void main(String[] args){    
        try{
            StringTest("B");
            StringTest("A");
        }catch(RuntimeException e){
            System.out.println("Caught an exception " + e);
        }
    }

}

