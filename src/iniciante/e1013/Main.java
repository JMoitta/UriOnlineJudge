package iniciante.e1013;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);

		String grupoValores = can.nextLine();
		
		String[] arrayValores = grupoValores.split(" ");
		
		int valor1 = Integer.parseInt(arrayValores[0]);
		int valor2 = Integer.parseInt(arrayValores[1]);
		int valor3 = Integer.parseInt(arrayValores[2]);
		
		int maior = (valor1 + valor2 + Math.abs(valor1 - valor2)) / 2;
		maior = (maior + valor3 + Math.abs(maior - valor3)) / 2;
		
		System.out.println(maior + " eh o maior");
	}
}
