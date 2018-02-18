package iniciante.e1046;

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
		int horaInicial, horaFinal;

		// Entrada: Leitura de tres valores de ponto flutuante
		entrada = in.readLine().split(" ");

		// Processamento: Atribuição as variaveis horaInicial, horaFinal
		horaInicial = Integer.parseInt(entrada[0]);
		horaFinal = Integer.parseInt(entrada[1]);

		// Processamento: Testa se o jogo acabou no mesmo dia
		if (horaFinal > horaInicial) {

			// Saida: Imprime a duração do jogo
			System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORA(S)");

			// Processamento: Testa se o jogo acabou no outro dia
		} else {

			// Saida: Imprime a duração do jogo
			System.out.println("O JOGO DUROU " + ((horaFinal + 24) - horaInicial) + " HORA(S)");
		}

	}
}
