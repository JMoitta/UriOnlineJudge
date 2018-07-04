package iniciante.e1173;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int V;
	private static int X;

	// main(args)
	public static void main(String[] args) {

		/*
		 * 1173 Preenchimento de Vetor I
		 */
		preenchimentoDeVetorI();
	}

	private static void preenchimentoDeVetorI() {

		primeiroValor();

		forArray();
	}

	private static void primeiroValor() {
		V = nextInt();
		X = V;
	}

	private static void forArray() {
		for (int i = 0; i < 10; i++) {
			printArray(i, X, "N");
			X += X;
		}
	}

	private static void printArray(int i, int pos, String variavel) {
		System.out.printf("%s[%d] = %d\n", variavel, i, pos);
	}

	private static long nextLong() {
		return Long.parseLong(scan.next());
	}

//	private static void nextArrayInt() {
//		int[] array = new int[10];
//		for (int i = 0; i < array.length; i++) {
//			array[i] = converterInteiros(Integer.parseInt(scan.next()));
//		}
//		X = array;
//	}

	private static int converterInteiros(int pos) {
		if (pos > 0)
			return pos;
		return 1;
	}

	private static int nextInt() {
		return Integer.parseInt(scan.next());
	}
}