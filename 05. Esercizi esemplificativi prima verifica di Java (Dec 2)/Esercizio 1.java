/******************************************************************************

Scrivere un programma che consenta di inserire in input una data (giorno e mese senza
anno); comunicare rispetto a questa data quanti giorni mancano alla fine del mese

(ad esempio, se C( inserisco 4 gennaio dovrC2 dire mancano 27 giorni alla fine del mese; se
inserisco 18 novembre dovrC2 dire mancano 12 giorni alla fine del mese ...)

Ricordare che:
Trenta giorni ha novembre, con aprile, giugno e settembre di 28 ce nbC( uno (febbraio) tutti gli altri
ne han 31 (non considerare gli anni bisestili)

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci il data: ");
		int data = scanner.nextInt();

		System.out.println("Inserisci il mese: ");
		int mese = scanner.nextInt();

		int giornoMancata = 0;


		if(mese == 4 || mese == 6 || mese == 9 || mese == 11) {
			giornoMancata = 30 - data;
		}
		else if(mese == 2) {
			giornoMancata = 28 - data;
		}
		else {
			giornoMancata = 31 - data;
		}


		System.out.println("Mancano " + giornoMancata + " giorni alla fine del mese");
	}
}
