package iniciante.e1115;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Declaracao de variaveis.
		Scanner scan = new Scanner(System.in);
		String[] entrada;
		String saida = new String();
		int X, Y;

		// Processamento: laco de repeticao enquanto a senha for invalida
		do {

			// Entrada: Leitura de as coordenadas (X,Y)
			entrada = scan.nextLine().split(" ");

			// Processamento: Define X, Y
			X = Integer.parseInt(entrada[0]);
			Y = Integer.parseInt(entrada[1]);

			// Processamento: Testa se X e positivo
			if (X > 0) {

				// Processamento: Testa se Y e positivo
				if (Y > 0) {

					// Saida: Imprime 'primeiro'
					saida += "primeiro\n";

					// Processamento: Testa se Y e negativo
				} else if (Y < 0) {

					// Saida: Imprime 'quarto'
					saida += ("quarto\n");

					// Processamento: Testa se Y e igual a 0
				} else {

					// Processamento: Encerrar o laco de repeticao
					break;
				}
				
				//Processamento: Testa se X negativo
			} else if (X < 0) {
				
				// Processamento: Testa se Y e positivo
				if (Y > 0) {

					// Saida: Imprime 'segundo'
					saida += ("segundo\n");

					// Processamento: Testa se Y e negativo
				} else if (Y < 0) {

					// Saida: Imprime 'terceiro'
					saida += ("terceiro\n");

					// Processamento: Testa se Y e igual a 0
				} else {

					// Processamento: Encerrar o laco de repeticao
					break;
				}
				
				// Processamento: Testa se X e igual a 0
			} else {
				
				// Processamento: Encerrar o laco de repeticao
				break;
			}
		} while (true);
		System.out.print(saida);
	}
}
