import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    double[] peso = new double[100];
		double[] altezza = new double[100];

		for(int i = 0; i < 100; i++) {
			double randomPeso = 45 + (Math.random() * (140 - 45 + 1));
			double randomAltezza = 140 + (Math.random() * (220 - 140 + 1));
			peso[i] = randomPeso;
			altezza[i] = randomAltezza / 100;
		}

		// Calcolare IMC
		double[] imcvalues = new double[100];

		for (int i = 0; i < 100; i++) {
			imcvalues[i] = peso[i] / (altezza[i] * altezza[i]);
		}

		//quante persone hanno un peso, altezza e imc inferiore e superiore al medio

		double[] somme = new double[3]; // 0: peso, 1: altezza, 2: imc

		for(int i = 0; i < 100; i++) {
			somme[0] += peso[i];
			somme[1] += altezza[i];
			somme[2] += imcvalues[i];
		}

		double[] medie = {somme[0] / 100, somme[1] / 100, somme[2] / 100}; // 0: peso, 1: altezza, 2: imc
		
		double[] countSuperiore = new double[3];
		double[] countInferiore = new double[3];

		double[][] values = {peso, altezza, imcvalues}; 

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 3; j++) {
				if (values[j][i] > medie[j]) {
					countSuperiore[j]++;
				} else if (values[j][i] < medie[j]) {
					countInferiore[j]++;
				}
			}
		}

		String[] labels = {"Peso", "Altezza", "IMC"};
		String[] units = {"kg", "m", ""};

		for (int i = 0; i < labels.length; i++) {
			System.out.printf("%n%s:%nMedia: %.2f %s%nSuperiore: %.0f%nInferiore: %.0f%n",
			                  labels[i], medie[i], units[i], countSuperiore[i], countInferiore[i]);
		}
	}
}
