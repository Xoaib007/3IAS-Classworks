/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    		Scanner scanner = new Scanner(System.in);


		Double[] array = new Double[5];
		
		for (int i = 0; i < array.length ; i++) {
			System.out.printf("Numero %d:%n", i + 1);

            array[i] = scanner.nextDouble();
		}

		Double max = array[0];
		Double min = array[0];

		for(int i=1; i < array.length ; i++) {
			if(array[i] < array[i-1]) {
				min = array[i];
			}
			if(array[i]> array[i-1]) {
				max = array[i];
			}
		}

	System.out.println("Max: " + max);
	System.out.println("Min: " + min);

}
}
