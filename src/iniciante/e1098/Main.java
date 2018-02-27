package iniciante.e1098;

import java.util.Locale;
public class Main {
	public static void main(String[] args) {
		// Configurações do sistema
		Locale.setDefault(Locale.US);
		// Processamento: laco de repeticao de 0 ate 2 de dois decimos em dois
		// decimos
		double I = 0;
		int count = 0;
		for ( int i =  0; I < 2;count++) {
			
			I = ((count * 0.200) + i);
			// Processamento: laco de repeticao de 7 ate 5
			for (int j = 1; j <= 3; j++) {
				// Saida: Imprime I e (J+I)
				
				if (I % 1 == 0) {
					System.out.printf("I=%.0f J=%.0f\n", I, (j + I));
				} else {
					System.out.printf("I=%.1f J=%.1f\n", I, (j + I));
				}
			}
		}
	}
}
