package iniciante.e1074;

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
		int n, v;
		int[] vetor;

		// Entrada: Leitura de um valor inteiro N(N < 10000)
		n = Integer.parseInt(in.readLine());

		// Processamento: inicializa o vetor com tamanho de n
		vetor = new int[n];

		// Processamento: laco de repeticao de 0 ate N
		for (int i = 0; i < n; i++) {

			// Entrada: leitura do valor do caso de teste
			v = Integer.parseInt(in.readLine());

			// Processamento: adiciona ao vetor o valor de v na posicao i
			vetor[i] = v;
		}

		// Processamento: laco de repeticao de 0 ate N
		for (int i = 0; i < n; i++) {
			// Processamento: busca o valor na posicao i do vetor 
			v = vetor[i];
			
			// Processamento: testa se v e par e se v e diferente de 0
			if(Math.abs(v) % 2 == 0 && v != 0){
				
				// Saida: imprime o valor de par
				System.out.print("EVEN ");
				
				// Processamento: testa se o v impar
			} else if(Math.abs(v) % 2 == 1){
				
				// Saida: imprime o valor de impar
				System.out.print("ODD ");
			}
			
			// Processamento: testa se o v e positivo
			if(v > 0){
				
				// Saida: imprime o valor positivo
				System.out.println("POSITIVE");
				
				// Processamento: testa se o v e negativo
			} else if( v < 0){
				
				// Saida: imprime o valor negativo
				System.out.println("NEGATIVE");
				
				// Processamento: testa se o valor e igual a zero
			} else {
				
				// Saida: imprime NULL
				System.out.println("NULL");
			}
		}
	}
}
