package iniciante.e1096;

import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		// Configurações do sistema
		Locale.setDefault(Locale.US);

		// Processamento: laco de repeticao de 1 ate 9 de dois em dois
		for (int i = 1; i < 10;i+= 2) {
			
			// Processamento: laco de repeticao de 7 ate 5
			for(int j = 7; j > 4; j--) {
				
				// Saida: Imprime I e J
				System.out.printf("I=%d J=%d\n", i, j);
			}
		}
	}
}

