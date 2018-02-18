package iniciante.e1095;

import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		// Configurações do sistema
		Locale.setDefault(Locale.US);

		// Processamento: laco de repeticao enquanto j for maior ou igual a zero.
		for (int i = 1, j = 60; j >= 0;i+=3,j-=5) {
			
			// Saida: Imprime I e o J.
			System.out.printf("I=%d J=%d\n", i, j);
		}
	}
}
