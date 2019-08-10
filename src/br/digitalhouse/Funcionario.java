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

    public float calculoImposto(float salario){
        return (salario * 3/100);
    }

    @Override
    public void imprimirDados() {
        System.out.println( "Nome do Funcionario: " + super.getNome() + "\n"
            + "Data de Nascimento " + super.getNascimento().getDia() + "/" + getNascimento().getMes() + "/" + getNascimento().getAno() +"\n"
            + "Valor do salario é de: R$" + getSalario() + " O valor pago de Imposto è R$:" + calculoImposto(getSalario()) + "\n");

    }
}
