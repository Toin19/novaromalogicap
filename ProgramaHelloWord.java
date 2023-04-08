 import java.util.Scanner;

public class ProgramaHelloWord {
        public static void main (String[] args) {
            
            Scanner input = new Scanner(System.in);

            //variaveis
            String nome;
            int dia;
            int mes;
            int ano;


            //var processadas
            int idade;

            System.out.println("digite seu nome");
            nome = input.nextLine();

            System.out.println("digite o dia de nascimento");
            dia = input.nextInt();

            System.out.println("digite o mes de nascimento");
            mes = input.nextInt();

            System.out.println("digite o ano de nascimento");
            ano = input.nextInt();

            //processamento
            idade = 2023 - ano;

            System.out.println("Bem vindo " + nome);
            System.out.println("Sua idade e: " + idade);

            input.close();



        }

    
}