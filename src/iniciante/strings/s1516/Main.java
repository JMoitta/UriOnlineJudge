package iniciante.strings.s1516;

import java.util.Scanner;

public class Main {

	// Declaracao de variaveis
	private static Scanner scan = new Scanner(System.in);
	private static int D;
	private static int VF;
	private static int VG;
	private static String[] nmString;
	private static int N;
	private static int M;
	private static Character[][] imagemAntes;
	private static String[] abString;
	private static int A;
	private static int B;
	private static Character[][] imagemRedimensionada;
	
	// main(args)
	public static void main(String[] args) {
		
		// Imagem
		imagem();
	}

	private static void imagem() {
		
		while (true) {
			nmString = scan.nextLine().split(" ");
			N = Integer.parseInt(nmString[0]);
			M = Integer.parseInt(nmString[1]);
			if (N == 0 || M == 0) {
				break;
			}
			imagemAntes = new Character[N][M];
			
			for (int i = 0; i < N;i++) {
				String linhaImagem = scan.nextLine();
				for(int j = 0; j < M; j++) {
					imagemAntes[i][j] = linhaImagem.charAt(j);
				}
			}
			
			abString = scan.nextLine().split(" ");
			A = Integer.parseInt(abString[0]);
			B = Integer.parseInt(abString[1]);
			
			imprimeImagemRedimensionada();
		}
	}

	private static void imprimeImagemRedimensionada() {
		imagemRedimensionada = new Character[N][B];
		for(int i = 0; i < N; i++) {
			
			for(int loopRow = 0; loopRow < A / N;loopRow++) {
				int linha = 0;
				for(int j = 0; j < M;j++) {
					for(int k = 0; k < B / M; k++) {	
						imagemRedimensionada[i][linha] = imagemAntes[i][j];
						System.out.print(imagemRedimensionada[i][linha]);
						linha++;
					}
				}
				System.out.println();
			}
		}
		System.out.println();
	}
	
}