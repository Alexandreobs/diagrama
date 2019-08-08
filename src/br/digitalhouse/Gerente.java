package br.digitalhouse;

public class Gerente extends Pessoa {
    public String area;
    private float salario;


    Gerente(String novoNome, int novoNascimento,float salario  ,String area) {
        super(novoNome, novoNascimento);
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
