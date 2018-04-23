package iniciante.e1134;
import java.util.Scanner;

public class Main {
	private static Scanner scan = new Scanner(System.in);
	private static int alcool = 0;
	private static int gasolina = 0;
	private static int diesel = 0;
	
	public static void main(String[] args) {

		clientesPosto();
		imprimeResultado();
	}

	private static void imprimeResultado() {
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d\n",alcool);
		System.out.printf("Gasolina: %d\n", gasolina);
		System.out.printf("Diesel: %d\n", diesel);
	}

	private static void clientesPosto() {
		// Declaracao de variaveis.
		int combustivel, Aux;

		// Leitura do tipo de combustivel
		combustivel = obterCombustivel();

		if(combustivel == 1){
			alcool++;
		} else 
		if(combustivel == 2){
			gasolina++;
		} else 
		if(combustivel == 3){
			diesel++;
		}

		if (combustivel != 4) {
			clientesPosto();
		}
	}

	private static int leituraDeInt() {
		return Integer.parseInt(scan.nextLine());
	}

	private static int obterCombustivel() {
		int r;
		r = leituraDeInt();
		if (r < 1 || r > 4) {
			r = obterCombustivel();
		}
		return r;
	}

}