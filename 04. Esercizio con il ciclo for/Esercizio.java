import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero positivo N: ");
        int N = scanner.nextInt();

        int somma = 0;
        int countStep = 0;
        
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                somma += i;
                countStep++;
            }
        }

        System.out.println("La somma dei numeri divisibili per 3 o 5 tra 1 e " + N + " è: " + somma);
        System.out.println("Il numero totale di numeri che soddisfano questa condizione è: " + countStep);
    }
}
