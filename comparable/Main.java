package comparable;

public class Main {
    public static void main(String[] args) {
        var produtoBarato = new Produto(5, "Barato");
        var produtoCaro = new Produto(5000, "Caro");
        var produtoMeio = new Produto(2500, "marromeno");

        var lista = new ListaOrdenadaBasica<Produto>();
        lista.adiciona(produtoCaro);
        System.out.println(lista);
        lista.adiciona(produtoBarato);
        lista.adiciona(produtoMeio);
        System.out.println(lista);
    }
}
