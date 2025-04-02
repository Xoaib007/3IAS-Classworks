import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] giorniSettimana = {"Lunedi", "Martedi"};
		String[] categorieSpesa = {"Alimentari", "Trasporti", "Intrattenimento", "Casa", "Abbigliamento", "Altri"};

		double[][] spese = new double[giorniSettimana.length][categorieSpesa.length];

		for(int i = 0; i < giorniSettimana.length; i++) {
			System.out.printf("%s%n---------%n", giorniSettimana[i] );
			for(int j = 0; j < categorieSpesa.length; j++) {
				System.out.printf("%s: %n",categorieSpesa[j]);
				String input = br.readLine();
                spese[i][j] = input.isEmpty() ? 0.0 : Double.parseDouble(input); //code wont crash if user put enter(empty string)
			}
			System.out.printf("%n");
		}

//Calcolare
		double[] speseGiornata = new double[giorniSettimana.length];
		double[] speseCategoria = new double[categorieSpesa.length];

		for(int i = 0; i < giorniSettimana.length; i++) {
			for(int j = 0; j < categorieSpesa.length; j++) {
				speseGiornata[i] += spese[i][j];
			}
		}

		for(int i = 0; i < categorieSpesa.length; i++) {
			for(int j = 0; j < giorniSettimana.length; j++) {
				speseCategoria[i] += spese[j][i];
			}
		}

//Stampare risulti
		System.out.printf("%nGiornata%n---------%n");
		for(int i = 0; i < giorniSettimana.length; i++) {
			System.out.printf("%s: %.0f€%n", giorniSettimana[i], speseGiornata[i]);
		}

		System.out.printf("%n%nCategoria%n---------%n");
		for(int i = 0; i < categorieSpesa.length; i++) {
			System.out.printf("%s: %.0f€%n", categorieSpesa[i], speseCategoria[i]);
		}

		double totaleComplessivo = 0;
		for(double spesa : speseGiornata) {
			totaleComplessivo += spesa;
		}
		System.out.printf("%nTotale complessivo: %.0f€%n%n", totaleComplessivo);

//Implimentazione
		String[][] massimoMinimoSpese = new String[2][2]; //[giorni][massimo,minimo]
		for(int i = 0; i < 2; i++) {

			int massimo = 0;
			int minimo = 0;

			for(int j = 1; j < categorieSpesa.length; j++) {
				if(spese[i][j] > spese[i][j-1]) massimo = j;
				if(spese[i][j] < spese[i][j-1]) minimo = j;
			}

			massimoMinimoSpese[i][0] = categorieSpesa[massimo];
			massimoMinimoSpese[i][1] = categorieSpesa[minimo];
		}

		for(int i = 0; i < 2; i++) {
			System.out.printf("%n%s:- Massimo: %s, Minimo: %s%n", giorniSettimana[i], massimoMinimoSpese[i][0],  massimoMinimoSpese[i][1]);
		}
	}
}

