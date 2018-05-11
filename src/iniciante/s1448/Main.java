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
		System.out.println();
	}

	private static int coincidencias(String time) {
		int coincidencias = 0;
		for(int i = 0; i < time.length(); i++) {
			if(time.charAt(i) == fraseCoreta.charAt(i)) {
				coincidencias++;
			} else {
				
			}
		}
		return coincidencias;
	}


	private static int testaEmpate() {
		for(int i = 0; i < fraseCoreta.length(); i++) {
			if(fraseCoreta.charAt(i) != time_frase_1.charAt(i)
					&& fraseCoreta.charAt(i) != time_frase_2.charAt(i)) {
				System.out.println("empate");
				return 0;
			}
			if (fraseCoreta.charAt(i) == time_frase_1.charAt(i)
					&& fraseCoreta.charAt(i) != time_frase_2.charAt(i) ){
				System.out.println("time 1");
				return 0;
			}
			if (fraseCoreta.charAt(i) != time_frase_1.charAt(i)
					&& fraseCoreta.charAt(i) == time_frase_2.charAt(i)) {
				System.out.println("time 2");
				return 0;
			}
		}
		System.out.println("empate");
		return 0;
	}

	private static int leituraDeInt() {
		return Integer.parseInt(scan.nextLine());
	}

}