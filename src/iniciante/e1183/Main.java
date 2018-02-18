package iniciante.e1183;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String O;
		int matriz = 12;
		double[][] x = new double[matriz][matriz];
		double soma = 0;
		int cont = 0;

		Scanner input = new Scanner(System.in);

		O = input.nextLine();
		for (int i = 0; i < matriz; i++) {
			for (int j = 0; j < matriz; j++) {
				x[i][j] = Double.parseDouble(input.nextLine());
				if (j > i)
					soma += x[i][j];
			}
		}
		if (O.equalsIgnoreCase("S")) {
			System.out.println(soma);
		} else if(O.equalsIgnoreCase("M")){
			System.out.printf("%.1f\n", (soma / 66));
		}
	}
}