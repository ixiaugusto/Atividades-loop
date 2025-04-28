import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    

        int valor = 50;

        Scanner scanner = new Scanner(System.in);

        while (valor != 0) {
            System.out.println("Digite um valor aqui!");
            valor= scanner.nextInt();

            if (valor == 0) {
                System.out.println("O numero zero foi digitado e o programa foi encerrado :(");
                
            }


            
        }
        scanner.close();
        
    }
}
