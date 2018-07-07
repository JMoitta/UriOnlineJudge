package iniciante.e1181;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int L;
	private static String operacao;
	private static float[][] M;
	private static float soma;

	// main(args)
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * 1181 Linha na Matriz
		 */
		linhaNaMatriz();
	}

	private static void linhaNaMatriz() {

		init();

		process();

		print();
	}

	private static void init() {
		L = nextInt();
		operacao = nextString();
		M = nextMatrizFloat(12);
		soma = 0;
	}

	private static void process() {
		for(int j = 0; j < 12; j++) {
			soma += M[L][j];
		}
		if(operacao.equals("M")) {
			soma /= 12;
		}
	}

	private static void print() {
		printFloat1(soma);
	}

	private static void printKeyAndValue(String key, int value) {
		System.out.printf("%s: %d\n", key, value);
	}
	
	private static void printFloat1(float value) {
		System.out.printf("%.1f\n", value);
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

	private static float[][] nextMatrizFloat(int tam) {
		float[][] matriz= new float[tam][tam];
		for (int i = 0; i < tam; i++) {
			for(int j = 0; j < tam; j++) {
				matriz[i][j] = nextFloat();
			}
		}
		return matriz;
	}

	private static int[] nextArrayInt(int tam) {
		int[] array = new int[tam];
		for (int i = 0; i < tam; i++) {
			array[i] = nextInt();
		}
		return array;
	}
	
	private static String nextString() {
		return scan.next();
	}
	
	private static double nextDouble() {
		return Double.parseDouble(scan.next());
	}
	
	private static float nextFloat() {
		return Float.parseFloat(scan.next());
	}

	private static long nextLong() {
		return Long.parseLong(scan.next());
	}

	private static int nextInt() {
		return Integer.parseInt(scan.next());
	}
}