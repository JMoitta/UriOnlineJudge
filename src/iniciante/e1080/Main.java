package iniciante.e1080;

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
		int valor = 0, posicao = -1, valorNovo;
		
		// Processamento: laco de repeticao de 0 ate menor 99
		for(int i = 0; i < 100; i++) {
			
			// Entrada: Leitura de um valor inteiro.
			valorNovo = Integer.parseInt(in.readLine());
			
			// Processamento: testa se e a primeira leitura
			if(posicao == -1 ) {
				
				// Processamento: define o valor e a posicao padrao default.
				posicao = 1;
				valor = valorNovo;
				
				// Processamento: testa se e o novo valor e maior encontrado.
			} else if (valorNovo > valor) {
				
				// Processamento: define o valor e a posicao do novo valor.
				valor = valorNovo;
				posicao = i + 1;
			}
		}
		
		System.out.println(valor);
		System.out.println(posicao);
	}
}
