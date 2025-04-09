public class ListaEncadeada {

    private No primeiro;
    private No ultimo;

    public ListaEncadeada() {}

    public ListaEncadeada(int valor) {
        primeiro = new No(valor);
        ultimo = primeiro;
    }

    public void adicionarFim(int valor) {
        No runner = primeiro;
        if (estaVazia()) {
            primeiro = new No(valor);
            ultimo = primeiro;
            return;
        }
        while (runner.getProximo() != null) {
            runner = runner.getProximo();
        }
        //runner eh o ultimo no
        runner.setProximo(new No(valor));
        ultimo = runner.getProximo();
    }

    public int removeFim() {
        if (estaVazia()) {
            throw new RuntimeException("");
        }
        No runner = primeiro;
        while (runner.getProximo() != ultimo) {
            runner = runner.getProximo();
        }
        int valor = runner.getInfo();
        runner.setProximo(null);
        return valor;
    }

    public void insereInicio(int valor) {
        No novoPrimeiro = new No(valor);
        novoPrimeiro.setProximo(primeiro);
        primeiro = novoPrimeiro;
        if (estaVazia()) {
            ultimo = primeiro;
        }
    }

    public int removeInicio() {
        if (estaVazia()) {
            throw new RuntimeException("");
        }
        No runner = primeiro;
        int valor = runner.getInfo();
        No segundoNo = runner.getProximo();
        primeiro = segundoNo;
        if (estaVazia()) {
            primeiro = null;
            ultimo = null;
        }
        return valor;
    }

    private boolean estaVazia() {
        return primeiro == null;
    }

    @Override
    public String toString() {
        String s = "";
        No runner = primeiro;
        s += runner.getInfo() + " ";
        while (runner.getProximo() != null) {
            runner = runner.getProximo();
            s += runner.getInfo() + " ";
        }
        //runner eh o ultimo no
        return s;
    }
}
