package iniciante.s1448;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int t;
	private static String fraseCoreta;
	private static int time_1;
	private static int time_2;
	private static String time_frase_1;
	private static String time_frase_2;
	private static String Vencedor;
	
	
	// main(args)
	public static void main(String[] args) {
		
		// Telefone Sem Fio
		telefoneSemFio();
	}

	private static void telefoneSemFio() {
		
		t = leituraDeInt();
		
		for(int i = 1; i <= t; i++) {
			fraseCoreta = scan.nextLine();
			// Time 1
			time_frase_1 = scan.nextLine();
			time_1 = coincidencias(time_frase_1);
			
			// Time 2
			time_frase_2 = scan.nextLine();
			time_2 = coincidencias(time_frase_2);
			
			// Imprimir resultado
			imprimirResultado(i);
		}
	}

	private static void imprimirResultado(int instancia) {
		
		// Instancia
		System.out.printf("Instancia %d\n", instancia);
		
		if(time_1 > time_2) {
			System.out.println("time 1");
		} else if (time_2 > time_1) {
			System.out.println("time 2");
		} else {
			testaEmpate();
		}
		if(instancia < t) {
			System.out.println();
		}
	}

	private static int coincidencias(String time) {
		int coincidencias = 0;
		for(int i = 0; i < time.length(); i++) {
			if(time.getBytes()[i] == fraseCoreta.getBytes()[i]) {
				coincidencias++;
			}
		}
		return coincidencias;
	}


	private static void testaEmpate() {
		for(int i = 0; i < fraseCoreta.length(); i++) {
			if(fraseCoreta.getBytes()[i] != time_frase_1.getBytes()[i]
					&& fraseCoreta.getBytes()[i] != time_frase_2.getBytes()[i]) {
				System.out.println("empate");
				return;
			}
			if (fraseCoreta.getBytes()[i] == time_frase_1.getBytes()[i]
					&& fraseCoreta.getBytes()[i] != time_frase_2.getBytes()[i]) {
				System.out.println("time 1");
				return;
			}
			if (fraseCoreta.getBytes()[i] != time_frase_1.getBytes()[i]
					&& fraseCoreta.getBytes()[i] == time_frase_2.getBytes()[i]) {
				System.out.println("time 2");
				return;
			}
		}
		System.out.println("empate");
	}

	private static int leituraDeInt() {
		return Integer.parseInt(scan.nextLine());
	}

}