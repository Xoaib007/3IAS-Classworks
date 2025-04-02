import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] tosses = new int[100][3];
        int countTesta = 0, countCroce = 0;
        int[] countCombinazioni = new int[4];
        int consecutiveSameSequences = 0;

        for (int i = 0; i < 100; i++) {
            int testa = 0;
            for (int j = 0; j < 3; j++) {
                tosses[i][j] = (int) (Math.random() * 2);
                if (tosses[i][j] == 0) countTesta++;
                else countCroce++;
                if (tosses[i][j] == 0) testa++;
            }
            countCombinazioni[3 - testa]++;

            if (i > 0 && Arrays.equals(tosses[i], tosses[i - 1])) {
                consecutiveSameSequences++;
            }
        }

        System.out.printf("Teste: %d%n", countTesta);
        System.out.printf("Croci: %d%n%n", countCroce);
        System.out.printf("Consecutive identical sequences: %d%n", consecutiveSameSequences);

        String[] combinazioniNome = {"3 teste e 0 croci", "2 teste e 1 croce", "1 testa e 2 croci", "3 croci"};
        System.out.printf("%nCombinazioni:%n");
        for (int i = 0; i < 4; i++) {
            System.out.printf("%s: %d%n", combinazioniNome[i], countCombinazioni[i]);
        }
    }
}

