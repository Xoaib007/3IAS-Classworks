/******************************************************************************

Dati in input le misure di tre lati di un triangolo comunicare se C(
    - Equilatero (tre lati uguali)
    - Isoscele (due lati uguali)
    - Scaleno (nessun lato uguale)

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserisci il primo lato: ");
		double lato1 = scanner.nextDouble();

		System.out.println("Inserisci il secondo lato: ");
		double lato2 = scanner.nextDouble();

		System.out.println("Inserisci il terzo lato: ");
		double lato3 = scanner.nextDouble();

		if (lato1 == lato2 && lato2 == lato3) {
			System.out.println("Il triangolo C( Equilatero");
		}
		else if (lato1 == lato2 || lato2 == lato3 || lato1 == lato3) {
			System.out.println("Il triangolo C( Isoscele");
		}
		else {
			System.out.println("Il triangolo C( Scaleno");
		}
	}
}
