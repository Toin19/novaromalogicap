import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double Celsius, Farenheit, Kelvin;

        System.out.println("Digite a temperatura em Celsius: ");
        Celsius = input.nextDouble();

        //Converter celsius para farenheit
        Farenheit = (Celsius * 9/5) + 32;
        System.out.println(Celsius + " graus Celsius equivalem a " + Farenheit + " graus farenheit");

        //converter Celsius para Kelvin
        Kelvin = Celsius + 273.15;
        System.out.println(Celsius + " graus celsius equivalem a " + Kelvin + " graus kelvin");
        
        System.out.println("Digite a temperatura em Farenheit: ");
        Farenheit = input.nextDouble();

        //converter farenheit para celsius
        Celsius = (Farenheit - 32) * 5 / 9;
        System.out.println(Farenheit + " graus Farenheit equivalem a " + Celsius + " graus Celsius");

        //converter farenheit para kelvin
        Kelvin = (Farenheit + 459.67) * 5 / 9;
        System.out.println(Farenheit + " graus Farenheit equivalem a " + Kelvin + " graus Kelvin" );

        System.out.println("Digite a temperatura em Kelvin: ");
        Kelvin = input.nextDouble();

        //converter kelvin para celsius
        Celsius = Kelvin - 273.15;
        System.out.println(Kelvin + " graus kelvin equivalem a " + Celsius + " graus celsius");

        //converter kelvin para farenheit
        Farenheit = Kelvin * 9 / 5 - 459.67;
        System.out.println(Kelvin + " graus kelvin equivalem a " + Farenheit + " graus farenheit");

        input.close();

    }




}
