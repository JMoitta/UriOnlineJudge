package iniciante.e1156;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static double S = 1;
	
	
	// main(args)
	public static void main(String[] args) {
		
		// Sequência S II
		sequenciaSII();
	}

	private static void sequenciaSII() {
		for(int i = 3, j = 2; i <= 39; i+= 2) {
			S += ((double) i / j);
			j += j;
		}
		// imprime S
		System.out.printf("%.2f\n", S);
	}
}