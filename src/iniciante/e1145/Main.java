package iniciante.e1145;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int X;
	private static int Y;
	public static void main(String[] args) {

		// Sequencia logica 2
		sequenciaLogica2();
		
		// Imprime a sequência
		imprimeResultado();
	}

	private static void sequenciaLogica2() {
		
		// Leitura de X e Y
		String[] entrada = leituraDeArray();
		
		// Conversao do valor de X
		X = Integer.parseInt(entrada[0]);
		
		// Conversao do valor de Y
		Y = Integer.parseInt(entrada[1]);
	}

	private static String[] leituraDeArray() {
		return scan.nextLine().split(" ");
	}

	private static void imprimeResultado() {
		int saida = 1;
		for (int i = 1; i <= Y; i++) {
			saida = i;
			System.out.printf("%d", saida);
			if(i % X == 0) {
				System.out.printf("\n");
			}
			else {
				System.out.print(" ");
			}
		}
	}

	private static int leituraDeInt() {
		return Integer.parseInt(scan.nextLine());
	}

}