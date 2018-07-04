package iniciante.e1178;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static double X = 0;

	// main(args)
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * 1178 Preenchimento de Vetor III
		 */
		preenchimentoDeVetorIII();
	}

	private static void preenchimentoDeVetorIII() {

		init();
		
		process();
		
//		print();
	}
	
	private static void init() {
		X = nextDouble();
		
	}
	
	private static void process() {
		for(int i = 0; i < 100; i++) {
			printArray(i, X, "N");
			X /= 2;
		}
	}
	
	private static void print() {
		for(int i = 0; i < 20; i++) {
			
		}
	}
	
	private static void printArray(int i, double pos, String variavel) {
		System.out.printf("%s[%d] = %.4f\n", variavel, i, pos);
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