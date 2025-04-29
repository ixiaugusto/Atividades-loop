import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        int primeiro = 0;
        int segundo = 1;
        int contador = 0;
        int limitador = 10;

        while (contador < limitador) {
            if (contador == 0) {
                System.out.print(primeiro);
            } else if (contador == 1) {
                System.out.print(", " + segundo);
            } else {
                int proximo = primeiro + segundo;
                System.out.print(", " + proximo);
                primeiro = segundo;
                segundo = proximo;
            }
            contador++;
        }
    }
}
