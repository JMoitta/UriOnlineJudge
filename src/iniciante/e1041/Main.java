package iniciante.e1041;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {

	public static void main(String[] args) throws IOException {
		// Configurações do sistema
		Locale.setDefault(Locale.US);

		// Declaração de variaveis
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		String[] entrada;
		float X, Y;

		// Entrada: Leitura dos valores X e Y
		entrada = in.readLine().split(" ");

		// Processamento: Atribuição as variaveis X e Y
		X = Float.parseFloat(entrada[0]);
		Y = Float.parseFloat(entrada[1]);

		// Processamento: Testa se o X e postivo
		if (X > 0) {

			// Processamento: Testa se o Y e postivo
			if (Y > 0) {

				// Saida: Imprimir Q1 "quadrante 1 " para usuario
				System.out.println("Q1");

				// Processamento: Testa se o Y e negativo
			} else if (Y < 0) {

				// Saida: Imprimir Q4 "quadrante 4 " para usuario
				System.out.println("Q4");

				// Processamento: testa se o Y e igual a 0
			} else {

				// Saida: Imprimir Eixo X para usuario
				System.out.println("Eixo X");
			}
			
			// Processamento: Testa se o X e negativo
		} else if (X < 0) {
			
			// Processamento: Testa se o Y e postivo
			if (Y > 0) {

				// Saida: Imprimir Q2 "quadrante 2 " para usuario
				System.out.println("Q2");

				// Processamento: Testa se o Y e negativo
			} else if (Y < 0) {

				// Saida: Imprimir Q3 "quadrante 3 " para usuario
				System.out.println("Q3");

				// Processamento: testa se o Y e igual a 0
			} else {

				// Saida: Imprimir Eixo X para usuario
				System.out.println("Eixo X");
			}
			
			// Processamento: testa se o X e igual a 0 e Y diferente de 0
		} else if (Y != 0){
			
			// Saida: Imprimir Eixo Y para usuario
			System.out.println("Eixo Y");
		} else {
			
			// Saida: Imprimir Origem para usuario
			System.out.println("Origem");
		}
	}

}
