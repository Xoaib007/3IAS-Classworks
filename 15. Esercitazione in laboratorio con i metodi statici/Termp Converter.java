/******************************************************************************
Scrivi un programma in Java dove utilizzi due metodi statici: uno per convertire da Celsius a Fahrenheit e l'altro da Fahrenheit a Celsius
*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inserisci la temperatura in Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.printf("%.2f°C equivale a %.2f°F%n", celsius, celsiusToFarenheit(celsius));
        
        System.out.print("Inserisci la temperatura in Farenheit: ");
        double farenheit = scanner.nextDouble();
        System.out.printf("%.2f°F equivale a %.2f°C%n", celsius, farenheitToCelsius(farenheit));

	}
	
	public static double celsiusToFarenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
	
    public static double farenheitToCelsius(double farenheit) {
        return (farenheit - 32) * 5 / 9;
    }
}

