package iniciante.e1002;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double A, R;
		Scanner can = new Scanner(System.in);
		A = Double.parseDouble(can.nextLine());
		
		
		A = Math.pow(A, 2) * 3.14159;
		
		System.out.printf("A=%.4f\n", A);
	}
}
