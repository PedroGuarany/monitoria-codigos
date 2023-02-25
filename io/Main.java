package io;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        var exemploInteiro = 1824718383;
        var exemploFloat = 42.81726f;
        var exemploDouble = -8123123.1238123;
        System.out.printf("Meu número inteiro é: %,d\n", exemploInteiro);
        System.out.printf("Meu número float formatado é: %+.2f\n", exemploFloat);
        System.out.printf("Meu número double formatado é: %.2f\n", exemploDouble);

        var exemploString = "oie";

        System.out.printf("Meu exemplo de string é: %s\n", exemploString);
        System.out.printf("Meu exemplo de STRING é: %S\n", exemploString);

        var exemploClasse = new ClasseExemplo("1", "2");
        var exemploClasse2 = new ClasseExemplo("3", "4");

        System.out.println(exemploClasse);
        System.out.println(exemploClasse2);
    }
}
