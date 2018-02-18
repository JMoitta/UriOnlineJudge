package iniciante.e1044;

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
		int A, B;
		
		// Entrada: Leitura de dois valores inteiros
		entrada = in.readLine().split(" ");
		
		// Processamento: Atribuição as variaveis A e B
		A = Integer.parseInt(entrada[0]);
		B = Integer.parseInt(entrada[1]);
		
		// Processamento: Testa se A ou B e igual ou inferior a zero
		if ( A <= 0 || B <= 0){
			
			//Saida: B nao e divisivel por A e A nao e divisivel por B
			System.out.printf("Nao sao Multiplos\n");
			
			// Processamento: Testa se B e divisivel por A ou se A e divisivel por B
		} else if(B % A == 0 || A % B == 0){
			
			//Saida: B e divisivel por A ou B e divisivel por A
			System.out.printf("Sao Multiplos\n");
			
			// Processamento: testa se B nao e divisivel por A
		} else {
			
			//Saida: B nao e divisivel por A e A nao e divisivel por B
			System.out.printf("Nao sao Multiplos\n");
		}
		
		
	}	

}
