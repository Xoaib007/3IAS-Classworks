/******************************************************************************

Le tasse in Italia si pagano sulla base del reddito; nello specifico il calcolo delle tasse rispetto al reddito C(
basato sulla seguente tabella
Scaglioni reddito 2024                Aliquota                   Tasse da pagare 2024
da 0 a 28.000 euro                    23%                        23% del reddito
da 28.000,01 a 50.000 euro            35%                        6.440 + 35% sulla parte eccedente i 28.000 euro
da 50.000,01 in poi                   43%                        14.140 +43% sulla parte eccedente i 50.000 euro

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci reditto: ");
		double reditto = scanner.nextDouble();

		double tasse = 0;

		if(reditto <= 28000) {
			tasse = reditto * .23;
		}
		else if(28000 < reditto && reditto <= 50000) {
			tasse = 6440 + ((reditto - 28000) * .35);
		}
		else if(reditto > 50000) {
			tasse = 14140 + ((reditto - 50000) * .43);
		}

		System.out.println("Tasse da pagare: " + tasse);
	}
}
