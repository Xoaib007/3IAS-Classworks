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

Archiviare in 3 array paralleli i dati di peso e altezza, acquisiti in input e di IMC, calcolati dallbalgoritmo.
Fare in modo che lbinput non avvenga manualmente, ma che gli array siano riempiti da 100 coppie di
numeri casuali
- da 140 cm e 220 cm per lbaltezza
- da 45 Kg a 140 KG per il peso
Calcolare IMC corrispondente a ognuno delle 100 coppie di altezza e peso
DopodichC) calcolare e comunicare:
[x] quante persone hanno un peso inferiore e superiore al peso medio
[x] quante persone hanno unbaltezza inferiore e superiore allbaltezza media
[] quante persone hanno un IMC inferiore e superiore allbIMC medio

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {

		double[] peso = new double[100];
		double[] altezza = new double[100];

		for(int i = 0; i < peso.length; i++) {
			double randomPeso = 45 + (double)(Math.random() * (140 - 45 + 1));
			double randomAltezza = 140 + (double)(Math.random() * (220 - 140 + 1));
			peso[i] = randomPeso;
			altezza[i] = randomAltezza / 100;
		}

		// Calcolare IMC
		double[] imcvalues = new double[100];

		for (int i = 0; i < imcvalues.length ; i++) {
			imcvalues[i] = peso[i] / (altezza[i] * altezza[i]);
		}

		//quante persone hanno un peso inferiore e superiore al peso medio

		double pesoSomma = 0;

		for(int i = 0; i < peso.length; i++) {
			pesoSomma += peso[i];
		}

		double pesoMedia = pesoSomma / 100;

		double countPesoSuperiore = 0;
		double countPesoInferiore = 0;

		for(int i = 0; i< peso.length; i++) {
			if(peso[i] > pesoMedia) {
				countPesoSuperiore++;
			}
			else if(peso[i] < pesoMedia) {
				countPesoInferiore++;
			}
		}

		System.out.printf("Peso:%nMedia: %.2f kg%nSuperiore: %.0f%nInferiore: %.0f%n", pesoMedia, countPesoSuperiore, countPesoInferiore);


		//quante persone hanno un altezza inferiore e superiore al peso medio

		double altezzaSomma = 0;

		for(int i = 0; i < altezza.length; i++) {
			altezzaSomma += altezza[i];
		}

		double altezzaMedia = altezzaSomma / 100;

		double countAltezzaSuperiore = 0;
		double countAltezzaInferiore = 0;

		for(int i = 0; i< altezza.length; i++) {
			if(altezza[i] > altezzaMedia) {
				countAltezzaSuperiore++;
			}
			else if(altezza[i] < altezzaMedia) {
				countAltezzaInferiore++;
			}
		}

		System.out.printf("%nAltezza:%nMedia: %.2f m%nSuperiore: %.0f%nInferiore: %.0f%n", altezzaMedia, countAltezzaSuperiore, countAltezzaInferiore);





		//quante persone hanno un IMC inferiore e superiore al peso medio

		double imcSomma = 0;

		for(int i = 0; i < imcvalues.length; i++) {
			imcSomma += imcvalues[i];
		}

		double imcMedia = imcSomma / 100;

		double countimcSuperiore = 0;
		double countimcInferiore = 0;

		for(int i = 0; i< imcvalues.length; i++) {
			if(imcvalues[i] > imcMedia) {
				countimcSuperiore++;
			}
			else if(imcvalues[i] < imcMedia) {
				countimcInferiore++;
			}
		}

		System.out.printf("%nIMC:%nMedia: %.2f%nSuperiore: %.0f%nInferiore: %.0f%n", imcMedia, countimcSuperiore, countimcInferiore);
	}
}
