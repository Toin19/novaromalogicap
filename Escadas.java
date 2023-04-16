import java.util.Scanner;

public class Escadas {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Digite a quantidade de níveis");
       int níveis = input.nextInt();

       for (int i = 1; i <= níveis; i++){
        //imprime i asteriscos na linha atual
        for (int j = 1; j <= i; j++){
            System.out.println("*");


        }

            System.out.println(); //pula para próxima linha


       }



    }
}
