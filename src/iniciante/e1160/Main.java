package iniciante.e1160;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int T;
	private static long PA;
	private static long PB;
	private static double G1;
	private static double G2;
	private static int anos;
	
	// main(args)
	public static void main(String[] args) {
		
		// Crescimento Populacional
		crescimentoPopulacional();
	}

	private static void crescimentoPopulacional() {
		
		T = nextInt();

		do {
			
			PA = nextLong();
			PB = nextLong();
			
			G1 = nextDouble();
			G2 = nextDouble();
			
			anos = 0;
			
			do {
				PA += PA * (G1 / 100.0);
				PB += PB * (G2 / 100.0);
				anos++;
				if(anos > 100)break;
			} while (PA <= PB);
			
			if(anos > 100) {
				System.out.println("Mais de 1 seculo.");
			} else {
				System.out.printf("%d anos.\n", anos);
			}
			
			T--;
			
		} while (T > 0);
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