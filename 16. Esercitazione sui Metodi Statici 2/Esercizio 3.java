/******************************************************************************

Scrivere un programma in Java che definisce una matrice bidimensionale già preimpostata:
int[][] matrice = {
{12, 7, 3, 9},
{5, 8, 2, 4},
{6, 15, 10, 1}
};

Utilizza metodi statici per:
x1. Calcolare la somma di tutti gli elementi nella matrice.
x2. Trovare il massimo e il minimo della matrice.
x3. Calcolare la media di tutti gli elementi.
x4. Contare quante righe contengono numeri pari.
x5. Contare quante colonne contengono numeri dispari.
x6. Stampare la matrice e poi i risultati.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int[][] matrice =   {
                                {12, 7, 3, 9},
                                {5, 8, 2, 4},
                                {6, 15, 10, 1}
                            };
        
        int somma = somma(matrice);
        
        for(int[] row : matrice){
	        for(int col : row){
	            System.out.printf(" %d ", col);
	        }
	        System.out.printf("%n");

	    }
        System.out.printf("Somma: %d%n", somma);
        System.out.printf("Massimo:  %d%n", massimo(matrice));
        System.out.printf("Minimo:  %d%n",  minimo(matrice) );
        System.out.printf("Media:  %d%n", media(matrice, somma));
        System.out.printf("Righe contengono numeri pari:  %d%n", countPariRow(matrice));
        System.out.printf("Colonne contengono numeri disparipari:  %d%n", countDispariCol(matrice));



	}
	
	public static int somma(int[][] matrice) {
	    int somma = 0;
	    
	    for(int[] row: matrice){
	        for(int col: row){
	            somma += col;
	        }
	    }
	    
	    return somma;
	}
	
	public static int massimo(int[][] matrice) {
	    int massimo = 0;
	    
	    for(int[] row: matrice){
	        for(int col: row){
	            if(col > massimo){
	                massimo = col;
	            }
	        }
	    }
	    
	    return massimo;
	}
	
	public static int minimo(int[][] matrice) {
	    int minimo = matrice[0][0];
	    
	    for(int[] row: matrice){
	        for(int col: row){
	            if(col < minimo){
	                minimo = col;
	            }
	        }
	    }
	    
	    return minimo;
	}
	
	public static int media(int[][] matrice, int somma) {
	    int countElement = 0;
	    
        for(int[] row: matrice){
	        for(int col: row){
	            countElement++;
	        }
	    }
	    
	    int media = somma / countElement;
	    
	    return media;
	}
	
	public static int countPariRow(int[][] matrice) {
	    int countPari = 0;
	    
	    for(int[] row: matrice){
	        boolean contengePari = false;
	        
	        for(int col: row){
	            if(col % 2 == 0){
	                contengePari = true;
	                break;
	            }
	        }
	        
	        if (contengePari) countPari++;

	    }
	    
	    return countPari;
	}
	
	public static int countDispariCol(int[][] matrice) {
	    int countDispari = 0;
	    
	    for(int i = 0; i < matrice[0].length; i++){
	        boolean contengeDispari = false;
	        
	        for(int j = 0; j < matrice.length; j++){
	            if(matrice[j][i] % 2 == 0){
	                contengeDispari = true;
	                break;
	            }
	        }
	        
	        if (contengeDispari) countDispari++;
	    }
	    
	    return countDispari;
	}
}
