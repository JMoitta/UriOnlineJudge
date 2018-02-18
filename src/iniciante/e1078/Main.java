package iniciante.e1078;

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
		int n;
		// Entrada: Leitura de um valor inteiro N (2 < N < 1000)
		n = Integer.parseInt(in.readLine());

		// Processamento: laco de repeticao de 1 ate 10
		for(int i = 1; i < 11; i++){
			
			// Saida: imprime tabuada de i x N
			System.out.printf("%d x %d = %d\n", i, n, (i * n));
		}
	}
}
