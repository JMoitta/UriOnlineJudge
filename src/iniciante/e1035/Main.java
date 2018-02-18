package iniciante.e1035;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A, B, C, D;
		// Entrada: Ler 4 valores
		String[] entrada = scan.nextLine().split(" ");

		// Processamento: conversao dos valores
		A = Integer.parseInt(entrada[0]);
		B = Integer.parseInt(entrada[1]);
		C = Integer.parseInt(entrada[2]);
		D = Integer.parseInt(entrada[3]);
		// Processamento:
		if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0
				&& (A % 2 == 0)) {

			// Saida: valores aceitos
			System.out.println("Valores aceitos");
		} else {

			// Saida: valores nao aceitos
			System.out.println("Valores nao aceitos");
		}
	}
}
