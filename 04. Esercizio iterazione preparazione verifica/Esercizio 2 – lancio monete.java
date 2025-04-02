/******************************************************************************

Scrivere un programma JAVA che simula il lancio di 3 monete con testa/croce in contemporanea.
Comunicare in output quante volte escono le diverse combinazioni possibili:
    - 3 teste e 0 croci
    - 2 teste 1 croce
    - 1 testa 2 croci
    - 3 croci
Eseguire il lancio delle 3 monete per un numero di volte fino a che lbutente non decide di fermare il
lancio. Pertanto ad ogni lancio lbutente dovrC  rispondere se vuole o meno un nuovo lancio delle 3 monete
Comunicare sia lbesito di ogni lancio sia lbesito complessivo

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String userInput = " ";

		int countLoop = 0;

		String results = "";

		do {
			int countHead = 0;
			int countTail = 0;
			String result = "";

			for(int i = 0; i < 3; i++) {
				int randomValue = (int)(Math.random() * 2);
				if(randomValue == 0) {
					countHead++;
				}
				else if(randomValue == 1) {
					countTail++;
				}
			}
			System.out.print( countHead + " Heads , " + countTail + " Tails ; ");

			for(int j = 0; j < countHead; j++) {
				result = result + "H";
			}
			for(int k = 0; k < countTail; k++) {
				result = result + "T";
			}

			results = results + result;

			System.out.println(result);

			System.out.println("Inserisci 'Y' per continuare a lanciare o 'N' per fermarti");
			userInput = scanner.nextLine();
			countLoop++;
		}
		while (userInput.equals("Y") || userInput.equals("y"));

		// Stampa risulti
		
		System.out.println("Results: ");
		
		for(int i = 0; i < countLoop; i++) {
		    
		    int countHead = 0;
			int countTail = 0;
			
			System.out.print("Lancia " + i + 1 +": ");
			
			for(int j = 1; j < 4 ; j++) {
                System.out.print(results.charAt((i * 3) + j - 1));
                
                if(results.charAt((i * 3) + j - 1) == 'H'){
                    countHead++;
                }
                else{
                    countTail++;
                }
			}
			System.out.print( " ; " + countHead + " Heads , " + countTail + " Tails ; ");
			System.out.println(" ");
		}

	}
}
