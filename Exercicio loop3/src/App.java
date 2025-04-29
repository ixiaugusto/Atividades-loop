import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner (System.in);

        int senha = 7777;
        int errada = 0;
        
        System.out.println("Digite a senha");
            senha = scanner.nextInt();

       

        while (senha != 7777) {
            System.out.println("Digite a senha novamente");
            senha = scanner.nextInt();

            
            if (senha == 7777) {
                
                System.out.println("Acesso concedido");
                
            }
            
        }

    
    }
}
