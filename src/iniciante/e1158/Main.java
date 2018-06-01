package iniciante.e1158;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int N;
	private static int X;
	private static int Y;
	private static int conte;
	private static int soma ;
	
	
	// main(args)
	public static void main(String[] args) {
		
		// Soma de Ímpares Consecutivos III
		somaDeImparesConsecutivosIII();
	}

	private static void somaDeImparesConsecutivosIII() {
		
		N = nextInt();
		
		do {
			
			X = nextInt();
			Y = nextInt();
			
			soma = 0;
			conte = 0;
			
			do {
				if (!(X % 2 == 0)) {
					soma += X;
					conte++;
				}
				
				X++;
			} while (conte < Y);
			
			System.out.printf("%d\n", soma);
			N--;
		} while (N > 0);
	}

	private static int nextInt() {
		return Integer.parseInt(scan.next());
	}
}