package iniciante.e1079;

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
		float[][] casos;
		String[] entrada;
		// Entrada: Leitura de 1 valor inteiro N.
		n = Integer.parseInt(in.readLine());
		
		// Processamento: Inicializa a variavel casos como tamanho de N.
		casos = new float[n][3];
 
		// Processamento: laco de repeticao de 0 ate menor N
		for (int i = 0; i < n; i++) {
			// Entrada: leitura do caso de teste.
			entrada = in.readLine().split(" ");
			
			// Processamento: laco de repecicao de 0 ate menor 3
			for(int j = 0; j < 3; j++){
				
				// Processamento: atribui ao vetor o valor de entrada do caso na posicao j.
				casos[i][j] = Float.parseFloat(entrada[j]);
			}
		}
		
		// Processamento: laco de repeticao de 0 ate menor N
		for (int i = 0; i < n; i++) {
			// Saida: calcula a media ponderada do caso e imprime na tela
			System.out.printf("%.1f\n", (((casos[i][0] * 2) + (casos[i][1] * 3) + (casos[i][2] * 5)) / 10));
		}
	}
}
