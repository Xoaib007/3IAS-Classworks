public class Main
{
	public static void main(String[] args) {
	    
	    // Array delle temperature giornaliere
	    double[] temperature = {22.5, 18.3, 25.0, 30.2, 19.8, 23.4, 28.0};
	    
	    // Calcola la media settimanale
	    double media = calcolareMedia(temperature);
	    // Trova la temperatura più alta
	    double massimo = trovaMassimo(temperature);
	    // Trova la temperatura più bassa
	    double minimo = trovaMinimo(temperature);
	    
	    // Stampa dei risultati principali
	    System.out.printf("La temperatura media settimanale: %.2f\n\n", media);
	    System.out.printf("La temperatura massima: %.2f\n\n", massimo);
	    System.out.printf("La temperatura minima: %.2f\n\n", minimo);
	    System.out.printf("Giorni hanno avuto una temperatura superiore alla media: %d\n\n", contareSuperiorAllaMedia(temperature, media));
	    System.out.printf("Giorni sopra i 25°C: %d\n\n", contareSopra25(temperature));
	    System.out.printf("La variazione di temperatura: %.2f\n\n", calcolareVariazione(massimo, minimo));
	    
	    // Calcola e stampa la media per ogni settimana
	    double[] medieSettimanali = calcolaMediaSettimane(temperature);
	    for (int i = 0; i < medieSettimanali.length; i++) {
	        System.out.printf("Media della settimana %d: %.2f°C\n", i + 1, medieSettimanali[i]);
	    }
	}
	
	// Calcola la media
	public static double calcolareMedia(double[] temperature) {
	    double somma = 0;
	    
	    for(int i = 0; i < temperature.length; i++){
	        somma += temperature[i];
	    }
	    
	    double media = somma / temperature.length;
	    
	    return media;
	}
	
	// Cerca la temperatura massima nell'array
	public static double trovaMassimo(double[] temperature) {
	    double massimo = temperature[0];
	    
	    
	    for(int i = 0; i < temperature.length; i++){
	        if(temperature[i] > massimo){
	            massimo =  temperature[i];
	        }
	    }
	    
	    return massimo;
	}
	
	// Cerca la temperatura minima nell'array
	public static double trovaMinimo(double[] temperature) {
	    double minimo = temperature[0];
	    
	    for(int i = 0; i < temperature.length; i++){
	        if(temperature[i] < minimo){
	            minimo =  temperature[i];
	        }
	    }
	    
	    return minimo;
	}
    
    // Conta i giorni sopra la media
	public static int contareSuperiorAllaMedia(double[] temperature, double media) {
	    int contare = 0;
	    
	    for(int i = 0; i < temperature.length; i++){
	        if(temperature[i] > media){
	            contare++;
	        }
	    }
	    
	    return contare;
	}
	
	// Conta i giorni con temperatura sopra i 25°C
	public static int contareSopra25(double[] temperature) {
	    int contare = 0;
	    
	    for(int i = 0; i < temperature.length; i++){
	        if(temperature[i] > 25.0){
	            contare++;
	        }
	    }
	    
	    return contare;
	}
	
	// Calcola la differenza tra max e min
	public static double calcolareVariazione(double massimo, double minimo) {
	    
	    return massimo - minimo;
	}
	
	// Calcola la media per ogni settimana completa
	public static double[] calcolaMediaSettimane(double[] temperature) {
	    int settimane = temperature.length / 7;
	    double[] medie = new double[settimane];
	    
	    for (int i = 0; i < settimane; i++) {
	        double somma = 0.0;
	        for (int j = 0; j < 7; j++) {
	            somma += temperature[i * 7 + j];
	        }
	        medie[i] = somma / 7;
	    }
	    
	    return medie;
	}
}



















/******************************************************************************

Scrivere un programma Java che analizzi un array di temperature (valori di temperatura
giornaliera) e utilizzi i metodi statici per calcolare statistiche riguardanti i dati.
L'array di temperatura deve essere creato e inizializzato direttamente nel main().
Esempio:
double[] temperature = {22.5, 18.3, 25.0, 30.2, 19.8, 23.4, 28.0};
[x] Calcolare la temperatura media settimanale.
[x] Trovare la temperatura massima e la temperatura minima della settimana.
[x] Contare quanti giorni hanno avuto una temperatura superiore alla media.
[x] Calcolare il numero di giorni sopra i 25°C.
[x] Calcolare la variazione di temperatura (differenza tra la temperatura più alta e la più
bassa).
[x] Calcolare la temperatura media di una settimana (una settimana è un intervallo di 7
giorni).
[x] Stampare i risultati nel main().

[x] calcolareMedia()
[x] trovaMassimo()
[x] trovaMinimo()
[x] contareSuperiorAllaMedia()
[x] contareSopra25()
[x] calcolareVariazione()

*******************************************************************************/
