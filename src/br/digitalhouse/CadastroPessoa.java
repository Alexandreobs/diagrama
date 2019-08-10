package br.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class CadastroPessoa {
    private int qtdAtual;
    private Pessoa Pessoa;
    private List<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    public void imprimeCadastro(){
        for(int i = 0; i < pessoas.size(); i++){
            System.out.println(pessoas.get(i).toString());
        }
    }

}
