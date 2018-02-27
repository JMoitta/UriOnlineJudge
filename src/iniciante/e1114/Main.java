package iniciante.e1114;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Declaracao de variaveis.
		Scanner scan = new Scanner(System.in);
		int N;
		
		// Processamento: laco de repeticao enquanto a senha for invalida
		do{
			
			// Entrada: Leitura de um caso de teste de valor inteiro.
			N = Integer.parseInt(scan.nextLine());
			
			// Processamento:
			if(N == 2002) {
				
				// Saida: Imprime acesso permitido
				System.out.println("Acesso Permitido");
				
				// Processamento: encerra o laco de repeticao
				break;
				
				// Processamento: caso a senha seja invalida
			} else {
				
				// Saida: Imprime senha invalida
				System.out.println("Senha Invalida");
			}
		}while(true);
		
	}
}
