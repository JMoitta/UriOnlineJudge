package iniciante.e1072;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
	public static void main(String[] args) throws IOException {
		// Configurações do sistema
		Locale.setDefault(Locale.US);

		// Declaração de variaveis
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		Integer n, valor;
		List<Integer> inInt = new ArrayList<>();
		List<Integer> outInt = new ArrayList<>();
		// Entrada: Leitura de n valor de ponto flutuante
		n = Integer.parseInt(in.readLine());
		
		for(int i = 0; i < n; i++){
			valor = Integer.parseInt(in.readLine());
			
			if(valor >= 10 && valor <= 20){
				inInt.add(valor);
			} else {
				outInt.add(valor);
			}
		}

		// Processamento: Atribuição as variaveis horaInicial, horaFinal
		System.out.printf("%s in\n",inInt.size());
		System.out.printf("%s out\n",outInt.size());
	}
}
