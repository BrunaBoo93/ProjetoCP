package br.com.unicesumar;

import br.com.unicesumar.modelo.Tabuleiro;
import br.com.unicesumar.visao.TabuleiroConsole;

public class Aplicacao {

    public static void main(String[] args) {
        
    	 Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);

         new TabuleiroConsole(tabuleiro);
    }
}

