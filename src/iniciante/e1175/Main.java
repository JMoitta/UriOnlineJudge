package iniciante.e1175;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static double X;
	private static int[] N;
	private static int[] reverse;

	// main(args)
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * 1175 Troca em Vetor I
		 */
		trocaEmVetorI();
	}

	private static void trocaEmVetorI() {

		init();
		
		process();
		
		print();
	}
	
	private static void print() {
		for(int i = 0; i < 20; i++) {
			printArray(i, reverse[i], "N");
		}
	}

	private static void init() {
		N = nextArrayInt(20);
		reverse = new int[20];
		
	}
	
	private static void process() {
		for(int i = 0; i < 20; i++) {
			reverse[19 - i] = N[i];
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
		for(int i = 0; i<tam; i++) {
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