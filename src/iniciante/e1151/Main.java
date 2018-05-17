package iniciante.e1151;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int N;
	
	
	// main(args)
	public static void main(String[] args) {
		
		// Somando Inteiros Consecutivos
		somandoInteirosConsecutivos();
		
	}

	private static void somandoInteirosConsecutivos() {
		N = nextInt();
		
		int a = 1;
		int b = 0;
		System.out.print(b);
		if(N > 1) {
			System.out.print(" " + a);
		}
		for(int i = 0; i < N - 2;i++) {
			int aux = a;
			a = a + b;
			b = aux;
			System.out.print(" " + a);
		}
		System.out.println();
	}


	private static int nextInt() {
		return Integer.parseInt(scan.nextLine());
	}

}