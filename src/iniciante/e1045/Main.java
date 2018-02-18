package iniciante.e1045;

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
		float[] vetor = new float[3];
		float auxilar, A, B, C;
		// Entrada: Leitura de tres valores de ponto flutuante
		entrada = in.readLine().split(" ");
		
		// Processamento: Atribuição e ordenação dos valores de entrada ao vetor
		for(int i = 0; i < entrada.length; ++i ) {
			vetor[i] = Float.parseFloat(entrada[i]);
		}
		
		// Processamento: Ordenar o valores na ordem decrescente
		boolean troca = false;
	    do {
	    	troca = false;
	        for (int a = 0; a < vetor.length - 1; a++) {
	            if (vetor[a] < vetor[a + 1]) {
	                auxilar = vetor[a];
	                vetor[a] = vetor[a + 1];
	                vetor[a + 1] = auxilar;
	                troca = true;
	            }
	        }
	    } while (troca);
	    
	    // Processamento: Atribuição as variaveis A, B e C
	    A = vetor[0];
	    B = vetor[1];
	    C = vetor[2];
	    
	    // Processamento: Testa se os lados nao forma um triangulo
	    if(A >= (B + C)) {
	    	
	    	// Saida: Imprime para usuario que os lados nao forma triangulo
	    	System.out.println("NAO FORMA TRIANGULO");
	    	
	    	// Processamento: Testa se os lados forma um triangulo
	    } else {
	    	
	    	// Processamento: Testa se forma um triangulo retangulo
	    	if(Math.pow(A, 2) == (Math.pow(B, 2) + Math.pow(C, 2))){
	    		
	    		// Saida: Imprime para usuario que e triangulo retangulo
	    		System.out.println("TRIANGULO RETANGULO");
	    	}
	    	
	    	// Processamento: Testa se forma um triangulo obtusangulo
	    	if(Math.pow(A, 2) > (Math.pow(B, 2) + Math.pow(C, 2))){

	    		// Saida: Imprime para usuario que e triangulo obtusangulo
	    		System.out.println("TRIANGULO OBTUSANGULO");
	    	}

	    	// Processamento: Testa se forma um triangulo acutangulo
	    	if(Math.pow(A, 2) < (Math.pow(B, 2) + Math.pow(C, 2))){
	    		
	    		// Saida: Imprime para usuario que e triangulo acutangulo
	    		System.out.println("TRIANGULO ACUTANGULO");
	    	}
	    	
	    	// Processamento: Testa se forma um triangulo equilatero
	    	if(A == B && B == C){
	    		
	    		// Saida: Imprime para usuario que e triangulo equilatero
	    		System.out.println("TRIANGULO EQUILATERO");
	    	}
	    	
	    	// Processamento: Testa se forma um triangulo isosceles
	    	if((A == B || A == C || B == C) && (A != B || A != C || B != C)) {
	    		
	    		// Saida: Imprime para usuario que e triangulo isosceles
	    		System.out.println("TRIANGULO ISOSCELES");
	    	}
	    }
	}
}
