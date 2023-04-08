import java.util.Scanner;


public class SomaSimples {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        float valor1;
        float valor2;
        float resultado;

        System.out.println("Digite o primeiro Valor");
        valor1 = input.nextFloat();
        
        System.out.println("Digite o segundo valor");
        valor2 = input.nextFloat();

        resultado = valor1 + valor2;

        System.out.println("A soma dos dois valores e " + resultado);

        input.close();




         }





}
