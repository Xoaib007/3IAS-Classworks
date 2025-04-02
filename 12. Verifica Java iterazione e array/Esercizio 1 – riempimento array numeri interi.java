/****
Scrivere un programma JAVA che scrive in un array di 100 elementi una sequenza di numeri.
La sequenza deve essere basata su un numero intero fornito in input che funge da moltiplicatore per le
posizioni dell’array. L’array deve essere riempito con un dato esito della moltiplicazione:

PosizioneArray x NumeroInput
Esempio: se il numero in input è 4 l’array dovrà essere riempito con
0 4 8 12 16 20 ...
Infine, calcolare e comunicare in output la media di tutti i dati presenti nell’array.
****/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Inserisci il numero: %n");
		int input = scanner.nextInt();
		
		int[] riempito = new int[100];
		int sum = 0;
		
		for(int i = 0; i < riempito.length; i++){
			riempito[i] = i * input;
			sum += i * input;
		}
		
		float media = (float)sum / 100;
		
		System.out.printf("Riempito: %n");
		for(int num: riempito){
		    System.out.printf("%d , ", num);
		}
		System.out.printf("%n");
		
		System.out.printf("Media: %.0f%n", media);
	}
}
