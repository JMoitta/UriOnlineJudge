package iniciante.e1073;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Configurações do sistema
		Locale.setDefault(Locale.US);

		// Declaração de variaveis
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		int n;
		// Entrada: Leitura de um valor inteiro N (5 < N < 2000).
		n = Integer.parseInt(in.readLine());
		// Processamento: laco de repeticao de 2 em 2 ate N
		for (int i = 2; i <= n; i+= 2) {
			
			// Saida: Imprime na tela o resultade de i^2
			System.out.printf("%d^2 = %d\n", i, (i * i));
		}
	}

}
