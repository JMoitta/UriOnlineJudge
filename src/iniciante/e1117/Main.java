package iniciante.e1117;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Declaracao de variaveis.
        Scanner scan = new Scanner(System.in);
        double N1 = -1, N2 = -1, Aux;

        // Processamento: enquanto N1 e N2 nao for do intervalo 0 ate 10
        do {

            // Entrada: Leitura do uma nota valor real em 'Aux'
            Aux = Double.parseDouble(scan.nextLine());

            // Processamento: Testa se a variavel 'Aux' esta dentro do intervalo
            // 0 ate 10
            if (Aux >= 0 && Aux <= 10) {

                // Processamento: Testa se a variavel 'N1' esta dentro do intervalo
                // 0 ate 10
                if(N1 < 0 || N1 > 10){
                    
                    // Processamento: atribui a varivel 'N1' o valor de 'Aux'
                    N1 = Aux;
                    
                    // Processamento: Testa se a variavel 'N2' esta dentro do intervalo
                    // 0 ate 10
                } else if (N2 < 0 || N2 > 10){
                    
                    // Processamento: atribui a varivel 'N2' o valor de 'Aux'
                    N2 = Aux;
                }
               
                // Processamento: Testa se a variavel 'Aux' esta fora do intervalo
            } else {
                
                // Saida: Imprime 'nota invalidade'
                System.out.println("nota invalida");
            }

            // Processamento: Testa se as variaveis 'N1' e 'N2' estao dentro do
            // intervalo 0 ate 10
        } while (N1 < 0 || N1 > 10 || N2 < 0 || N2 > 10);

        System.out.printf("media = %.2f\n", ((N1 + N2) / 2));
    }
}
