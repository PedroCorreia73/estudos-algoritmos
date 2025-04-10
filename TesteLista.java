public class TesteLista {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.insereFim(1);
        lista.insereFim(2);
        lista.insereFim(3);
        lista.insereFim(4);
        lista.insereFim(5);
        System.out.println(lista);
        lista.inverter();
        System.out.println(lista);
    }
}
