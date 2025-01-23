/******************************************************************************

Sviluppare un programma simile al precedente nel quale il numero di righe e colonne sia scelto
dallbutente con il limite di inserire numeri fino a 25.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Scegli un numero tra 1 e 25");
		int userInput = scanner.nextInt();

		// Input validation
		while (userInput < 1 || userInput > 25) {
			System.out.println("Il sua input non C( valido. Scrivi un numero tra 1 e 25");
			System.out.println("Indovina un numero tra 1 e 25: ");
			userInput = scanner.nextInt();
		}
		scanner.close();


		for(int i = 0; i < userInput; i++) {
			for(int j = 0; j < userInput; j++) {
				System.out.print(j + 1);
			}
			System.out.println(" ");
		}
	}
}

