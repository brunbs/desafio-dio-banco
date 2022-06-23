public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.setNome("Banco do Brasil");

        Cliente cli1 = new Cliente();
        cli1.setNome("Bruno");

        Cliente cli2 = new Cliente();
        cli2.setNome("Cassia");

        Conta contaCorrente = new ContaCorrente(cli1);
        Conta contaPoupanca = new ContaPoupanca(cli1);
        contaCorrente.depositar(150);
        contaCorrente.transferir(100, contaPoupanca);

        Conta contaCorrente2 = new ContaCorrente(cli2);
        Conta contaPoupanca2 = new ContaPoupanca(cli2);

        contaCorrente.transferir(25, contaCorrente2);

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaCorrente2);
        banco.adicionarConta(contaPoupanca);
        banco.adicionarConta(contaPoupanca2);

        System.out.println("DESAFIO: IMPRIMIR LISTA DE CLIENTES:");

        banco.imprimirClientes();

    }
}
