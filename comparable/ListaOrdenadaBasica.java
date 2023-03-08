package comparable;

public class ListaOrdenadaBasica<T extends Comparable> {
    private No<T> inicio;
    private int tamanho = 0;

    public ListaOrdenadaBasica() {
    }

    public void adiciona(T valor){
        if(inicio == null){
            inicio = new No<T>(valor);
            return;
        }

        var noAtual = inicio;
        var testeValor = noAtual.valor;
        while(noAtual.valor.compareTo(valor) < 0){
            noAtual = noAtual.proximo;
        }

        var novoNo = new No<T>(valor);
        novoNo.proximo = noAtual.proximo;
        noAtual.proximo = novoNo;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        var noAtual = inicio;
        while (inicio != null){
            sb.append(noAtual.valor + ", ");
        }
        return sb.toString();
    }
}
