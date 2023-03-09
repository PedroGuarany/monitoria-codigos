package comparable;

public class Produto implements Comparable{
    private double preco;
    private String nome;

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome + " R$" + preco;
    }

    @Override
    public int compareTo(Object o) {
        var outroObjeto = (Produto)o;

        if (this.preco > outroObjeto.preco)
            return 1;
        else if (this.preco < outroObjeto.preco)
            return -1;
        else
            return 0;
    }
}
