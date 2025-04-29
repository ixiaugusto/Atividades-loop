import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(20) + 1; // Gera número entre 1 e 20
        int palpite;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número entre 1 e 20!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor!");
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior!");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativa(s)!");
            }
        } while (palpite != numeroSecreto);

        scanner.close();
    }
}