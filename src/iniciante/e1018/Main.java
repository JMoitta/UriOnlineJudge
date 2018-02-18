package iniciante.e1018;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner can = new Scanner(System.in);
		
		int V = can.nextInt(), VT = V;
		
		int qtd100 = V / 100;
		V = V % 100;
		
		int qtd50 = V / 50;
		V = V % 50;
		
		int qtd20 = V / 20;
		V = V % 20;
		
		int qtd10 = V / 10;
		V %= 10;
		
		int qtd5 = V / 5;
		V %= 5;
		
		int qtd2 = V / 2;
		V %= 2;
		
		int qtd1 = V / 1;
		V %= 1;
		System.out.println(VT);
		System.out.println(qtd100 + " nota(s) de R$ 100,00");
		System.out.println(qtd50 + " nota(s) de R$ 50,00");
		System.out.println(qtd20 + " nota(s) de R$ 20,00");
		System.out.println(qtd10 + " nota(s) de R$ 10,00");
		System.out.println(qtd5 + " nota(s) de R$ 5,00");
		System.out.println(qtd2 + " nota(s) de R$ 2,00");
		System.out.println(qtd1 + " nota(s) de R$ 1,00");
	}
}