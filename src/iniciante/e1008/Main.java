package iniciante.e1008;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double A, B, C, D, E, F, G;
		Scanner can = new Scanner(System.in);
		A = Double.parseDouble(can.nextLine());
		B = Double.parseDouble(can.nextLine());
		C = Double.parseDouble(can.nextLine());
		
		
		System.out.printf("NUMBER = %.0f\n", A);

		System.out.printf("SALARY = U$ %.2f\n", (B * C));
	}
}
