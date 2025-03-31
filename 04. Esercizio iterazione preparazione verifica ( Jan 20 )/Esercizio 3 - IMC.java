/******************************************************************************

Dati in input il peso e lbaltezza di tre persone calcolare lbindice di massa corporea determinabile con la
seguente formula:

IMC = peso / (altezza ^ 2)

Con MassaCorporea espressa in Kg con un decimale e statura espressa in metri con due decimali.
Sapendo che una persona e:
    - obesa (una persona C( obesa se IMC > 30)
    - sovrappeso (25 <= IMC <= 30)
    - regolare (19 <= IMC < 25)
    - sottopeso (IMC < 19)

Stabilire e comunicare:
- quanti chili deve perdere o acquisire una persona per diventare di bpeso regolareb
- la media di chili da perdere (per le persone che devono perdere peso)
separatamente
- la media dei chili da acquisire (per le persone che devono acquisire peso)

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input
		Double[] peso = {0.0, 0.0, 0.0};
		Double[] altezza = {0.0, 0.0, 0.0};

		for (int i = 0; i < peso.length ; i++) {
			System.out.printf("Inserisci peso della persone %d: \n", (i + 1));
            peso[i] = scanner.nextDouble();
            
            System.out.printf("Inserisci altezza della persone %d: \n", (i + 1));
            altezza[i] = scanner.nextDouble() * 0.01;
		}

		// Calcolare IMC
		Double[] imcvalues = {0.0, 0.0, 0.0};

		for (int i = 0; i < 3 ; i++) {
			imcvalues[i] = peso[i] / (altezza[i] * altezza[i]);
		}


		//Print risulti

		System.out.println("");

		Double amountAdd = 0.0;
		Double amountLoose = 0.0;

		Double countAdd = 0.0;
		Double countLoose = 0.0;

		for(int i = 0; i < 3; i++) {

			if(imcvalues[i] < 19) {
				Double toAdd = (19 * altezza[i] * altezza[i]) - peso[i];

				System.out.printf("IMC della Persone %d è %.2f (Sottopeso)\n", (i + 1), imcvalues[i]);
				//System.out.println("Deve acquistare: " + toAdd + " kg");
				System.out.printf("Deve acquistare: %.2f kg\n", toAdd);

				amountAdd = amountAdd + toAdd;
				countAdd++;
			}
			else if(19 <= imcvalues[i] && imcvalues[i] < 25) {
				System.out.printf("IMC della Persone %d è %.2f (Regolare)\n", (i + 1), imcvalues[i]);
			}
			else if(25 <= imcvalues[i] && imcvalues[i] <= 30) {
				Double toLoose = peso[i] - (19 * altezza[i] * altezza[i]);

				System.out.printf("IMC della Persone %d è %.2f (Soprapeso)\n", (i + 1), imcvalues[i]);
				System.out.printf("Deve perdere: %.2f kg\n", toLoose);

				amountLoose = amountLoose + toLoose;
				countLoose++;
			}
			else if(imcvalues[i] > 30) {
				Double toLoose = peso[i] - (19 * altezza[i] * altezza[i]);

				System.out.printf("IMC della Persone %d è %.2f (Obesa)\n", (i + 1), imcvalues[i]);
				System.out.printf("Deve perdere: %.2f kg\n", toLoose);

				amountLoose = amountLoose + toLoose;
				countLoose++;
			}

			System.out.println("");
		}

		//System.out.println("la media di chili da perdere: " + (amountAdd / countAdd) + " kg");
		//System.out.println("la media di chili da acquistare: " + (amountLoose / countLoose) + " kg");
		
		System.out.printf("La media di chili da perdere: %.2f kg\n", (amountLoose / countLoose));
		System.out.printf("La media di chili da acquistare: %.2f kg\n", (amountAdd / countAdd));

	}
}

// Note 1: Use printf for more flexibility

