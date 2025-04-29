import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
         int numero;

         Scanner scanner = new Scanner (System.in);

        do {
            System.out.println("Digite qualquer numero entre 1 e 100:");
            numero = scanner.nextInt();
        
        } while (numero < 1 | numero > 100);
        
        System.out.println("Número válido digitado: " + numero);
        
        scanner.close();
    }
}