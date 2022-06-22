public class Main {

    public static void main(String[] args) {

        Cliente cli1 = new Cliente();
        cli1.setNome("Bruno");

        Conta contaCorrente = new ContaCorrente(cli1);
        Conta contaPoupanca = new ContaPoupanca(cli1);
        contaCorrente.depositar(150);
        contaCorrente.tranferir(100, contaPoupanca);
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}
