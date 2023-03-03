package generics;

public class Main {
    public static void main(String[] args) {
        var exibidor = new Exibidor("123");
        var exibidor2 = new Exibidor(1);
        var exibidor3 = new Exibidor(1.1);
        var exibidor4 = new Exibidor(false);
        var exibidor5 = new Exibidor(exibidor);

        exibidor.printContent();
        exibidor2.printContent();
        exibidor3.printContent();
        exibidor4.printContent();
        exibidor5.printContent();
    }
}
