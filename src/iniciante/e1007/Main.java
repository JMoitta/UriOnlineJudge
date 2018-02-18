package iniciante.e1007;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int A, B, C, D;
		Scanner can = new Scanner(System.in);
		A = Integer.parseInt(can.nextLine());
		B = Integer.parseInt(can.nextLine());
		C = Integer.parseInt(can.nextLine());
		D = Integer.parseInt(can.nextLine());
		
		System.out.printf("DIFERENCA = %d\n", (A * B - C * D));
	}
}
