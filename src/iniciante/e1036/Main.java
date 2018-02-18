package iniciante.e1036;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Declaração de variaveis.
		Scanner scan = new Scanner(System.in);
		double A, B, C, delta, X1, X2;
		
		// Entrada: ler 3 valores de ponto flutuante.
		String[] entrada = scan.nextLine().split(" ");
		
		// Procesamento: Insirir os valores de entrada nas variaveis A, B, C.
		A = Double.parseDouble(entrada[0]);
		B = Double.parseDouble(entrada[1]);
		C = Double.parseDouble(entrada[2]);
		
		// Processamento: Calcular o Delta.
		delta = Math.pow(B, 2) - 4 * A * C;
		
		X1 = (- B + Math.sqrt(delta)) / (2 * A);
		X2 = (- B - Math.sqrt(delta)) / (2 * A);
		
		if(A == 0 || delta < 0) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.printf("R1 = %.5f\n", X1);
			System.out.printf("R2 = %.5f\n", X2);
		}
	}
}
