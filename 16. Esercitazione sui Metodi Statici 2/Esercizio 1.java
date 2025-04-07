/******************************************************************************

Scrivi un programma in Java che analizzi un array di numeri interi già definiti nel codice (non
da input utente).
Il programma deve utilizzare metodi statici per eseguire le seguenti operazioni:
x1. Calcolare la somma di tutti gli elementi dell’array.
x2. Trovare il valore massimo nell’array.
x3. Trovare il valore minimo nell’array.
x4. Calcolare la media dei numeri.
x5. Contare quanti numeri sono pari.
x6. Contare quanti numeri sono maggiori della media.
x7. L’array deve essere creato e inizializzato nel main ( int[] numeri = {12, 7, 9, 20, 5, 17,
8};)
x8. Tutte le operazioni devono essere svolte tramite metodi static separati.
x9. Stampare i risultati nel main.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int[] numbers = {
            812, 234, 675, 921, 133, 406, 789, 318, 502, 167,
            704, 893, 210, 357, 445, 122, 658, 301, 974, 809,
            612, 476, 883, 295, 158, 439, 747, 692, 328, 111,
            525, 208, 603, 750, 284, 970, 364, 187, 699, 144,
            832, 541, 612, 415, 936, 258, 747, 347, 661, 379
        };
        
        int somma = somma(numbers);
        int media = somma / numbers.length;
        
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
