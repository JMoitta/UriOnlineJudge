package iniciante.e1015;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		
		String[] array1 = can.nextLine().split(" ");
		String[] array2 = can.nextLine().split(" ");
		
		double x1 = Double.parseDouble(array1[0]),
				y1 = Double.parseDouble(array1[1]),
				x2 = Double.parseDouble(array2[0]),
				y2 = Double.parseDouble(array2[1]);
		
		System.out.printf("%.4f\n",
				Math.sqrt(
						(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))));
	}
}
