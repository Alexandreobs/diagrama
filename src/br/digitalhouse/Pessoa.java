package br.digitalhouse;

public abstract class Pessoa {

    private String nome;
    private Data nascimento;

    public Pessoa(String novoNome, Data novoNascimento){
        nome = novoNome;
        nascimento = novoNascimento;
    }

       public String getNome() {
        return nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

}
