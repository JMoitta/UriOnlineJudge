package iniciante.e1099;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Configurações do sistema
		Locale.setDefault(Locale.US);

		// Declaracao de variaveis e inicializacao
		Scanner scan = new Scanner(System.in);
		int N, X, Y;
		String[] entrada;
		int[] somaImpar;

		// Entrada: leitura de valor inteiro N.
		N = Integer.parseInt(scan.nextLine());

		// Processamento: Inicializacao do vertor de soma de impares
		somaImpar = new int[N];

		// Processamento: laco de repeticao de 0 ate N de um em um
		for (int i = 0; i < N; i++) {

			// Processamento: inicializacao da posicao I no vetor de soma
			somaImpar[i] = 0;

			// Entrada: leitura de X e Y
			entrada = scan.nextLine().split(" ");

			// Processamento: atribuicao as variaveis X e Y
			X = Integer.parseInt(entrada[0]);
			Y = Integer.parseInt(entrada[1]);

			// Processamento: testa se Y e menor que X
			if(Y < X) {
				int auxiliar = Y;
				Y = X;
				X = auxiliar;
			}
			// Processamento: laco de repeticao de X + 1 ate Y de um em um
			for (int j = X + 1; j < Y; j++) {

				// Processamento: testa se j e impar
				if (j % 2 == 1) {
					// Processamento: soma 'j' ao vetor de soma de impares da
					// posicao 'i'
					somaImpar[i] += j;
				}
			}
		}
		// Processamento: laco de repeticao de 0 ate N de um em um
		for (int i = 0; i < N; i++) {
			
			// Saida: imprime as somas de impares encontradas no vetor
			System.out.println(somaImpar[i]);
		}
	}

}
