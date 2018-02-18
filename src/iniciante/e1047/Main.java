package iniciante.e1047;

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
		int horaInicial, horaFinal, minutoInicial, minutoFinal, intervaloEmMinuto, duracaoHora, duracaoMinuto;

		// Entrada: Leitura de tres valores de ponto flutuante
		entrada = in.readLine().split(" ");

		// Processamento: Atribuição as variaveis horaInicial, horaFinal
		horaInicial = Integer.parseInt(entrada[0]);
		minutoInicial = Integer.parseInt(entrada[1]);
		horaFinal = Integer.parseInt(entrada[2]);
		minutoFinal = Integer.parseInt(entrada[3]);

		// Processamento: Conversão das horas e minutos
		minutoInicial = (horaInicial * 60) + minutoInicial;
		minutoFinal = (horaFinal * 60) + minutoFinal;
		
		// Processamento: Testa se o jogo acabou no mesmo dia
		if (minutoFinal > minutoInicial) {
			
			// Processamento: Calcula intervalo em minutos
			intervaloEmMinuto = minutoFinal - minutoInicial;
			
			// Processamento: Testa se o jogo acabou no outro dia
		} else {
			
			// Processamento: Calcula intervalo em minutos
			intervaloEmMinuto = (minutoFinal + 1440) - minutoInicial;
		}
		
		// Processamento: Calcula a hora e o minuto
		duracaoHora = intervaloEmMinuto / 60;
		duracaoMinuto = intervaloEmMinuto % 60;

		// Saida: Imprime a duração do jogo
		System.out.println("O JOGO DUROU " + duracaoHora + " HORA(S) E " + duracaoMinuto + " MINUTO(S)");
	}
}
