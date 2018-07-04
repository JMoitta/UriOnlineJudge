package iniciante.e1176;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int T;
	private static int N;
	private static long X;
	private static Map<Long, Long> fib = new HashMap<>();

	// main(args)
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * 1176 Fibonacci em Vetor
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
		for(int i = 0; i < T; i++) {
			N = nextInt();
			X = fib(N);
			printArray(N, X, "Fib");
		}
	}
	
	private static void print() {
		for(int i = 0; i < 20; i++) {
			
		}
	}
	
	private static long fib(long n2) {
		if(fib.containsKey(n2)) return fib.get(n2);
		if(n2 == 0) {
			fib.put(n2, 0l);
			return 0;
		}
		if(n2 < 3) {
			fib.put(n2, 1l);
			return 1;
		}
		fib.put(n2, fib(n2 -1) + fib(n2 - 2));
		return fib.get(n2);
	}

	private static void printArray(int i, long pos, String variavel) {
		System.out.printf("%s(%d) = %d\n", variavel, i, pos);
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