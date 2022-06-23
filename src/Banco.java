import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void imprimirClientes() {
        this.contas.stream().forEach(conta -> conta.imprimirInfosComuns());
    }
}
