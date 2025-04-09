public class No {

    private int info;
    private No proximo;

    public No(int valor) {
        info = valor;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int valor) {
        info = valor;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No no) {
        proximo = no;
    }
}
