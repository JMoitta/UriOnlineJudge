package iniciante.e1188;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static String operacao;
	private static float[][] M;
	private static float soma;
	private final static float DIVISOR_DA_AREA_DE_CIMA = 30;
	private final static float MAIOR_INDEX_MATRIZ = 11;

	// main(args)
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		/*
		 * 1188 Área Inferior
		 */
		abaixoDaDiagonalSecundaria();
	}

	private static void abaixoDaDiagonalSecundaria() {

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
		for(int i = 0; i < 12; i++) {
			for(int j = 0; j < 12; j++) {
				if( i > j && i + j > MAIOR_INDEX_MATRIZ) {
					soma += M[i][j];
				}
			}
		}
		if(operacao.equals("M")) {
			soma /= DIVISOR_DA_AREA_DE_CIMA;
		}
	}

	private static void print() {
		printFloat1(soma);
	}
	
	private static void printFloat1(float value) {
		System.out.printf("%.1f\n", value);
	}

	// NEXT
	
	private static float[][] nextMatrizFloat(int tam) {
		float[][] matriz= new float[tam][tam];
		for (int i = 0; i < tam; i++) {
			for(int j = 0; j < tam; j++) {
				matriz[i][j] = nextFloat();
			}
		}
		return matriz;
	}
	
	private static String nextString() {
		return scan.nextLine();
	}
	
	private static float nextFloat() {
		return Float.parseFloat(scan.next());
	}
}