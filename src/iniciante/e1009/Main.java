package iniciante.e1009;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		
		can.nextLine();
		double salarioFixo = can.nextDouble();
		double vendas = can.nextDouble();
		
		System.out.printf("TOTAL = R$ %.2f\n", (salarioFixo + vendas * .15));
		
	}
}
