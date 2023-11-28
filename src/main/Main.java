package main;

import view.TabelaRelatorio;

public class Main {
    
    public static void main(String[] args) {
        
        TabelaRelatorio tabela = new TabelaRelatorio();
        
        tabela.setLocationRelativeTo(null);
        tabela.setDefaultCloseOperation(tabela.EXIT_ON_CLOSE);
        tabela.setVisible(true);
    }
}