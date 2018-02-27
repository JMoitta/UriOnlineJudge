package iniciante.e1113;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Configurações do sistema
		Locale.setDefault(Locale.US);

		// Declaracao de variaveis e inicializacao
		Scanner scan = new Scanner(System.in);
		int X, Y, soma;
		String[] entrada;
		List<Integer[]> conjuntoPares = new ArrayList<>(1);
		boolean continua = true;
		Integer[] inteiros;
		// Processamento: Laco de repeticao de um conjunto não determinado de
		// pares.
		do {
			// Processamento: inicializar inteiros.
			inteiros = new Integer[2];

			// Entrada: leitura de M e N
			entrada = scan.nextLine().split(" ");

			// Processamento: Atribuiçao a variaveis X e Y.
			X = Integer.parseInt(entrada[0]);
			Y = Integer.parseInt(entrada[1]);

			// Processamento: testa se N e menor 1
			if (X == Y) {
				continua = false;
			} else {

				inteiros[0] = X;
				inteiros[1] = Y;
				conjuntoPares.add(inteiros);
			}
		} while (continua);

		// Processamento: laco de repeticao de 0 ate N de um em um
		for (int i = 0; i < conjuntoPares.size(); i++) {

			// Processamento: busca os inteiros na posicao I.
			inteiros = conjuntoPares.get(i);

			// Processamento: testa se X e maior que Y
			if (inteiros[0] > inteiros[1]) {

				// Saida: Imprime Decrescente
				System.out.println("Decrescente");

				// Processamento: Caso X seja menor que Y
			} else {

				// Saida: Imprime Crescente.
				System.out.println("Crescente");
			}
		}
	}
}
