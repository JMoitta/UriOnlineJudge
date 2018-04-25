package iniciante.e1143;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int N;
	private static int saida;
	public static void main(String[] args) {

		quadradoEAoCubo();
		imprimeResultado();
	}

	private static void imprimeResultado() {
		saida = 1;
		for (int i = 1; i <= N; i++) {
			saida = i;
			System.out.printf("%d ", saida);
			saida = i * i;
			System.out.printf("%d ", saida);
			saida = i * i * i;
			System.out.printf("%d\n", saida);
		}
	}

	private static void quadradoEAoCubo() {
		// Leitura de N
		N = leituraDeInt();
	}

	private static int leituraDeInt() {
		return Integer.parseInt(scan.nextLine());
	}

}