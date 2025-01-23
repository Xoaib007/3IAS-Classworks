/******************************************************************************

Scrivere un programma JAVA che consenta di produrre un output come quello di seguito mostrato.

1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6
1 2 3 4 5 6

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		for(int i = 1; i < 7; i++) {
			for(int j = 1; j < 7; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
}
