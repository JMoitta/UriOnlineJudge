package iniciante.s1448;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int t;
	private static String frase;
	private static String frase_time_1;
	private static String frase_time_2;
	private static int coincidenciasTime1 = 0;
	private static int coincidenciasTime2 = 0;
	private static int primeiroErroTime1 = -1;
	private static int primeiroErroTime2 = -1;
	
	// main(args)
	public static void main(String[] args) {
		
		// Telefone Sem Fio
		telefoneSemFio();
	}

	private static void telefoneSemFio() {
		t = Integer.parseInt(scan.nextLine());
		
		for(int i = 0; i < t;) {
			frase = scan.nextLine();
			frase_time_1 = scan.nextLine();
			frase_time_2 = scan.nextLine();
			
			imprimirInstancia(++i);
		}
	}

	private static void imprimirInstancia(int instancia) {
		primeiroErroTime1 = -1;
		primeiroErroTime2 = -1;
		coincidenciasTime1 = 0;
		coincidenciasTime2 = 0;
		for(int i = 0; i < frase.length(); i++) {
			if(frase.length() == frase_time_1.length() && (frase_time_1.charAt(i) == frase.charAt(i))) {
				coincidenciasTime1++;
			}
			else if(primeiroErroTime1 == -1) {
				primeiroErroTime1 = i;
			}
			if(frase.length() == frase_time_1.length() && (frase_time_2.charAt(i) == frase.charAt(i))) {
				coincidenciasTime2 ++;
			}
			else if(primeiroErroTime2 == -1) {
				primeiroErroTime2 = i;
			}
			
			if(primeiroErroTime1 == primeiroErroTime2 && primeiroErroTime1 != -1) {
				primeiroErroTime1 = -1;
				primeiroErroTime2 = -1;
				
			}
		}
		System.out.println("Instancia " + instancia);
		if (coincidenciasTime1 > coincidenciasTime2) {
			System.out.println("time 1");
		} else if (coincidenciasTime1 <	 coincidenciasTime2) {
			System.out.println("time 2");
		} else {
			if (primeiroErroTime1 > primeiroErroTime2 && primeiroErroTime1 != -1) {
				System.out.println("time 1");
			} else if (primeiroErroTime1 < primeiroErroTime2 && primeiroErroTime2 != -1) {
				System.out.println("time 2");
			} else {
				System.out.println("empate");
			}
		}
		System.out.println("");
	}

}