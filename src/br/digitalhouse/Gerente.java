package br.digitalhouse;

public class Gerente extends Pessoa {
    public String area;
    private float salario;


    Gerente(String novoNome, Data novoNascimento, float salario2  ,String area) {
        super(novoNome, novoNascimento);
        salario = salario2;
    }

    public void calculoIposto(float salario){
        System.out.println("O imposto sobre seu salario é R$" + salario * 5/100);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
