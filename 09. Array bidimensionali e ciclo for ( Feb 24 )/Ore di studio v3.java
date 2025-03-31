import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] giorni = {"Lunedì", "Martedì", "Mercoledì"};
        String[] materie = {"Matematica", "Informatica", "Inglese"};
        double[][] oreStudio = new double[3][3];

        double[] oreGiornata = new double[3], oreMaterie = new double[3];
        double mediaGiornata = 0, mediaMaterie = 0;
        int maxGiornoIndx = 0, maxMateriaIndx = 0;

        // Input e calcolare
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s%n---------%n", giorni[i]);
            for (int j = 0; j < 3; j++) {
                System.out.printf("%s: ", materie[j]);
                String input = br.readLine();
                oreStudio[i][j] = input.isEmpty() ? 0.0 : Double.parseDouble(input);
                oreGiornata[i] += oreStudio[i][j];
                oreMaterie[j] += oreStudio[i][j];

                if (oreMaterie[j] > oreMaterie[maxMateriaIndx]) maxMateriaIndx = j;
            }
            System.out.printf("%n");
            mediaGiornata += oreGiornata[i];
            if (oreGiornata[i] > oreGiornata[maxGiornoIndx]) maxGiornoIndx = i;
        }

        mediaGiornata /= 3;
        mediaMaterie = (oreMaterie[0] + oreMaterie[1] + oreMaterie[2]) / 3;

        // Stampare risultati
        System.out.printf("%nOre di studio per giorno e materia%n------------------%n");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s: %.0f ore | %s: %.0f ore%n", giorni[i], oreGiornata[i], materie[i], oreMaterie[i]);
        }

        System.out.printf("%nMedia%n---------%nOgni giorno: %.1f ore%nOgni materia: %.1f ore%n", mediaGiornata, mediaMaterie);
        System.out.printf("\nGiorno con più ore di studio: %s (%.0f ore)%nMateria con più ore di studio: %s (%.0f ore)%n",
                giorni[maxGiornoIndx], oreGiornata[maxGiornoIndx], materie[maxMateriaIndx], oreMaterie[maxMateriaIndx]);

        if (mediaGiornata < 2) System.out.println("\nSuggerimento: La media giornaliera è inferiore a 2 ore. Ti consigliamo di studiare di più!");
    }
}

