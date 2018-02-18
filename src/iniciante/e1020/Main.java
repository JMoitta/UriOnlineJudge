package iniciante.e1020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		
		int DT = can.nextInt();
		int A = DT / 365;
		DT %= 365;
		int M = DT / 30;
		DT %= 30;
		int D = DT;
		
		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", A, M, D);
	}
}