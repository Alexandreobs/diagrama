package br.digitalhouse;

public class Cliente extends Pessoa {
    private int codCliente;


    public Cliente(String novoNome, Data novoNascimento, int codCliente2) {
        super(novoNome, novoNascimento);
                codCliente = codCliente2;
    }


    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    @Override
    public void imprimirDados() {
        System.out.println( "Nome do Cliente: " + super.getNome() + "\n"
                + "Data de Nascimento " + super.getNascimento().toString() + "\n");

    }
}
