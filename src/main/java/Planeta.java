import java.util.ArrayList;

public class Planeta {
    private String nome;
    private int posicao;
    ArrayList<String> recurso;

    public Planeta(String nome, int posicao) {
        this.nome = nome;
        this.posicao = posicao;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
}











