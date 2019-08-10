package br.digitalhouse;

import com.sun.org.apache.bcel.internal.generic.DADD;

public class Principal {
    public static void main(String[] args) {

        Data dataRobson = new Data(27,5,1984);
        Cliente cliRobson = new Cliente("Robson", dataRobson, 2424);
        cliRobson.imprimirDados();

        Data dataCoelho = new Data(11,4,1999);
        Funcionario funCoelho = new Funcionario("Coelho", dataCoelho,2500);
        funCoelho.imprimirDados();

        Data dataLuciana = new Data(19, 6, 1975);
        Gerente gerLuciana = new Gerente("luciana",dataLuciana,5530,"Diretoria");
        gerLuciana.imprimirDados();

        CadastroPessoa novoCadastro = new CadastroPessoa();

        novoCadastro.cadastrarPessoa(funCoelho);
        System.out.println("\n");
        novoCadastro.cadastrarPessoa(cliRobson);
        System.out.println("\n");
        novoCadastro.cadastrarPessoa(gerLuciana);

        novoCadastro.imprimeCadastro();

        System.out.println("\n");


// abaixo o metodo complicado
        Data dataArthur = new Data(12,8, 2019);
        Cliente cliArthur = new Cliente("Arthur",dataArthur,555);
        System.out.println("data de nascimento " + cliArthur.getNascimento().getDia() + "/" + cliArthur.getNascimento().getMes() + "/" + cliArthur.getNascimento().getAno());
        System.out.println("Cliente " + cliArthur.getNome());
        System.out.println("Codigo do Cliente " + cliArthur.getCodCliente());
        System.out.println("\n");


        Data dataPatricia = new Data(19,8,1990);
        Cliente cliPatricia = new Cliente("Patricia",dataPatricia, 1234);
        System.out.println("Cliente " + cliPatricia.getNome() + " Tem o seguinte Código " + cliPatricia.getCodCliente());
        System.out.println("Data de Nascimento de " +  cliPatricia.getNome() + " é " + cliPatricia.getNascimento() +"\n");



        Data dataAlexandre = new Data(29,9,1988);
        Funcionario funAlexandre = new Funcionario("Alexandre", dataAlexandre, 1550);



        Data dataCarlos = new Data(01,2,1993);
        Funcionario FunCarlos = new Funcionario("Calos", dataCarlos, 1520);
        FunCarlos.calculoImposto(FunCarlos.getSalario());

        Data dataJessica = new Data(04,7,1988);
        Gerente gerJessica = new Gerente("Jessica", dataJessica, 3450, "vendas");
        gerJessica.calculoImposto(4000);

        Data dataKarina = new Data(25,10,1997);
        Gerente gerkarina = new Gerente("Karina",dataKarina, 3555, "Regional");
        gerkarina.calculoImposto(4500);
    }
}

// teste cadastro.