public class App {
    public static void main(String[] args) throws Exception {
        
        
        int[] numeros = {4,6,7,2,3,1,8,9,5};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma de todos os elementos do vetor é: " + soma);
    }
}