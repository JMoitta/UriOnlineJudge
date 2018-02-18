package iniciante.e1075;

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

		// Entrada: Leitura de um valor inteiro N (N < 10000).
		n = Integer.parseInt(in.readLine());

		// Processamento: laco de repeticao de 1 ate 10000
		for (int i = 1; i <= 10000; i++) {
			
			// Processamento: testa se o resto de i por n e igual 2
			if(i % n == 2){
				
				// Saida: imprime i
				System.out.println(i);
			}
		}
	}
}
