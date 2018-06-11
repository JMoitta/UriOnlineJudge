package iniciante.e1172;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int[] X;

	// main(args)
	public static void main(String[] args) {

		/*
		 * 1172 Substituição em Vetor I
		 */
		substituicaoEmVetorI();
	}

	private static void substituicaoEmVetorI() {

		nextArrayInt();

		forArray();
	}

	private static void forArray() {
		for (int i = 0; i < X.length; i++) {
			printArray(i, X[i]);
		}
	}

	private static void printArray(int i, int pos) {
		System.out.printf("X[%d] = %d\n", i, pos);
	}

	private static long nextLong() {
		return Long.parseLong(scan.next());
	}

	private static void nextArrayInt() {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = converterInteiros(Integer.parseInt(scan.next()));
		}
		X = array;
	}

	private static int converterInteiros(int pos) {
		if (pos > 0)
			return pos;
		return 1;
	}

	private static int nextInt() {
		return Integer.parseInt(scan.next());
	}
}