package comparable;

public class Main {
    public static void main(String[] args) {
        var lista = new ListaOrdenadaBasica<Integer>();

        lista.adiciona(3);
        lista.adiciona(2);
        lista.adiciona(1);
        System.out.println(lista);
    }
}
