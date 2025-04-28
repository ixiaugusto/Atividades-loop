import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int total = 0;
        
        System.out.println("Digite um número positivo:");
        numero = scanner.nextInt();
        
        while (numero >= 0) {
            total += numero;
            System.out.println("Digite outro número positivo aqui:");
            numero = scanner.nextInt();
        }
        
        System.out.println("A soma dos números positivos é: " + total);
        
        scanner.close();
    }
}
         
        
        

    
    

