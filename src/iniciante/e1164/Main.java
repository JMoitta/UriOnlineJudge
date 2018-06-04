package iniciante.e1164;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int N;
	private static long X;
	private static long soma;
	private static double metadeDeX;
	
	// main(args)
	public static void main(String[] args) {
		
		/* 1164
		 * Número Perfeito
		 */
		numeroPerfeito();
	}

	private static void numeroPerfeito() {
		
		N = nextInt();

		do {
			soma = 1;
			
			X = nextLong();
			
			metadeDeX = X / 2;
			for(long i = 2; i <= metadeDeX; i++)	{
				if(X % i == 0) {
					soma += i;
				}
			}
			
			if(soma == X && X != 1) {
				System.out.printf("%d eh perfeito\n", X);
			} else {
				System.out.printf("%d nao eh perfeito\n", X);
			}
			N--;
		} while (N > 0);
	}
	private static void facaRepita(long N) {
		do {
			
			N--;
		}while (N > 0);
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