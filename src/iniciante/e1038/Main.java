package iniciante.e1038;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Declaração de variaveis
		Scanner scan = new Scanner(System.in);
		int cod, qtd;
		double total = 0;
		String[] entrada;

		// Entrada: Entrada de codigo e quantidade
		entrada = scan.nextLine().split(" ");

		// Processamento: Atribuir variaveis cod, qtd.
		cod = Integer.parseInt(entrada[0]);
		qtd = Integer.parseInt(entrada[1]);

		// Processamento: Descubir o item
		// Processamento: Item cod 1, especificação Cachorro Quente, preço R$
		// 4,00
		if (cod == 1) {

			// Processamento: Calcular o valor total
			total = qtd * 4;

			// Processamento: Item cod 2, especificação X-Salada, preço R$ 4,50
		} else if (cod == 2) {

			// Processamento: Calcular o valor total
			total = qtd * 4.5;

			// Processamento: Item cod 3, especificação X-Bacon, preço R$5,00
		} else if (cod == 3) {

			// Processamento: Calcular o valor total
			total = qtd * 5;

			// Processamento: Item cod 4, especificação Torrada simples, preço
			// R$2,00
		} else if (cod == 4) {

			// Processamento: Calcular o valor total
			total = qtd * 2;
			
			// Processamento: Item cod 5, especificação Refrigerante, preço
			// R$1,50
		} else if (cod == 5) {

			// Processamento: Calcular o valor total
			total = qtd * 1.5;

		}
		
		// Saida: Imprimir total do lanche
		System.out.printf("Total: R$ %.2f\n", total );
	}
}
