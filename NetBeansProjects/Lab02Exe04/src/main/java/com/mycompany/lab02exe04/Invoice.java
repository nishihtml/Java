package com.mycompany.lab02exe04;

public class Invoice {
    private String id, desc;
    private int qtd;
    private double preco;
    
    public void setId(String id){
        this.id = id;
    }
    public void setDesc(String desc){
        this.desc = desc;
    }
    public void setQtd(int qtd){
        this.qtd = qtd;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public String getId(){
        return this.id;
    }
    public String getDesc(){
        return this.desc;
    }
    public int getQtd(){
        return this.qtd;
    }
    public double getPreco(){
        return this.preco;
    }
    
    public double getInvoiceAmount(){
        return this.qtd * this.preco;
    }
}
