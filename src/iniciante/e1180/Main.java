package iniciante.e1180;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int N;
	private static int[] X;
	private static int posMenorX;

	// main(args)
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * 1180 Menor e Posição
		 */
		menorEPosicao();
	}

	private static void menorEPosicao() {

		init();

		process();

		print();
	}

	private static void init() {
		N = nextInt();
		X = nextArrayInt(N);
		posMenorX = 0;
	}

	private static void process() {
		for (int i = 0; i < N; i++) {
			if (X[i] < X[posMenorX]) {
				posMenorX = i;
			}
		}
	}

	private static void print() {
		printKeyAndValue("Menor valor", X[posMenorX]);
		printKeyAndValue("Posicao", posMenorX);
	}

	private static void printKeyAndValue(String key, int value) {
		System.out.printf("%s: %d\n", key, value);
	}

	private static void printForArray(int[] array, int tamanho, String variavel) {
		for (int i = 0; i < tamanho; i++) {
			printArray(i, array[i], variavel);
		}
	}

	private static void printArray(int i, int pos, String variavel) {
		System.out.printf("%s[%d] = %d\n", variavel, i, pos);
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

	private static int[] nextArrayInt(int tam) {
		int[] array = new int[tam];
		for (int i = 0; i < tam; i++) {
			array[i] = nextInt();
		}
		return array;
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