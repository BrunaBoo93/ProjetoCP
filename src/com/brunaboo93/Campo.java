package com.brunaboo93;

import java.util.ArrayList;
import java.util.List;

public class Campo {

    private int coluna;
    private int linha;
    private boolean minado = false;
    private boolean aberto = false;
    private boolean marcado = false;
    private List <Campo> vizinho = new ArrayList<>();

    public Campo(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public boolean isMinado() {
        return minado;
    }

    public void setMinado(boolean minado) {
        this.minado = minado;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean isMarcado() {
        return marcado;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }

    public List<Campo> getVizinho() {
        return vizinho;
    }

    public void setVizinho(List<Campo> vizinho) {
        this.vizinho = vizinho;
    }
}
