/******************************************************************************

Scrivere un programma java che generi un numero casuale compreso tra 1 e 5.
Lbutente deve indovinare il numero.
Dopo lbinput dellbutente il computer deve rispondere secondo queste tre alternative, in base al confronto tra
il numero casuale e quanto inserito dallbutente
    1) Bravo, hai indovinato
    2) Ci sei andato vicino, hai sbagliato di 1
    3) Peccato, hai sbagliato di 2

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Indovina un numero tra 1 e 5: ");
		int userInput = scanner.nextInt();

        // Input validation
        while (userInput < 1 || userInput > 5) {
          System.out.println("Il sua input non è valido. Scrivi un numero tra 1 e 5");
          System.out.println("Indovina un numero tra 1 e 5: ");
          userInput = scanner.nextInt();//from  www . j a  v a 2  s.  c  om
        }
        scanner.close();


		int randomNum = (int)(Math.random() * 5) + 1;

		System.out.println("Il numero casuale è " + randomNum);

		if(userInput == randomNum) {
			System.out.println("Bingo, hai indovinato");
		}
		else if(randomNum + 1 == userInput || randomNum - 1 == userInput) {
			System.out.println("Ci sei andato vicino, hai sbagliato di 1");
		}
		else if(randomNum + 2 == userInput || randomNum - 2 == userInput) {
			System.out.println("Peccato, hai sbagliato di 2");
		}
		else{
		    System.out.println("Spiacenti, il tuo numero non corrisponde");
		}
	}
}

