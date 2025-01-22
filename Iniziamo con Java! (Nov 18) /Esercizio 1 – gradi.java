/******************************************************************************

Scrivere un programma che, ricevuto in ingresso il valore di una temperatura in gradi centigradi, calcoli il
valore corrispondente in gradi Fahrenheit, Kelvin, Reaumur.
Si ricorda che:
B0K = B0C + 273.16
B0R = B0C * 0.8
B0F = (9/5) * B0C + 32

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Inserisci il valore di una temperatura in gradi centigradi");
		double celcius = scanner.nextDouble();

		double kelvin = celcius + 273.16;
		double reaumur = celcius * 0.8;
		double fahrenheit = (9/5) * celcius + 32;

		System.out.println("kelvin: " + kelvin);
		System.out.println("Reaumur: " + reaumur);
		System.out.println("Fahrenheit: " + fahrenheit);

	}
}
