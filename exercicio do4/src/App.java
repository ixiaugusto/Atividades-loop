import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        double nota;
        double somaNotas = 0;
        int quantidadeNotas = 0;
        String continuar;

        do {
            System.out.print("Digite uma nota de 0 a 10: ");
            nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                somaNotas += nota;
                quantidadeNotas++;
            } else {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
            }

            System.out.print("Deseja inserir outra nota? : ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("s"));

        if (quantidadeNotas > 0) {
            double media = somaNotas / quantidadeNotas;
            System.out.println("A média das notas é: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }

        scanner.close();
    }
}