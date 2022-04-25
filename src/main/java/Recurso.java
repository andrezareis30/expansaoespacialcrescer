public class Recurso {
    private int valor;
    private int peso;
    private Recurso recurso;


    public Recurso(Recurso recurso, int valor,int peso) {
     this.recurso = recurso;
     this.valor = valor;
     this.peso = peso;

    }
    public int valorTotal (int valor, int peso) {
        return valor + peso;

    }

    public int valorPorPeso (int valor, int peso){
        return valor / peso + valor / peso + valor / peso;

    }

    public int getValor(){
        return valor;
    }

    public int getPeso(){
        return peso;
    }

    public Recurso getRecurso(){
        return recurso;
    }

    public void setValor(int valor){
        this.valor = valor;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
}

