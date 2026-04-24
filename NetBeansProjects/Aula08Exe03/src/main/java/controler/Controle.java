/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import model.OperacaoMatematica;
import view.Janela;

/**
 *
 * @author unifgnishi
 */
public class Controle {
    private Janela view;
    private double op1, op2;
    private OperacaoMatematica operacao;
    

    public Controle(Janela view) {
        this.view = view;
        
    }
    
    
    
    public void concatenaNumeros(String numero){
        String n1 = view.getTxt_resultado().getText() + numero;
        view.getTxt_resultado().setText(n1);
    }
    
    public void salvaOperacao(OperacaoMatematica operacao){
        this.op1 = Double.parseDouble(view.getTxt_resultado().getText());
        view.getTxt_resultado().setText("");
        this.operacao = operacao;
    }
    
    public void calcular(){
        this.op2 = Double.parseDouble(view.getTxt_resultado().getText());
        double resultado = this.operacao.calcular(op1, op2);
        this.view.getTxt_resultado().setText(String.valueOf(resultado));
    }
    
    public void limpar(){
        this.view.getTxt_resultado().setText("");
    }

}

