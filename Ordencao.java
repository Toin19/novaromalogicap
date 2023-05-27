import java.util.Scanner;
import java.util.Arrays;

public class Ordencao {
    public static void main(String[] args) {
        int tamanhoVetor = 10;
        int[] vetor = new int[tamanhoVetor];

        // Leitura dos valores do vetor
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os valores do vetor:");

        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Ordenação do vetor em ordem crescente
        Arrays.sort(vetor);

        // Impressão dos valores do vetor em ordem crescente
        System.out.println("Valores do vetor em ordem crescente:");
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println(vetor[i]);
        }
    }
}
