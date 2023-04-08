import java.util.Scanner;

public class DobroTriplo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Digite um número");
        int numero = input.nextInt();

        if (numero >= 0) {
            int dobro = numero * 2;
            System.out.println("O dobro de " + numero + " é " + dobro);
        } else {
           int triplo = numero * 3;
           System.out.println("O triplo de " + numero + " é " + triplo); 
        }

        input.close();

    }
}
