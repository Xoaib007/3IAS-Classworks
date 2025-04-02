import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int countTesta = 0;
        int countCroce = 0;
        int[] countCombinazioni = new int[4]; // [0]: 3 heads, [1]: 2 heads 1 tail, etc.
        int prevCombinazione = 0;
        int consecutiviCombinazioni = 0;
        
        for (int i = 0; i < 100; i++) {
            int[] lancia = lancia();
            
            int testa = countTestaCroce(lancia);
            
            countTesta += testa;
            countCroce += (3 - testa);
            
            updateCombinazioni(testa, countCombinazioni);
            
            if (i != 0 && lancia[0] == prevCombinazione) {
                consecutiviCombinazioni++;
            }
            
            prevCombinazione = lancia[0];
        }
        
        stampaRisulti(countTesta, countCroce, consecutiviCombinazioni, countCombinazioni);
    }

    public static int[] lancia() {
        int[] toss = new int[3];
        for (int i = 0; i < 3; i++) {
            toss[i] = (int) (Math.random() * 2); // 0 testa, 1 croce
        }
        return toss;
    }

    public static int countTestaCroce(int[] toss) {
        int testa = 0;
        for (int i = 0; i < toss.length; i++) {
            if (toss[i] == 0) {
                testa++;
            }
        }
        return testa;
    }

    public static void updateCombinazioni(int testa, int[] countCombinazioni) {
        countCombinazioni[3 - testa]++;
    }

    public static void stampaRisulti(int countTesta, int countCroce, int consecutiviCombinazioni, int[] countCombinazioni) {
        System.out.printf("Teste: %d%n", countTesta);
        System.out.printf("Croce: %d%n%n", countCroce);
        System.out.printf("Due lanci consecutivi con la stessa combinazione: %d%n", consecutiviCombinazioni);

        String[] combinazioniNome = {"3 teste e 0 croci", "2 teste e 1 croce", "1 testa e 2 croci", "3 croci"};
        
        System.out.printf("%nCombinazioni: %n");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%s: %d%n", combinazioniNome[i], countCombinazioni[i]);
        }
    }
}

