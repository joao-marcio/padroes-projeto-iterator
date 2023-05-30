package padroescomportamentais.iterator;

public class Jogador {

    private String nome;
    private boolean titular;

    public Jogador(String nome, boolean titular) {
        this.nome = nome;
        this.titular = titular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }
}
