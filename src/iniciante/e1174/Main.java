package iniciante.e1174;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static double X;

	// main(args)
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * 1174 Seleçao em Vetor I
		 */
		selecaoEmVetorI();
	}

	private static void selecaoEmVetorI() {

		forArray();
	}
	
	private static void forArray() {
		for (int i = 0; i < 100; i++) {
			vetorPosicao(i);
		}
	}

	private static void vetorPosicao(int i ) {
		X = nextDouble();
		if(!(X > 10))
			printArray(i, X, "A");
	}

	private static void printArray(int i, double pos, String variavel) {
		System.out.printf("%s[%d] = %.1f\n", variavel, i, pos);
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
	
	private static double nextDouble() {
		return Double.parseDouble(scan.next());
	}
	private static long nextLong() {
		return Long.parseLong(scan.next());
	}
	
	private static int nextInt() {
		return Integer.parseInt(scan.next());
	}
}