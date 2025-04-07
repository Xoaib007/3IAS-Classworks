/******************************************************************************

Scrivi un programma in Java che chieda all’utente quanti numeri vuole inserire (dimensione
dell’array) e che chieda all’utente di inserire i valori dell’array uno per uno.
Utilizzi metodi statici per:
x1. Calcolare la somma.
x2. Trovare il valore massimo.
x3. Trovare il valore minimo.
x4. Calcolare la media.
x5. Contare quanti numeri sono pari.
x6. Contare quanti numeri sono maggiori della media.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Array length: %n");
		int length = scanner.nextInt();
		
		int[] numbers = new int[length];
		
		for(int i = 0; i < length; i++){
		    System.out.printf("%d: %n", i + 1);
		    int value = scanner.nextInt();
		    numbers[i] = value;
		}
        
        int somma = somma(numbers);
        int media = somma / length;
        
        System.out.printf("Somma: %d%n", somma);
        System.out.printf("Massimo:  %d%n", massimo(numbers));
        System.out.printf("Minimo:  %d%n",  minimo(numbers) );
        System.out.printf("Media:  %d%n", media);
        System.out.printf("Pari:  %d%n", countPari(numbers));
        System.out.printf("Maggiore della media:  %d%n", maggioreMedia(numbers, media));


	}
	
	public static int somma(int[] nums) {
	    int somma = 0;
	    
	    for(int num: nums){
	        somma += num;
	    }
	    
	    return somma;
	}
	
	public static int massimo(int[] nums) {
	    int massimo = 0;
	    
	    for(int num: nums){
	        if(num > massimo){
	            massimo = num;
	        }
	    }
	    
	    return massimo;
	}
	
	public static int minimo(int[] nums) {
	    int minimo = nums[0];
	    
	    for(int num: nums){
	        if(num < minimo){
	            minimo = num;
	        }
	    }
	    
	    return minimo;
	}
	
	public static int countPari(int[] nums) {
	    int pari = 0;
	    
	    for(int num: nums){
	        if(num % 2 == 0){
	            pari++;
	        }
	    }
	    
	    return pari;
	}
	
	public static int maggioreMedia(int[] nums, int media) {
	    int maggioreMedia = 0;
	    
	    for(int num: nums){
	        if(num > media){
	            maggioreMedia++;
	        }
	    }
	    
	    return maggioreMedia;
	}
}
