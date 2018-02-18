package iniciante.e1014;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		
		int A = can.nextInt();
		
		double B = can.nextDouble();
		
		System.out.printf("%.3f km/l\n", (A / B));
	}
}
