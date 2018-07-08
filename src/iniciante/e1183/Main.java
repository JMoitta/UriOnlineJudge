package iniciante.e1183;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static String operacao;
	private static float[][] M;
	private static float soma;

	// main(args)
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * 1184 Abaixo da Diagonal Principal
		 */
		abaixoDaDiagonalPrincipal();
	}

	private static void abaixoDaDiagonalPrincipal() {

		init();

		process();

		print();
	}

	private static void init() {
		operacao = nextString();
		M = nextMatrizFloat(12);
		soma = 0;
	}

	private static void process() {
		forMatriz(12, (i, j)->{
			if(i < j) {
				soma += M[i][j];
			}
		});
		if(operacao.equals("M")) {
			soma /= 66;
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

	private static void forMatriz(int tam, Matriz matriz) {
		for(int i = 0; i < tam; i++) {
			for(int j = 0; j < tam; j++) {
				matriz.matrizBidimensional(i, j);
			}
		}
		
	}
	@FunctionalInterface
	private interface Matriz {
		public void matrizBidimensional(int i, int j);
	}
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