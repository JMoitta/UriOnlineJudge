package iniciante.e1142;

import java.util.Scanner;

public class Main {
	private static Scanner scan = new Scanner(System.in);
	// Declaracao de variaveis
	private static int N;
	private static int saida;
	public static void main(String[] args) {

		pum();
		imprimeResultado();
	}

	private static void imprimeResultado() {
		saida = 1;
		for (int i = 0; i < N; i++) {
			System.out.printf("%d ", saida);
			saida += 1;
			System.out.printf("%d ", saida);
			saida += 1;
			System.out.printf("%d PUM\n", saida);
			saida += 2;
		}
	}

	private static void pum() {
		// Leitura de N
		N = leituraDeInt();
	}

	private static int leituraDeInt() {
		return Integer.parseInt(scan.nextLine());
	}

}