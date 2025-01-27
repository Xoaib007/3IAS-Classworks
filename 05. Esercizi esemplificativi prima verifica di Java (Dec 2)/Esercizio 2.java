/******************************************************************************

Dato in input il valore dei lati e dellbaltezza di un trapezio rettangolo (perciC2 i valori di B,
b, l1 e l2 della figura seguente) comunicare

a. Il perimetro del trapezio
b. Lbarea del trapezio Area=( b+B) * h /2
c. La misura delle diagonali del trapezio

*******************************************************************************/
import java.util.*;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("B: ");
		double B = scanner.nextDouble();

		System.out.println("b: ");
		double b = scanner.nextDouble();

		System.out.println("l1: ");
		double l1 = scanner.nextDouble();

		System.out.println("l2: ");

		double l2 = scanner.nextDouble();

		double squareHeight = (l2 * l2) - ((B - b) * (B - b));
		double h = Math.sqrt(squareHeight);

		double perimetro = B + b + l1 + l2;
		double area=( b+B) * h /2;

		double diagonale1 = Math.sqrt((B * B) + (h * h));
		double diagonale2 = Math.sqrt((b * b) + (h * h));


		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);
		System.out.println("Diagonale 1: " + diagonale1);
		System.out.println("Diagonale 2: " + diagonale2);

	}
}
