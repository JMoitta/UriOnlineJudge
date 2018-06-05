package iniciante.e1150;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int X;
	private static int Z;
	private static int i    = -1;
	private static int soma =  0;
	
	
	// main(args)
	public static void main(String[] args) {
		
		// Ultrapassando Z
		ultrapassandoZ();
		
	}

	private static void ultrapassandoZ() {

		X = nextInt();
		
		do {
			Z = nextInt();
		}while(!(Z > X));
		
		do {
			i++;
			soma += X + i;
		}while(!(soma > Z));
		
		System.out.println(i + 1);
	}

	private static int nextInt() {
		return Integer.parseInt(scan.nextLine());
	}

}