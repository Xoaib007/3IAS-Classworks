
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double[][] temp = new double[2][24];

		for(int i= 0; i < temp.length ; i++) {
			for(int j= 0; j < temp[i].length; j++) {
				System.out.printf("Inserisci temperatura del giorno %d ora %d.00: \n", i+1, j);
				temp[i][j] = scanner.nextDouble();
			}
		}
		
		double[] avg = new double[2];
		for(int i = 0; i< temp.length; i++){
		    Double sum = 0.0;
		    for(int j= 0; j < temp[i].length; j++) {
				sum+= temp[i][j];
			}
			
			avg[i] = sum/24;
		}
		
		for(int i= 0; i < avg.length; i++){
		    System.out.printf("Temperatura media del giorno %d è %.2f°C%n", i+1, avg[i]);
		    //System.out.printf("Average temperature of day %d is %d", i+1, avg[i]);
		}
	}
}
