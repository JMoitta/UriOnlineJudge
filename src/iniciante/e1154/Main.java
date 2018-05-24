package iniciante.e1154;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static long somaIdades;
	private static int qtdIdades;
	private static long I;
	
	
	// main(args)
	public static void main(String[] args) {
		
		// Idades
		idades();
	}

	private static void idades() {
		I = nextInt();
		do {
			somaIdades += I;
			qtdIdades++;
			
			I = nextInt();
		}while(I > 0);
		
		media();
	}

	private static void media() {
		System.out.println(String.format("%.2f", somaIdades / (double) qtdIdades));
	}

	private static long nextInt() {
		return Integer.parseInt(scan.nextLine());
	}

}