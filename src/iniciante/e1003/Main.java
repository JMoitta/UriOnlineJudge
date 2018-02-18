package iniciante.e1003;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int A, B, SOMA;
		Scanner can = new Scanner(System.in);
		A = Integer.parseInt(can.nextLine());
		B = Integer.parseInt(can.nextLine());
		SOMA = A + B;
		
		System.out.printf("SOMA = %d\n", SOMA);
	}
}
