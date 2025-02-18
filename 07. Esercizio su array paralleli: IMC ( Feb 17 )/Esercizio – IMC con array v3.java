import java.util.*;

public class Main
{
	public static void main(String[] args) {

		double[][] valori = new double[2][100]; //0: peso, 1: alteza
		double[] imcvalues = new double[100];

		for(int i = 0; i < 100; i++) {
			double randomPeso = 45 + (Math.random() * (140 - 45 + 1));
			double randomAltezza = 140 + (Math.random() * (220 - 140 + 1));
			valori[0][i] = randomPeso;
			valori[1][i] = randomAltezza / 100;
			imcvalues[i] = randomPeso / ((randomAltezza * randomAltezza) / 1000);
		}

		//quante persone hanno un peso, altezza e imc inferiore e superiore al medio

		double[] somme = new double[3]; // 0: peso, 1: altezza, 2: imc

		for(int i = 0; i < 100; i++) {
			somme[0] += valori[0][i];
			somme[1] += valori[1][i];
			somme[2] += imcvalues[i];
		}

		double[] medie = {somme[0] / 100, somme[1] / 100, somme[2] / 100}; // 0: peso, 1: altezza, 2: imc

		double[] countSuperiore = new double[3], countInferiore = new double[3];

		double[][] valori2 = {valori[0], valori[1], imcvalues};

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 3; j++) {
				if (valori2[j][i] > medie[j]) countSuperiore[j]++;
				else if (valori2[j][i] < medie[j]) countInferiore[j]++;
			}
		}

		String[] labels = {"Peso", "Altezza", "IMC"}, units = {"kg", "m", ""};

		for (int i = 0; i < 3; i++) {
			System.out.printf("%n%s:%nMedia: %.2f %s%nSuperiore: %.0f%nInferiore: %.0f%n", labels[i], medie[i], units[i], countSuperiore[i], countInferiore[i]);
		}
	}
}
