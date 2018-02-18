package iniciante.e1021;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		
		double Valor = can.nextDouble(), V = Valor;
		
		int N100 = (int) Valor / 100;
		Valor = Valor % 100;
		
		int N50 = (int) Valor / 50;
		Valor %= 50;
		
		int N20 = (int) Valor / 20;
		Valor %= 20;
		
		int N10 = (int) Valor / 10;
		Valor %= 10;
		
		int N5 = (int) Valor / 5;
		Valor %= 5;
		
		int N2 = (int) Valor / 2;
		Valor %= 2;
		
		int M100 = (int) Valor / 1;
		Valor %= 1;
		
		Valor *= 100;
		int M50 = (int) (Valor / 50);
		Valor %= 50;
		
		int M25 = (int) (Valor / 25);
		Valor %= 25;
		
		int M10 = (int) (Valor / 10);
		Valor %=  10;
		
		int M05 = (int) (Valor / 5);
		Valor %= 5;
		
		int M01 = (int) (Valor / 1);
		Valor %= 1;
//		System.out.println(V);
		System.out.println("NOTAS:");
		System.out.println(N100 + " nota(s) de R$ 100.00");
		System.out.println(N50 + " nota(s) de R$ 50.00");
		System.out.println(N20 + " nota(s) de R$ 20.00");
		System.out.println(N10 + " nota(s) de R$ 10.00");
		System.out.println(N5 + " nota(s) de R$ 5.00");
		System.out.println(N2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(M100 + " moeda(s) de R$ 1.00");
		System.out.println(M50 + " moeda(s) de R$ 0.50");
		System.out.println(M25 + " moeda(s) de R$ 0.25");
		System.out.println(M10 + " moeda(s) de R$ 0.10");
		System.out.println(M05 + " moeda(s) de R$ 0.05");
		System.out.println(M01 + " moeda(s) de R$ 0.01");
	}
}