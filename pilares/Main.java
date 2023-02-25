package pilares;

import pilares.entities.CelularApple;
import pilares.entities.CelularDaLoucura;

public class Main {
    public static void main(String[] args) {
        CelularApple celular = new CelularApple(6, "", "Apple", "123", "icloud@apple.com");
        CelularDaLoucura celularLouco = new CelularDaLoucura(6, "", "Samsung", "123");

        printValorDoObjeto(celular);
        printValorDoObjeto(celularLouco);
        printValorDoObjeto("123");
        printValorDoObjeto(123);
    }

    public static void printValorDoObjeto(Object objeto){
        System.out.println(objeto);
    }
}
