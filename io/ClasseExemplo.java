package io;

public class ClasseExemplo {
    private String atributo1;
    private String atributo2;

    public ClasseExemplo(String atributo1, String atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
    }

    @Override
    public String toString() {
        return "Atributo 1: " + atributo1 + ", atributo 2: " + atributo2;
    }
}
