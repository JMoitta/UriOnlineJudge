package iniciante.e1012;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);

		double A = can.nextDouble();
		double B = can.nextDouble();
		double C = can.nextDouble();

		System.out.printf("TRIANGULO: %.3f\n", (A * C / 2));
		System.out.printf("CIRCULO: %.3f\n", (3.14159 * Math.pow(C, 2)));
		System.out.printf("TRAPEZIO: %.3f\n", ((A + B) * C / 2));
		System.out.printf("QUADRADO: %.3f\n", (Math.pow(B, 2)));
		System.out.printf("RETANGULO: %.3f\n", (A * B));
	}
}
