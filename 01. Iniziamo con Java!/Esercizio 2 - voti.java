/******************************************************************************

Scrivere un programma java che, dati in input 4 voti di uno studente comunichi il numero di sufficienze e di
insufficienze; comunicare in output anche la media dei voti.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci prima voto");
		double prima = scanner.nextDouble();

		System.out.println("Inserisci secondo voto");
		double secondo = scanner.nextDouble();

		System.out.println("Inserisci terza voto");
		double terza = scanner.nextDouble();

		System.out.println("Inserisci quarta voto");
		double quarta = scanner.nextDouble();

		double media = (prima + secondo + terza + quarta) / 4;

		System.out.println("Media" + media);

		if(media <= 5) {
			System.out.println("Sufficente");
		}
		else {
			System.out.println("Insufficente");
		}

	}
}
