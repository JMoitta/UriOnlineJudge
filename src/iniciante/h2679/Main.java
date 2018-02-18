package iniciante.h2679;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		int par = x % 2 == 0? x + 2: x + 1;
		
		System.out.println(par);
	}
}
