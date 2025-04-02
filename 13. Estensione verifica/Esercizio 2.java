/***
Esercizio 2: Comunicare quante volte un numero presente nella posizione i-1 - esima dell’array risulta divisore della
posizione i
***/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		int[] numeriCasuali = new int[100];

		int countDispari = 0;
		int countPari = 0;
		int countDivisore1 = 0;
		int countDivisore2 = 0;


		for(int i = 0; i < 100; i++) {
			int numero = (int)(Math.random() * 100);
			numeriCasuali[i] = numero;

			if(numero % 2 == 0) {
				countPari++;
			} else {
				countDispari++;
			}

			if (i != 0 && numeriCasuali[i - 1] != 0 && numeriCasuali[i] % numeriCasuali[i - 1] == 0) {
                countDivisore++;
            }
            
            if (i != 0 && numero != 0 && numeriCasuali[i - 1] % numero == 0) {
                countDivisore2++;
            }
		}

		for(int num: numeriCasuali) {
			System.out.printf("%d, ", num);
		}
		System.out.printf("%n");

		System.out.printf("Dispari: %d%n", countDispari);
		System.out.printf("Pari: %d%n", countPari);
		System.out.printf("Divisore della posizione i-1: %d%n", countDivisore);
		System.out.printf("Divisore della posizione i: %d%n", countDivisore2);
	}
}
