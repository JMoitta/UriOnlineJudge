package iniciante.e1165;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int N;
	private static long X;
	private static double sqrtX;

	// main(args)
	public static void main(String[] args) {

		/*
		 * 1165 Número Primo
		 */
		numeroPrimo();
	}

	private static void numeroPrimo() {

		N = nextInt();

		do {

			X = nextLong();

			if (ehPrimo()) {
				System.out.printf("%d eh primo\n", X);
			} else {
				System.out.printf("%d nao eh primo\n", X);
			}
			
			N--;
		} while (N > 0);
	}

	private static boolean ehPrimo() {
		sqrtX = Math.sqrt(X);
		if(X < 2) {
			return false;
		}
		for (long i = 2; i <= sqrtX; i++) {
			if (X % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static long nextLong() {
		return Long.parseLong(scan.next());
	}

	private static int nextInt() {
		return Integer.parseInt(scan.next());
	}
}