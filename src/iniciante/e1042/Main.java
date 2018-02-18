package iniciante.e1042;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {

	public static void main(String[] args) throws IOException {
		// Configurações do sistema
		Locale.setDefault(Locale.US);

		// Declaração e inicialização de variaveis
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		String[] entrada;
		int auxilar;
		int[] valores = new int[3];

		// Entrada: leitura de tres valores inteiros
		entrada = in.readLine().split(" ");
		
		// Processamento: Preenchimento do array com os tres inteiros
		for(int i = 0; i < valores.length; ++i ){
			valores[i] = Integer.parseInt(entrada[i]);
		}

		// Processamento: Ordenar os valores na ordem crescente
		boolean troca = false;
	    do {
	    	troca = false;
	        for (int a = 0; a < valores.length - 1; a++) {
	            if (valores[a] > valores[a + 1]) {
	                auxilar = valores[a];
	                valores[a] = valores[a + 1];
	                valores[a + 1] = auxilar;
	                troca = true;
	            }
	        }
	    } while (troca);
	    
	    // Saida: Imprimir os tres valores ordenados
	    for(int valor : valores){
	    	System.out.println(valor);
	    }
	    
	    // Saida: Imprimir quebra de linha
	    System.out.println();
	    
	    // Saida: Imprimir valores da ordem original
	    for(String valor : entrada) {
	    	System.out.println(valor);
	    }
	}
}
