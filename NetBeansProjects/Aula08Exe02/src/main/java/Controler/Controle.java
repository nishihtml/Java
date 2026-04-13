package Controler;

import Model.Soma;
import View.Janela;

public class Controle {
    
    private Janela view;

    public Controle(Janela view) {
        this.view = view;
    }
    
    public void controleSomar(){
        double n1 = Double.parseDouble(view.getTxt_x().getText());
        double n2 = Double.parseDouble(view.getTxt_y().getText());
        
        Soma s = new Soma();
        
        double r = s.calcular(n1, n2);
        
        view.getTxt_total().setText(String.valueOf(r));
    }
    
    public void controleLimpar(){
        view.getTxt_x().setText("");
        view.getTxt_y().setText("");
        view.getTxt_total().setText("");
    }
    

}
