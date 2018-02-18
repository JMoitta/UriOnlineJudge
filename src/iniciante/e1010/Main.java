package iniciante.e1010;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		
		String peca1 = can.nextLine();
		String peca2 = can.nextLine();
		
		String[] valor1 = peca1.split(" ");
		String[] valor2 = peca2.split(" ");
		
		int cod1 = Integer.parseInt(valor1[0]);
		int qtd1 = Integer.parseInt(valor1[1]);
		double val1 = Double.parseDouble(valor1[2]);
		
		int cod2 = Integer.parseInt(valor2[0]);
		int qtd2 = Integer.parseInt(valor2[1]);
		double val2 = Double.parseDouble(valor2[2]);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", (qtd1 * val1 + qtd2 * val2));
		
	}
}
