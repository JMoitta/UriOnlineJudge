package iniciante.e1133;

import java.util.Scanner;

public class Main {
	// Declaracao dos atributos.
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		multiplosDe13();
	}

	private static void multiplosDe13() {

		// Declaracao de variaveis.
		int X, Y, aux, soma = 0;

		// Leitura de X
		X = leituraDeInt();
		
		// Leitura de Y
		Y = leituraDeInt();
		
		// ordena X e Y em ordem crescente
		if(X > Y) {
			aux = X;
			X = Y;
			Y = aux;
		}
		
		// soma dos números que não são múltiplos de 13 entre X e Y, incluindo ambos.
		for (int i = X + 1; i < Y; i++) {
			if (i % 5 == 2 || i % 5 == 3) {
				System.out.println(i);
			}
		}
	}
	

	private static int leituraDeInt() {
		return Integer.parseInt(scan.nextLine());
	}

}