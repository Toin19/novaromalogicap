import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
         Scanner  input = new Scanner (System.in);

         double nota1, nota2, nota3, media;
         String conceito;

         System.out.println("Digite a primeira nota do aluno");
        nota1 = input.nextDouble();

        System.out.println("Digite a segunda nota do aluno");
        nota2 = input.nextDouble();

        System.out.println("Digite a terceira nota do aluno");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 * 2 + nota3 * 3)/6;

        if (media >= 90) {
            conceito = "A";
            System.out.println("O aluno está aprovado com conceito " + conceito);

        }else if (media >= 75){
            conceito = "B";
            System.out.println("O aluno foi aprovado com conceito " + conceito);

        }else if (media >= 60){ 
            conceito = "C";
            System.out.println("O aluno foi aprovado com conceito " + conceito);
            
        }else if (media >= 40){
            conceito = "D";
            System.out.println("O aluno está reprovado com concetio " + conceito);

        }else {
            conceito = "E";
            System.out.println("O aluno está reprovado com conceito " + conceito);

            input.close();
        }


    }
}
