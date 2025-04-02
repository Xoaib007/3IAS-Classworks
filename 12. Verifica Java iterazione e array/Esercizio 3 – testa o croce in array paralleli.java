/****
Scrivere un programma JAVA che simula, con un numero casuale, il lancio di 3 monete con testa/croce in
contemporanea. Il lancio di 3 monete deve essere ripetuto 100 volte.
Per ogni lancio si registri il risultato in 3 array paralleli denominati MONETA1, MONETA2 e MONETA2.
Dopo la registrazione dei dati negli array
1) Comunicare complessivamente quante volte è uscita testa e quante croce
2) Comunicare in output quante volte sono uscite le diverse combinazioni possibili:
- 3 teste e 0 croci
- 2 teste 1 croce
- 1 testa 2 croci
- 3 croci
3) Comunicare quante volte esce in due lanci consecutivi la stessa combinazione esiti del lancio delle tre
monete.
(ad esempio, se nel primo lancio escono tre croci e nel secondo lancio escono tre corsi si conta 1)
***/
public class Main
{
	public static void main(String[] args) {
		int[] moneto1 = new int[100];
		int[] moneto2 = new int[100];
		int[] moneto3 = new int[100];
		
		int countTesta = 0;
		int countCroce = 0;
		
		int[] countCombinazioni = new int[4]; //i[0]:3 teste e 0 croci , i[1]:2 teste 1 croce, i[3]:1 testa 2 croci , i[4]:3 croci
		int prevCombinazione = 0;
		
		int consecutiviCombinazioni = 0;
		
		for(int i = 0; i < 100; i++){
		    int[] lancia = new int[3];
		    
		    for(int j = 0; j < 3; j++){
		        lancia[j] = (int) (Math.random() * 2);
		    }
		    
		    int testa = 0;
		    
		    moneto1[i] = lancia[0]; moneto2[i] = lancia[1]; moneto3[i] = lancia[2];
		    
		    for(int k = 0; k < 3; k++){
		        if (lancia[k] == 0) { countTesta++; testa++; } else countCroce++;
		    }
		    
		    countCombinazioni[3 - testa]++;
		    
		    if(i != 0 && 3 - testa == prevCombinazione) consecutiviCombinazioni++;
		    
		    prevCombinazione = 3 - testa;
		}
		
		System.out.printf("Teste: %d%n", countTesta);
		System.out.printf("Croce: %d%n%n", countCroce);
		System.out.printf("Due lanci consecutivi la stessa combinazione: %d%n", consecutiviCombinazioni);
		
		String[] combinazioniNome = {"3 teste e 0 croci", "2 teste e 1 croce", "1 testa e 2 croci", "3 croci"};
		
		System.out.printf("%nCombinazioni: %n");
		for(int i = 0; i < 4; i++){
		    System.out.printf("%s: %d%n", combinazioniNome[i], countCombinazioni[i]);
		}
	}
}
