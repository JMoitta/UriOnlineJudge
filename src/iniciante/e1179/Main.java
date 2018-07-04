package iniciante.e1179;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int[] valores;
	private static int X;
	private static int contagemPar;
	private static int[] par;
	private static int contagemImpar;
	private static int[] impar;

	// main(args)
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * 1179 Preenchimento de Vetor IV
		 */
		preenchimentoDeVetorIV();
	}

	private static void preenchimentoDeVetorIV() {

		init();

		process();

//		print();
	}

	private static void init() {
		valores = nextArrayInt(15);
		contagemPar = 0;
		par = new int[5];
		contagemImpar = 0;
		impar = new int[5];
	}

	private static void process() {
		for (int i = 0; i < 15; i++) {
			X = valores[i];
			if (X % 2 == 0) {
				par[contagemPar] = X;
				contagemPar++;
			} else {
				impar[contagemImpar] = X;
				contagemImpar++;
			}
			if (contagemPar >= 5) {
				printForArray(par, contagemPar, "par");
				contagemPar = 0;
			}
			if (contagemImpar >= 5) {
				printForArray(impar, contagemImpar, "impar");
				contagemImpar = 0;
			}
		}
		printForArray(impar, contagemImpar, "impar");
		printForArray(par, contagemPar, "par");
	}

	private static void print() {
		for (int i = 0; i < 20; i++) {

		}
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