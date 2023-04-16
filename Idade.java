import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, maisNova = 0, maisVelha = 0;

        for (int i = 1; i <= 12; i++) {
            System.out.println("Digite a idade da " + i + "a pessoa: ");
            idade = input.nextInt();

            if (i == 1) {
                maisNova = idade;
                maisVelha = idade;
            } else {
                if (idade < maisNova) {
                    maisNova = idade;
                }
                if (idade > maisVelha) {
                    maisVelha = idade;
                }
            }

                System.out.println("A pessoa mais nova tem " + maisNova + "anos");
                System.out.println("A pessoa mais velha tem " + maisVelha + "anos");


        }
    }
}
