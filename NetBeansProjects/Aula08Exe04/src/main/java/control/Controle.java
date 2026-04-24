/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import model.Pessoa;
import view.JanelaPricipal;

/**
 *
 * @author unifgnishi
 */
public class Controle {
    private JanelaPricipal mainView;
    private ArrayList<Pessoa> pessoas = new ArrayList<>();
    
    public Controle(JanelaPricipal mainView){
        this.mainView = mainView;
    }
    
    public void cadastrar(){
        String nome = this.mainView.getTxt_nome().getText();
        String sobrenome = this.mainView.getTxt_sobrenome().getText();
        String cpf = this.mainView.getTxt_cpf().getText();
        int idade = Integer.parseInt(this.mainView.getTxt_idade().getText());
        String genero = "";
        if(this.mainView.getBtn_masculino().isSelected()){
            genero = "Masculino";
        }else{
            genero = "Feminino";
        }
        pessoas.add(new Pessoa(nome, sobrenome, cpf, idade, genero));
    }
}
