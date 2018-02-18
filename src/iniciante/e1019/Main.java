package iniciante.e1019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		
		int S = can.nextInt();
		int s = S % 60;
		S /= 60;
		int m = S % 60;
		S /= 60;
		int h = S % 60;
		
		System.out.printf("%d:%d:%d\n", h, m, s);
	}
}