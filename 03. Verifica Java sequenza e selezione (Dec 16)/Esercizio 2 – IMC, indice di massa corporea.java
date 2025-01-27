/******************************************************************************

Dati in input il peso e lbaltezza di tre persone calcolare lbindice di massa corporea determinabile con la
seguente formula:

IMC = peso / (altezza ^ 2)

Con MassaCorporea espressa in Kg con un decimale e statura espressa in metri con due decimali.
Sapendo che una persona C(:
    - obesa (una persona C( obesa se IMC > 30)
    - sovrappeso (25 <= IMC <= 30)
    - regolare (19 <= IMC < 25)
    - sottopeso (IMC < 19)

Comunicare lbIMC della persona e la sua classificazione rispetto ai 4 casi sopra elencati
Comunicare infine, in base alle 3 persone, quante sono sottopeso, regolari, sovrappeso e obese

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input
		double[] peso = {0, 0, 0};
		double[] altezza = {0, 0, 0};

		for (int i = 0; i < peso.length ; i++) {
			System.out.println("Inserisci peso della persone " + (i + 1) + ": ");
			peso[i] = scanner.nextDouble();

			System.out.println("Inserisci altezza della persone " + (i +1) + ": ");
			altezza[i] = scanner.nextDouble() * 0.01;
		}

		// Calcolare IMC
		double[] imcvalues = {0, 0, 0};

		for (int i = 0; i < imcvalues.length ; i++) {
            imcvalues[i] = peso[i] / (altezza[i] * altezza[i]);
		}


		//Contriolla classificazione
		String[] classificazione = {"","",""};

		String[] nomeClassificazioni = {"Sottopeso","Normale","Sovrapeso", "Obesa"};
		int[] countClassificazione = {0, 0, 0, 0};

		for(int i = 0; i < imcvalues.length; i++) {
			if(imcvalues[i] < 19) {
				classificazione[i] = "sottopeso";
				countClassificazione[0]++;
			}
			else if(19 <= imcvalues[i] && imcvalues[i] < 25) {
				classificazione[i] = "regolare";
				countClassificazione[1]++;
			}
			else if(25 <= imcvalues[i] && imcvalues[i] <= 30) {
				classificazione[i] = "sobrapeso";
				countClassificazione[2]++;
			}
			else if(imcvalues[i] > 30) {
				classificazione[i] = "obesa";
				countClassificazione[3]++;
			}
		}

		//Print risulti
		System.out.println("");
		for(int i = 0; i < imcvalues.length; i++) {
			System.out.println("IMC della Persone " + (i + 1) + " è " + imcvalues[i]);
		}

		System.out.println("");

		for(int i = 0; i < classificazione.length; i++) {
			System.out.println("Persone " + (i + 1) + " è " + classificazione[i]);
		}

		System.out.println("");
		System.out.println("Classificazione count");

		for(int i = 0; i < countClassificazione.length; i++) {
			System.out.println( nomeClassificazioni[i] + ":" + countClassificazione[i]);
		}


	}
}

// System.out.println("Persone" + i + " C) obesa");
