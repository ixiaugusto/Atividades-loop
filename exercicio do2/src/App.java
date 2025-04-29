import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        int opcao;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("- Adicionar");
            System.out.println("- Remover");
            System.out.println("- Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Item adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Item removido com sucesso!");
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            
        } while (opcao != 3);

        scanner.close();
    }
}
