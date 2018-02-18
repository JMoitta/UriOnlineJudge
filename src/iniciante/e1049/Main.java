package iniciante.e1049;

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
		String palavra1, palavra2, palavra3, msg;

		// Entrada: Leitura de 3 palavras que definem o tipo de animal
		palavra1 = in.readLine();
		palavra2 = in.readLine();
		palavra3 = in.readLine();

		// Processamento: Testa se o animal e um vertebrado
		if (palavra1.equals("vertebrado")) {

			// Processamento: Testa se o animal e uma ave
			if (palavra2.equals("ave")) {

				// Processamento: Testa se o animal e um carnivoro
				if (palavra3.equals("carnivoro")) {

					// Processamento: Atribui o valor aguia a msg
					msg = "aguia";

					// Processamento: Testa se o animal e um onivoro
				} else {

					// Processamento: Atribui o valor pomba a msg
					msg = "pomba";
				}
				// Processamento: Testa se o animal e um mamifero
			} else {

				// Processamento: Testa se o animal e um onivoro
				if (palavra3.equals("onivoro")) {

					// Processamento: Atribui o valor homem a msg
					msg = "homem";

					// Processamento: Testa se o animal e um herbivoro
				} else {

					// Processamento: Atribui o valor vaca a msg
					msg = "vaca";
				}
			}
			// Processamento: Testa se o animal e um invertebrado
		} else {

			// Processamento: Testa se o animal e um inseto
			if (palavra2.equals("inseto")) {

				// Processamento: Testa se o animal e um hematofago
				if (palavra3.equals("hematofago")) {

					// Processamento: Atribui o valor pulga a msg
					msg = "pulga";

					// Processamento: Testa se o animal e um herbivoro
				} else {

					// Processamento: Atribui o valor largata a msg
					msg = "lagarta";
				}
				// Processamento: Testa se o animal e um anelideo
			} else {
				
				// Processamento: Testa se o animal e um hematofago
				if (palavra3.equals("hematofago")) {
					
					// Processamento: Atribui o valor sanguessuga a msg
					msg = "sanguessuga";
					
					// Processamento: Testa se o animal e um onivoro	
				} else {
					
					// Processamento: Atribui o valor sanguessuga a msg
					msg = "minhoca";
				}
			}
		}
		
		// Saida: Imprime o tipo de animal atribuido a msg
		System.out.println(msg);
	}
}
