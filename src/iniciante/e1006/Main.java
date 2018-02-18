package iniciante.e1006;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double A, B, C, M;
		Scanner can = new Scanner(System.in);
		A = Double.parseDouble(can.nextLine());
		B = Double.parseDouble(can.nextLine());
		C = Double.parseDouble(can.nextLine());
		
		M = (A * 2 + B * 3 + C * 5) / 10;
		
		System.out.printf("MEDIA = %.1f\n", M);
	}
}
