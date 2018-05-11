package iniciante.e1144;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int N;
	private static int linha;
	private static int quadrado;
	private static int cubo;
	
	public static void main(String[] args) {

		quadradoEAoCubo();
		imprimeResultado();
	}

	private static void imprimeResultado() {
		for (int i = 1; i <= N; i++) {
			
			// Primeira linha
			linha = i;
			System.out.printf("%d ", linha);
			quadrado = i * i;
			System.out.printf("%d ", quadrado);
			cubo = i * i * i;
			System.out.printf("%d\n", cubo);
			
			// Segunda linha
			System.out.printf("%d ", linha);
			quadrado += 1;
			System.out.printf("%d ", quadrado);
			cubo += 1;
			System.out.printf("%d\n", cubo);
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