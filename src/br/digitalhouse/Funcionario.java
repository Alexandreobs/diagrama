package br.digitalhouse;

public class Funcionario extends Pessoa {
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    protected Funcionario(String novoNome, Data novoNascimento, float salario2) {
        super(novoNome, novoNascimento);
        salario = salario2;
    }

    public void calculoIposto(float salario){
        System.out.println("O imposto sobre seu salario é R$" + salario * 3/100);
    }

}
