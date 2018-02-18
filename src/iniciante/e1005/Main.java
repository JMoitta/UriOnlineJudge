package iniciante.e1005;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double A, B, M;
		Scanner can = new Scanner(System.in);
		A = Double.parseDouble(can.nextLine());
		B = Double.parseDouble(can.nextLine());
		
		M = (A * 3.5 + B * 7.5) / 11;
		
		System.out.printf("MEDIA = %.5f\n", M);
	}
}
