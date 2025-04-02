/*
Perform Calculations
[x] Compute total study hours per day (oreGiornata).
[x] Compute total study hours per subject (oreMaterie).
[x] Calculate the average study hours per day.
[x] Calculate the average study hours per subject.
[x] Identify the day with the highest total study hours.
[x] Identify the subject with the highest total study hours.

Output Results
[x] Print total study hours per day.
[x] Print total study hours per subject.
[x] Print the average study hours per day and per subject.
[x] Print the day with the most study hours.
[x] Print the subject with the most study hours.
[ ] If the average study time per day is below 2 hours, suggest studying more.
*/
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] giorni = {"Lunedì", "Martedì" , "Mercoledì"};
		String[] materie = {"Matematica", "Informatica" , "Inglese"};

		double[][] oreStudio = new double[giorni.length][materie.length];

//Input
		for(int i = 0; i < giorni.length; i++) {
			System.out.printf("%s%n---------%n", giorni[i] );
			for(int j = 0; j < materie.length; j++) {
				System.out.printf("%s: %n",materie[j]);
				String input = br.readLine();
                oreStudio[i][j] = input.isEmpty() ? 0.0 : Double.parseDouble(input); //code wont crash if user put enter(empty string)
			}
			System.out.printf("%n");
		}

//Calcolare
        //Ore totale
		double[] oreGiornata = new double[giorni.length];
		double[] oreMaterie = new double[materie.length];

		for(int i = 0; i < giorni.length; i++) {
			for(int j = 0; j < materie.length; j++) {
				oreGiornata[i] += oreStudio[i][j];
			}
		}

		for(int i = 0; i < materie.length; i++) {
			for(int j = 0; j < giorni.length; j++) {
				oreMaterie[i] += oreStudio[j][i];
			}
		}
		
		//Media
		double mediaGiornata = 0;
		double mediaMaterie = 0;
		
		for(int i = 0; i < oreGiornata.length; i++) {
			mediaGiornata += oreGiornata[i];
		}
		
		for(int i = 0; i < oreMaterie.length; i++) {
			mediaMaterie += oreMaterie[i];
		}
		
		mediaGiornata = mediaGiornata / giorni.length;
		mediaMaterie = mediaMaterie / materie.length;
		
		//Più alto
		int maxGiornoIndx = 0;
		int maxMateriaIndx = 0;
		
		for(int i = 1; i < oreGiornata.length; i++) {
			if(oreGiornata[i] > oreGiornata[maxGiornoIndx]){
			    maxGiornoIndx = i;
			}
		}
		
		for(int i = 1; i < oreMaterie.length; i++) {
			if(oreMaterie[i] > oreMaterie[maxMateriaIndx]){
			    maxMateriaIndx = i;
			}
		}

//Stampare risulti
        //Ore totale
		System.out.printf("%nGiornata%n---------%n");
		for(int i = 0; i < giorni.length; i++) {
			System.out.printf("%s: %.0f ore%n", giorni[i], oreGiornata[i]);
		}

		System.out.printf("%n%nCategoria%n---------%n");
		for(int i = 0; i < materie.length; i++) {
			System.out.printf("%s: %.0f ore%n", materie[i], oreMaterie[i]);
		}
		
		//Media
		System.out.printf("%n%nMedia%n---------%n");
		System.out.printf("Ogni giorno: %.0f ore%n", mediaGiornata);
		System.out.printf("Ogni mmateria: %.0f ore%n", mediaMaterie);
		
		//Più alto
		System.out.printf("\nGiorno con più ore di studio: %s (%.0f ore)%n", giorni[maxGiornoIndx], oreGiornata[maxGiornoIndx]);
        System.out.printf("Materia con più ore di studio: %s (%.0f ore)%n", materie[maxMateriaIndx], oreMaterie[maxMateriaIndx]);

		//SSuggerimento
		if(mediaGiornata < 2){
		    System.out.printf("\nSuggerimento: La media giornaliera è inferiore a 2 ore. Ti consigliamo di studiare di più!");
		}
	}
}
