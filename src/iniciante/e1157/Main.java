package iniciante.e1157;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int N;
	private static double media;
	
	
	// main(args)
	public static void main(String[] args) {
		
		// Divisores I
		divisoresI();
	}

	private static void divisoresI() {
		
		N = nextInt();
		media = N / 2.0;
		for(int i = 1; i <= media; i++) {
			if(N % i == 0) {
				System.out.printf("%d\n", i);
			}
		}
		System.out.printf("%d\n", N);
	}

	private static int nextInt() {
		return Integer.parseInt(scan.nextLine());
	}
}