package com.brunaboo93;

public class Jogador {

    private Long id;
    private String nome;
    private int senha;

    public Jogador(){

    }
    public Jogador(Long id, String nome, int senha){
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}
