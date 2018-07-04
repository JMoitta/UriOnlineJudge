package iniciante.e1177;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int T;
	private static int X = 0;

	// main(args)
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * 1177 Preenchimento de Vetor II
		 */
		fibonacciEmVetor();
	}

	private static void fibonacciEmVetor() {

		init();
		
		process();
		
//		print();
	}
	
	private static void init() {
		T = nextInt();
		
	}
	
	private static void process() {
		for(int i = 0; i < 1000; i++) {
			printArray(i, X, "N");
			X++;
			if(X == T) X = 0;
		}
	}
	
	private static void print() {
		for(int i = 0; i < 20; i++) {
			
		}
	}
	
	private static void printArray(int i, long pos, String variavel) {
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