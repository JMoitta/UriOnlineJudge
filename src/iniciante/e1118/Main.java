package iniciante.e1118;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    private static double leituraDeDouble() {
        return Double.parseDouble(scan.nextLine());
    }
    private static int leituraDeInt() {
        return Integer.parseInt(scan.nextLine());
    }


    private static int leituraDeX() {
        int r;
        r = leituraDeInt();
        if (r < 0 || r > 10) {
            System.out.println("nota invalida");
            r = leituraDeX();
        }
        return r;
    }
    private static double obterNotaValida() {
        double r;
        r = leituraDeDouble();
        if (r < 1 || r > 2) {
            System.out.println("nota invalida");
            r = obterNotaValida();
        }
        return r;
    }

    private static void novoCalculo() {
        // Declaracao de variaveis.
        double N1 = -1, N2 = -1, Aux;

        // Entrada: Leitura do uma nota valor real e valida em 'N1'
        N1 = obterNotaValida();

        // Entrada: Leitura do uma nota valor real e valida em 'N1'
        N2 = obterNotaValida();
        System.out.printf("media = %.2f", ((N1 + N2) /2));
        System.out.println("novo calculo (1-sim 2-nao)");
        
        if(1 == leituraDeX()){
            novoCalculo();
        }
    }

    public static void main(String[] args) {

        // Declaracao de variaveis.
        double N1 = -1, N2 = -1, Aux;

        // Entrada: Leitura do uma nota valor real e valida em 'N1'
        N1 = obterNotaValida();

        // Entrada: Leitura do uma nota valor real e valida em 'N1'
        N2 = obterNotaValida();

        System.out.printf("media = %.2f\n", ((N1 + N2) / 2));
    }
}
