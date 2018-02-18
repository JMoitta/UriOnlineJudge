package iniciante.e1043;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {

	public static void main(String[] args) throws IOException {
		// Configura��es do sistema
		Locale.setDefault(Locale.US);

		// Declara��o e inicializa��o de variaveis
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		String[] entrada;
		float A, B, C, perimetro, area;
		// Entrada: leitura de tres valores reais
		entrada = in.readLine().split(" ");

		// Processamento: Atribui��o as variaveis A, B e C
		A = Float.parseFloat(entrada[0]);
		B = Float.parseFloat(entrada[1]);
		C = Float.parseFloat(entrada[2]);

		// Processamento: testa se os lados formam um triangulo
		if ((A < B + C) && (B < A + C) && (C < A + B)) {

			// Processamento: Calcular o perimetro do triangulo
			perimetro = (A + B + C);
			// Saida: Imprimir o perimetro do triangulo
			System.out.printf("Perimetro = %.1f\n", perimetro);

			// Processamento: testa se as medidas forma um trapezio
		} else {

			// Processamento: Calcular a area do trapezio
			area = ((A + B) * C) / 2;
			// Saida: Imprimir a area do trapezio
			System.out.printf("Area = %.1f\n", area);
		}
	}
}
