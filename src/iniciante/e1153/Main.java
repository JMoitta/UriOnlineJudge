package iniciante.e1153;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static long N;
	
	
	// main(args)
	public static void main(String[] args) {
		
		// Soma de Fatoriais
		fatorialSimples();
	}

	private static void fatorialSimples() {
		
		N = nextInt();
		
		System.out.println((fatorial(N)));
	}

	private static long nextInt() {
		return Integer.parseInt(scan.nextLine());
	}

	public static long fatorial(long num) {
		if (num <=1 )  return 1;
		else  return num * fatorial(num - 1);
	}

}