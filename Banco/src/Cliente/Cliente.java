package Cliente;

public class Cliente {

    public Cliente(String nome) {
        this.nome = nome;
    }

    private final String nome;

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}