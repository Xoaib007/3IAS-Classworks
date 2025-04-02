/***
Scrivere un programma JAVA che scrive in un array parallelo di 100 elementi dei numeri casuali compresi tra
1 e 100.
Dopo la registrazione dei dati negli array:
1) Comunicare complessivamente quante volte è stato registrato nell’array un numero dispari e quante
un numero pari
2) Comunicare quante volte un numero presente nella posizione i-esima dell’array risulta divisore della
posizione i-1 (esempio se nella posizione 1 c’è 7 e nella posizione 2 c’è 49 si conta come divisore)
***/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int[] numeriCasuali = new int[100];

		int countDispari = 0;
		int countPari = 0;
		int countDivisore = 0;


		for(int i = 0; i < 100; i++) {
			int numero = (int)(Math.random() * 100);
			numeriCasuali[i] = numero;

			if(numero % 2 == 0) {
				countPari++;
			} else {
				countDispari++;
			}

			if (i != 0 && numeriCasuali[i - 1] != 0 && numero % numeriCasuali[i - 1] == 0) {
                countDivisore++;
            }
		}

		for(int num: numeriCasuali) {
			System.out.printf("%d, ", num);
		}
		System.out.printf("%n");

		System.out.printf("Dispari: %d%n", countDispari);
		System.out.printf("Pari: %d%n", countPari);
		System.out.printf("Divisore della posizione i-1: %d%n", countDivisore);
	}
}
