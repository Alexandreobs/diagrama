package br.digitalhouse;

public class Principal {
    public static void main(String[] args) {
    }

    Cliente cliArthur = new Cliente("Artur", 34, 555);
    Cliente cliPatricia = new Cliente("Patricia", 29, 1234);

    Funcionario funAlexandre = new Funcionario("Alexandre", 10, 1550);
    Funcionario FunCarlos = new Funcionario("Calos", 02, 1520);

    Gerente gerJessica = new Gerente("Jessica",15, 3450 ,"vendas");
    Gerente gerkarina = new Gerente("Karina", 23, 3555, "Regional");
    {
        System.out.println(cliArthur);
    }
}

// teste cadastro.