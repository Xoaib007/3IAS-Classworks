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
