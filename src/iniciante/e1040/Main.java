package iniciante.e1040;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		float n1, n2, n3, n4, media;

		String num = in.readLine();
		String[] arrNum = num.split(" ");

		n1 = Float.parseFloat(arrNum[0]) * 2;
		n2 = Float.parseFloat(arrNum[1]) * 3;
		n3 = Float.parseFloat(arrNum[2]) * 4;
		n4 = Float.parseFloat(arrNum[3]);

		media = (n1 + n2 + n3 + n4) / 10;
		System.out.printf("Media: %.1f\n", media);

		if (media >= 7.0) {
			System.out.printf("Aluno aprovado.\n");
		} else if (media < 5.0) {
			System.out.printf("Aluno reprovado.\n");
		} else {
			System.out.printf("Aluno em exame.\n");
			float exame = Float.parseFloat(in.readLine());
			System.out.printf("Nota do exame: %.1f\n", exame);

			media = (media + exame) / 2;

			if (media >= 5.0) {
				System.out.printf("Aluno aprovado.\n");
			} else {
				System.out.printf("Aluno reprovado.\n");
			}
			System.out.printf("Media final: %.1f\n", media);

		}

	}

	public static void maind(String[] args) {

		// Declaração de variaveis
		Scanner scan = new Scanner(System.in);
		String[] entrada;
		double N1, N2, N3, N4, media, exame = 0;

		// Entrada: Leitura das quatro de notas
		entrada = scan.nextLine().split(" ");

		// Processamento: Atribuir os valores das notas
		N1 = Double.parseDouble(entrada[0]);
		N2 = Double.parseDouble(entrada[1]);
		N3 = Double.parseDouble(entrada[2]);
		N4 = Double.parseDouble(entrada[3]);

		// Processamento: Calcular a media do aluno
		media = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / (2 + 3 + 4 + 1);

		// Saida: Media do aluno.
		System.out.printf("Media: %.1f\n", media);

		// Processamento: Aluno com a media maior ou igual a 7
		if (media >= 7) {

			// Saida: Aluno aprovado.
			System.out.println("Aluno aprovado.");

			// Processamento: Aluno com media inferior a 5
		} else if (media < 5) {

			// Saida: Aluno reprovado.
			System.out.println("Aluno reprovado.");

			// Processamento: Aluno com media de 5 a 6.9
		} else {

			// Saida: Aluno em exame.
			System.out.println("Aluno em exame.");

			// Entrada: Leitura da nota do exame
			exame = Double.parseDouble(scan.nextLine());

			// Saida: Nota do exame:
			System.out.printf("Nota do exame: %.1f\n", exame);

			// Processamento: Nova media do aluno
			media = (media + exame) / 2;

			// Processamento: aluno media maior ou igual a 5
			if (media >= 5) {

				// Saida: Aluno aprovado.
				System.out.println("Aluno aprovado.");

				// Processamento: Aluno media menor que 5
			} else {

				// Saida: Aluno reprovado.
				System.out.println("Aluno reprovado.");
			}

			// Saida: Media final do aluno
			System.out.printf("Media final: %.1f\n", media);
		}
	}

}
