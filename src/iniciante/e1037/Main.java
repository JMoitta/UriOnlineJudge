package iniciante.e1037;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Declaração das variaveis.
		Scanner scan = new Scanner(System.in);
		double num;

		// Entrada: Leitura de um numero qualquer.
		num = Double.parseDouble(scan.nextLine());

		// Processamento: Descubrir intervalo do numero
		if (num < 0 || num > 100) {

			// Saida: Fora de intervalo
			System.out.println("Fora de intervalo");

			// Processamento: Intervalo [0,25]
		} else if (num <= 25) {

			// Saida: Intervalo [0,25]
			System.out.println("Intervalo [0,25]");

			// Processamento: Intervalo (25,50]
		} else if (num <= 50) {

			// Saida: Intervalo (25,50]
			System.out.println("Intervalo (25,50]");

			// Processamento: Intervalo (50,75]
		} else if (num <= 75) {

			// Saida: Intervalo (50,75]
			System.out.println("Intervalo (50,75]");
			
			// Processamento: Intervalo (75,100]
		} else if (num <= 100) {

			// Saida: Intervalo (75,100]
			System.out.println("Intervalo (75,100]");
		}

	}
}
