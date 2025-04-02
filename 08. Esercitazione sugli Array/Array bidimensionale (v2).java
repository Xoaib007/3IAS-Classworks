import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double[][] temp = new double[2][24];
		double[] avg = new double[2];

		for(int i= 0; i < temp.length ; i++) {
		    double sum = 0.0;
			for(int j= 0; j < temp[i].length; j++) {
				System.out.printf("Inserisci temperatura del giorno %d ora %d.00: \n", i+1, j);
				sum+= Double.parseDouble(br.readLine());
			}
			avg[i] = sum/24;
		}
		
		for(int i= 0; i < avg.length; i++){
		    System.out.printf("Temperatura media del giorno %d è %.2f°C%n", i+1, avg[i]);
		}
	}
}

//BufferReader to make it faster
//use inputs directly to calculate average instead of storing inputs in array to make it more efficient
