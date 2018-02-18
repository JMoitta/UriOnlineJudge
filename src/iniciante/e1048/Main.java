package iniciante.e1048;

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
		float salario, salarioNovo, reajusteGanho;
		int percentual = 0;
		// Entrada: Leitura do salario atual de funcionario
		salario = Float.parseFloat(in.readLine());

		// Processamento: Testa se o salario do funcionario e de 0 a 400
		if (salario <= 400) {

			// Processamento: Atribui o valor 15 % ao percentual de reajuste
			percentual = 15;

			// Processamento: Testa se o salario do funcionario e de 400.01 a
			// 800
		} else if (salario <= 800) {

			// Processamento: Atribui o valor 12 % ao percentual de reajuste
			percentual = 12;

			// Processamento: Testa se o salario do funcionario e de 800.01 a
			// 1200
		} else if (salario <= 1200) {

			// Processamento: Atribui o valor 10 % ao percentual de reajuste
			percentual = 10;

			// Processamento: Testa se o salario do funcionario e de 1200.01 a
			// 2000
		} else if (salario <= 2000) {

			// Processamento: Atribui o valor 7 % ao percentual de reajuste
			percentual = 7;

			// Processamento: Testa se o salario do funcionario e acima de
			// 2000
		} else if (salario > 2000) {

			// Processamento: Atribui o valor 4 % ao percentual de reajuste
			percentual = 4;
		}
		
		// Processamento: Calcular o reajuste ganhoe o novo salario 
		reajusteGanho = salario * percentual / 100;
		salarioNovo = salario + reajusteGanho;

		System.out.printf("Novo salario: %.2f\n", salarioNovo);
		System.out.printf("Reajuste ganho: %.2f\n", reajusteGanho);
		System.out.printf("Em percentual: %d ", percentual);
		System.out.println("%");
	}
}
