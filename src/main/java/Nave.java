public class Nave {
    private String nome;
    private int quantidadeDeCombustivel;
    private int posicao;

    private final static int QUANTIDADE_INICIAL_MINIMA_DE_COMBUSTIVEL = 3;
    private final static int POSICAO_INICIAL = 0;

    public Nave(String nome, int quantidadeDeComubstivel, int posicao) {
        this.nome = nome;
        this.quantidadeDeCombustivel = quantidadeDeComubstivel;
        this.posicao = posicao;
    }

    public boolean explorar(int quantidadeDeCombustivel) {
        if (this.quantidadeDeCombustivel < QUANTIDADE_INICIAL_MINIMA_DE_COMBUSTIVEL) ;
        return false;
    }

    public int getQuantidadeDeCombustivel() {
        return quantidadeDeCombustivel;
    }

    public void setQuantidadeDeCombustivel(int quantidadeDeCombustivel) {
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }
}



