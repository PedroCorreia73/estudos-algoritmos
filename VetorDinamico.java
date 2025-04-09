public class VetorDinamico {

    private int[] vetor;
    private int ocupacao;

    public VetorDinamico() {
        this(10);
    }

    public VetorDinamico(int tamanho) {
        vetor = new int[tamanho];
        ocupacao = 0;
    }

    public int getValor(int indice) {
        return vetor[indice];
    }

    public void setValor(int indice, int valor) {
        vetor[indice] = valor;
    }

    public void insere(int valor) {
        if (estaCheio()) {
            redimensiona();
        }
        vetor[ocupacao] = valor;
        ocupacao++;
    }

    public int remove() {
        if (estaVazio()) {
            throw new RuntimeException("O vetor esta vazio");
        }
        int valor = vetor[ocupacao - 1];
        ocupacao--;
        return valor;
    }

    public boolean estaCheio() {
        return ocupacao == vetor.length;
    }

    public boolean estaVazio() {
        return ocupacao == 0;
    }

    private void redimensiona() {
        int[] aux = new int[vetor.length * 2];
        for (int i = 0; i < vetor.length; i++) {
            aux[i] = vetor[i];
        }
        vetor = aux;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < ocupacao; i++) {
            s += vetor[i] + " ";
        }
        return s;
    }

    public static void main(String[] args) {
        VetorDinamico v = new VetorDinamico(3);
        v.insere(5);
        v.insere(4);
        v.insere(2);
        v.insere(6);
        System.out.println(v);
    }
}
