/******************************************************************************

La recente proposta di revisione delle tasse prevede una modifica delle aliquote da applicare al
reddito. In particolare, la proposta prevede la seguente tassazione:

    b" 23 per cento per i redditi fino a 28.000 euro;
    b" 35 per cento per la parte dei redditi superiori a 28.000 euro e fino a 50.000 euro (a cui si
    somma il 23% su 28.000 euro)
    b" 43 per cento per i redditi che superano 50.000 euro (a cui si somma il 23% su 28.000 euro
    e il 35% su 22.000 euro).

3a. Calcolare e comunicare le tasse da pagare secondo questo nuovo sistema in base al
reddito inserito

3b. Calcolare e comunicare la differenza tra le tasse da pagare secondo questo nuovo
sistema e il sistema attuale (sul quale avete fatto lbesercizio precedente) sempre in base al
reddito inserito

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci reditto: ");
		double reditto = scanner.nextDouble();

// Sistema attuale

		double tasse1 = 0;

		if(reditto <= 28000) {
			tasse1 = reditto * .23;
		}
		else if(28000 < reditto && reditto <= 50000) {
			tasse1 = 6440 + ((reditto - 28000) * .35);
		}
		else if(reditto > 50000) {
			tasse1 = 14140 + ((reditto - 50000) * .43);
		}

		//Sistema nuovo

		double tasse2 = 0;

		if(reditto <= 28000) {
			tasse2 = reditto * .23;
		}
		else if(28000 < reditto && reditto <= 50000) {
			tasse2 = (28000 * .23) + ((reditto - 28000) * .35);
		}
		else if(reditto > 50000) {
			tasse2 = (28000 * .23) + (22000 * .35) + ((reditto - 50000) * .43);
		}

		double differenza = tasse2 - tasse1;

		System.out.println("Tasse da pagare : " + tasse2);
		System.out.println("Differenza tra secondo questo nuovo sistema e il sistema attuale : " + differenza);
	}
}



