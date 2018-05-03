package iniciante.e1149;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int A;
	private static int N;
	private static int soma = 0;
	
	
	// main(args)
	public static void main(String[] args) {
		
		// Somando Inteiros Consecutivos
		somandoInteirosConsecutivos();
		
		// Imprime a sequência
		imprimeResultado();
	}

	private static void somandoInteirosConsecutivos() {
		
//		String[] entrada = leituraDeArray();
		
		A = scan.nextInt();
		
		N = scan.nextInt();
		
		while(N <= 0) {
			N = leituraDeInt();
		}
		
		for(int i = 0; i < N; i++) {
			soma+= (A + i);	
		}
	}

	private static void imprimeResultado() {
		System.out.println(soma);
	}

	private static int leituraDeInt() {
		return (scan.nextInt());
	}

}