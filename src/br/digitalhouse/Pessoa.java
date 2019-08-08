package br.digitalhouse;

public abstract class Pessoa {
    private String nome;
    private int nascimento;

    public Pessoa(String novoNome, int novoNascimento){
        nome = novoNome;
        nascimento = novoNascimento;

    }

       public String getNome() {
        return nome;
    }

    public int getNascimento() {
        return nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

}
