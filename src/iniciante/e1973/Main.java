package iniciante.e1973;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int N;
	private static int I;
	private static int[] X;
	private static int[] estrela;
	
	// main(args)
	public static void main(String[] args) {
		
		// Jornada nas Estrelas
		jornadaNasEstrela();
	}

	private static void jornadaNasEstrela() {
		N = Integer.parseInt(scan.nextLine());
		X = new int[N];
		estrela = new int[N];
		String[] entrada;
		
		entrada = scan.nextLine().split(" ");
//		System.out.println(entrada);
		for(int i = 0; i < N; i++) {
			X[i] = Integer.parseInt(entrada[i]);
		}
		I = 0;
		
		while(true) {
			estrela[I] = 1;

			if((X[I] % 2 == 0 && I == 0) || (X[I] % 2 == 1 && I == N-1)) {
				if(X[I]>0)X[I]--;
				break;
			}
			else if(X[I] % 2 == 0) {
				if(X[I]>0)X[I]--;
				I--;
			}
			else if(X[I] % 2 == 1) {
				X[I]--;
				I++;
			}
		}
		imprimeResultado();
	}

	private static void imprimeResultado() {
		long sitiosAtacados = 0, somaOvelhas = 0;
		for(int i=0; i < N; i++)
	    {
			somaOvelhas += X[i];
	        sitiosAtacados += estrela[i];
	    }
	    System.out.printf("%d %d\n", sitiosAtacados, somaOvelhas);
	}
	
}