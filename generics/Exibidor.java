package generics;

public class Exibidor<T extends Comparable<T>>{
    private T texto;

    public Exibidor(T texto) {
        this.texto = texto;
    }
    public void printContent(){
        System.out.println(texto);
    }

    public T getTexto(){
        return texto;
    }


}
