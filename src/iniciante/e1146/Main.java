package iniciante.e1146;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int X;
	
	// main(args)
	public static void main(String[] args) {
		// Sequências Crescentes
		sequenciasCrescentes();
	}

	private static void sequenciasCrescentes() {
		
		do {
			// Leitura de X
			X = leituraDeInt();
			
			// De 1 ate X
			for(int i = 1; i <= X; i++) {
				
				// Ultimo valor
				if(i == X) {
					System.out.print(String.format("%d\n", i));
				}
				// Não e o ultimo valor
				else {
					System.out.print(String.format("%d ", i));
				}
			}
			
		}while(X > 0);
		
		
	}

	private static int leituraDeInt() {
		return Integer.parseInt(scan.nextLine());
	}

}