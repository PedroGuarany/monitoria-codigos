package comparable;

public class No<T> {
    public T valor;
    public No<T> proximo = null;

    public No(T valor) {
        this.valor = valor;
    }
}
