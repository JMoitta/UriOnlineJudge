package iniciante.e1131;

import java.util.Scanner;

public class Main {
	// Declaracao dos atributos.
	private static Scanner scan = new Scanner(System.in);
	private static int grenais = 0;
	private static int inter = 0;
	private static int gremio = 0;
	private static int empates = 0;

	private static int leituraDeInt() {
		return Integer.parseInt(scan.nextLine());
	}

	private static int leituraDeNovoGrenal() {
		int r;
		r = leituraDeInt();
		if (r < 1 || r > 2) {
			System.out.println("Novo grenal (1-sim 2-nao)");
			r = leituraDeNovoGrenal();
		}
		return r;
	}

	private static int[] leituraDaPartida() {
		int[] partida;
		String[] entrada = scan.nextLine().split(" ");
		partida = new int[entrada.length];
		for (int i = 0; i < entrada.length; i++) {
			partida[i] = Integer.parseInt(entrada[i]);
		}
		return partida;
	}


	private static void novoCalculo() {

		// Declaracao de variaveis.
		int[] partida;

		// Entrada: Leitura dos gols da partida de gremio e inter
		partida = leituraDaPartida();

		// Gols do Inter
		if(partida[0] > partida[1]) {
			inter++;
		}
		// Gols do Gremio
		if(partida[1] > partida[0]) {
			gremio++;
		}
		// Contagem de grenais
		grenais++;
		
		// Contagem de empates
		if(partida[0] == partida[1]) {
			empates++;
		}
		
		// Mensagem de novo grenal
		System.out.println("Novo grenal (1-sim 2-nao)");
		
		// Testa se tem mais grenal
		if (1 == leituraDeNovoGrenal()) {
			novoCalculo();
		}
	}

	private static void resultadoSaida() {
		System.out.printf("%d grenais\n", grenais);
		System.out.printf("Inter:%d\n", inter);
		System.out.printf("Gremio:%d\n", gremio);
		System.out.printf("Empates:%d\n", empates);
		if(gremio > inter) {
			System.out.printf("Gremio venceu mais\n");
		} else 
		if (inter > gremio) {
			System.out.printf("Inter venceu mais\n");
		} else {
			System.out.printf("Nao houve vencedor\n");
		}
	}
	public static void main(String[] args) {

		novoCalculo();
		resultadoSaida();
	}

	
}
