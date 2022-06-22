public abstract class Conta implements IConta{

    private static int SEQUENCIAL = 1;
    private static int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar() {

    }

    public void depositar() {

    }

    public void transferir() {

    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {

    }
}
