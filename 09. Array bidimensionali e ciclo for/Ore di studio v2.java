import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] giorni = {"Lunedì", "Martedì" , "Mercoledì"};
		String[] materie = {"Matematica", "Informatica" , "Inglese"};

		double[][] oreStudio = new double[3][3];

//Input
		for(int i = 0; i < 3; i++) {
			System.out.printf("%s%n---------%n", giorni[i] );
			for(int j = 0; j < 3; j++) {
				System.out.printf("%s: %n",materie[j]);
				String input = br.readLine();
                oreStudio[i][j] = input.isEmpty() ? 0.0 : Double.parseDouble(input);
			}
			System.out.printf("%n");
		}

//Calcolare
        //Ore totale e media
		double[] oreGiornata = new double[3], oreMaterie = new double[3];
	    double mediaGiornata = 0, mediaMaterie = 0;

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				oreGiornata[i] += oreStudio[i][j];
				oreMaterie[i] += oreStudio[j][i];
			}
			mediaGiornata += oreGiornata[i];
		}
		for(double ore : oreMaterie) mediaMaterie += ore;
        mediaGiornata /= 3;
        mediaMaterie /= 3;
		
		//Più alto
		int maxGiornoIndx = 0, maxMateriaIndx = 0;
		
		for(int i = 1; i < 3; i++) {
			if(oreGiornata[i] > oreGiornata[maxGiornoIndx]) maxGiornoIndx = i;
			if(oreMaterie[i] > oreMaterie[maxMateriaIndx]) maxMateriaIndx = i;
		}
		
//Stampare risulti
        //Ore totale
		System.out.printf("%nOre di studio per giorno e materia%n------------------%n");
        for(int i = 0; i < 3; i++) {
            System.out.printf("%s: %.0f ore | %s: %.0f ore%n", giorni[i], oreGiornata[i], materie[i], oreMaterie[i]);
        }
		
		//Media
		System.out.printf("%n%nMedia%n---------%n");
		System.out.printf("Ogni giorno: %.0f ore%nOgni mmateria: %.0f ore%n", mediaGiornata, mediaMaterie);
		
		//Più alto
		System.out.printf("\nGiorno con più ore di studio: %s (%.0f ore)%nMateria con più ore di studio: %s (%.0f ore)%n", giorni[maxGiornoIndx], oreGiornata[maxGiornoIndx], materie[maxMateriaIndx], oreMaterie[maxMateriaIndx]);

		//SSuggerimento
		if(mediaGiornata < 2) System.out.printf("\nSuggerimento: La media giornaliera è inferiore a 2 ore. Ti consigliamo di studiare di più!");
	}
}
