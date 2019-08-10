package br.digitalhouse;

public class Gerente extends Pessoa {
    public String area;
    private float salario;


    Gerente(String novoNome, Data novoNascimento, float salario2  ,String novaArea) {
        super(novoNome, novoNascimento);
        salario = salario2;
        area = novaArea;
    }

    public float calculoImposto(float salario){
        return (salario * 5/100);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public void imprimirDados() {System.out.println( "Nome do Gerente: " + super.getNome() + "\n"
            + "Área de atiuação: " + area + "\n"
            + "Data de Nascimento " + super.getNascimento().getDia() + "/" + super.getNascimento().getMes() + "/" + super.getNascimento().getAno() +"\n"
            + "Valor do salario é de: R$" + getSalario() + " O valor pago de Imposto è R$:" + calculoImposto(getSalario()) + "\n");
    }


}
