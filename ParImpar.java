import java.util.Scanner;

    public class ParImpar {
        public static void main(String[] args) {
            
        Scanner input = new Scanner (System.in);

        System.out.println("Digite um numero inteiro");
        int numero = input.nextInt();

        
       if (numero % 2 == 0) {
            System.out.println(numero + " e um numero par");
        
       } else {
            System.out.println(numero + " e um numero impar");



        
            input.close();


       }
        }

        




                

        
        

        }



        