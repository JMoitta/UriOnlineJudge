package iniciante.e1017;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		
		int H = can.nextInt();
		int V = can.nextInt();
		
		System.out.printf("%.3f\n", ((H * V) / 12.0));
	}
}
