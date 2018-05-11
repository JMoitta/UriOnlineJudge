package matematica.m1247;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int D;
	private static int VF;
	private static int VG;
	
	// main(args)
	public static void main(String[] args) {
		
		// Guarda Costeira
		guardaCosteira();
	}

	private static void guardaCosteira() {
		
		do {
			String[] entrada = scan.nextLine().split(" ");
			
			D = Integer.parseInt(entrada[0]);
			VF = Integer.parseInt(entrada[1]);
			VG = Integer.parseInt(entrada[2]);
			
			imprimeResultado();
			
		} while(scan.hasNextLine());
	}

	private static void imprimeResultado() {
		double d = Math.sqrt(Math.pow(12.0, 2.0) + Math.pow(D, 2.0));

		if((12.0 / VF) >= (d / VG)){
			System.out.printf("S\n");
		}
		else{
			System.out.printf("N\n");
        }
	}
	
}