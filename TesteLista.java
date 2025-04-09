public class TesteLista {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.adicionarFim(1);
        lista.adicionarFim(2);
        lista.adicionarFim(3);
        System.out.println(lista);
        lista.insereInicio(4);
        System.out.println(lista);
        lista.removeInicio();
        System.out.println(lista);
    }
}
