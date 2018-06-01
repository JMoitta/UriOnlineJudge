package iniciante.e1155;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static double S = 1;
	
	
	// main(args)
	public static void main(String[] args) {
		
		// Sequência S
		sequenciaS();
	}

	private static void sequenciaS() {
		for(int i = 2; i < 101; i++) {
			S += (1.0 / i);
		}
		// imprime S
		System.out.printf("%.2f\n", S);
	}
}