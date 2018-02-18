package iniciante.e1050;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

interface UsuarioInterface {
	public Usuario Usuario();
}

abstract class Usuario implements UsuarioInterface {
	public Usuario Usuario(){
		System.out.println("super");
		return this;
	}
}

class UsuarioImplentado extends Usuario {

	

	@Override
	public iniciante.e1050.Usuario Usuario() {
		System.out.println("hah");
		return this;
	}

}

class UsuarioImplentado2 extends Usuario {

}

public class Main {

	public static void main(String[] args) throws IOException {

		UsuarioInterface ui = new UsuarioImplentado();
		ui.Usuario();
		// Configurações do sistema
		Locale.setDefault(Locale.US);

		// Declaração de variaveis
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		String ddd, msg;
		Map<String, String> dddCidade = new HashMap<>();

		// Inicialização de variaveis
		dddCidade.put("61", "Brasilia");
		dddCidade.put("71", "Salvador");
		dddCidade.put("11", "Sao Paulo");
		dddCidade.put("21", "Rio de Janeiro");
		dddCidade.put("32", "Juiz de Fora");
		dddCidade.put("19", "Campinas");
		dddCidade.put("27", "Vitoria");
		dddCidade.put("31", "Belo Horizonte");

		// Entrada: Leitura de um número inteiro que representa um código de DDD
		ddd = in.readLine();

		// Processamento: Descobri qual ddd foi informado e atribui a cidade do
		// ddd a variavel msg
		msg = dddCidade.get(ddd);

		// Saida: imprime a cidade se existe
		System.out.println(msg != null ? msg : "DDD nao cadastrado");
	}
}
