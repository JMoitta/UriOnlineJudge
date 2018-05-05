package iniciante.e1161;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static long M;
	private static long N;
	private static String[] entrada;
	
	
	// main(args)
	public static void main(String[] args) {
		
		// Soma de Fatoriais
		somaDeFatoriais();
	}

	private static void somaDeFatoriais() {
		
		while (scan.hasNextLine()) {
			entrada = scan.nextLine().split(" ");
			M = Long.parseLong(entrada[0]);
			
			N = Long.parseLong(entrada[1]);
			
			System.out.println((fatorial(M) + fatorial(N)));
		}
	}

	public static long fatorial(long num) {
		if (num <=1 )  return 1;
		else  return num * fatorial(num - 1);
	}

}