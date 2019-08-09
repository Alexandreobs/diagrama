package br.digitalhouse;

import com.sun.org.apache.bcel.internal.generic.DADD;

public class Principal {
    public static void main(String[] args) {


        Data dataArthur = new Data(12,8, 2019);
        Cliente cliArthur = new Cliente("Artur", dataArthur, 555);
        System.out.println(cliArthur.getNascimento());

        Data dataPatricia = new Data(19,8,1990);
        Cliente cliPatricia = new Cliente("Patricia",dataPatricia, 1234);

        Data dataAlexandre = new Data(29,9,1988);
        Funcionario funAlexandre = new Funcionario("Alexandre", dataAlexandre, 1550);
        funAlexandre.calculoIposto(funAlexandre.getSalario());
        funAlexandre.calculoIposto(1550);

        Funcionario FunCarlos = new Funcionario("Calos", 02, 1520);

        Gerente gerJessica = new Gerente("Jessica", 15, 3450, "vendas");
        gerJessica.calculoIposto(4000);

        Gerente gerkarina = new Gerente("Karina", 23, 3555, "Regional");
        gerkarina.calculoIposto(4500);
    }
}

// teste cadastro.