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

        if (primeiroMaiorQueSegundo(inicio.valor, valor)){
            var novoNo = new No<T>(valor);
            novoNo.proximo = inicio;
            inicio = novoNo;
            return;
        }

        var noAtual = inicio;
        while(noAtual.proximo != null && primeiroMaiorQueSegundo(noAtual.proximo.valor, valor)){
            noAtual = noAtual.proximo;
        }

        var novoNo = new No<T>(valor);
        novoNo.proximo = noAtual.proximo;
        noAtual.proximo = novoNo;
    }

    private boolean primeiroMaiorQueSegundo(T primeiro, T segundo){
        return primeiro.compareTo(segundo) > 0;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        var noAtual = inicio;
        while (noAtual != null){
            sb.append(noAtual.valor + ", ");
            noAtual = noAtual.proximo;
        }
        return sb.substring(0, sb.length() - 2);
    }
}
