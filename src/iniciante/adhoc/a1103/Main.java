package iniciante.adhoc.a1103;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int H1;
	private static int M1;
	
	private static int H2;
	private static int M2;
	
	// main(args)
	public static void main(String[] args) {
		
		// Alarme Despertador
		alarmeDespertador();
	}

	private static void alarmeDespertador() {
		
		do {
			H1 = scan.nextInt();
			M1 = scan.nextInt();
			
			H2 = scan.nextInt();
			M2 = scan.nextInt();
			
			if (!(H1 == 0 && M1 == 0 && H2 == 0 && M2 == 0)) {
				imprimeResultado();
			} else {
				break;
			}
		} while(true);
	}

	private static void imprimeResultado() {
		int mM = 0;
		int mH = 0;
		if(H1 < H2) {
			mH = H2 - H1;
			mM = 60 - M1 + M2;
				
		} else if(H1 == H2) {
			if (M1 < M2) {
				mH = H2 - H1;
				mM = M2 - M1;
			} else if(M1 == M2) {
				mH = (H2 + 24) - H1;
				mM = 60 - M1 + M2;
			} else {
				mH = (H2 + 24) - H1;
				mM = 60 - M1 + M2;
			}
		} else {
			mH = (H2 + 24) - H1;
			mM = 60 - M1 + M2;
		}
		if(mH > 0)mH--;
		System.out.printf("%d\n",(mH * 60 + mM));
	}
	
}