package br.digitalhouse;

public class Cliente extends Pessoa {
    public int codCliente;


    public Cliente(String novoNome, int novoNascimento, int codCliente) {
        super(novoNome, novoNascimento);
    }


    public int getCodCliente() {
        return codCliente;
    }


    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

}
