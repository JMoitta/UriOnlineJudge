package iniciante.e1116;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // Declaracao de variaveis.
        Scanner scan = new Scanner(System.in);
        String[] entrada;
        String saida = new String();
        int N, X, Y;

        // Entrada: Leitura de um número inteiro N.
        N = Integer.parseInt(scan.nextLine());
        
        // Processamento: Laco de repeticao de 0 ate menor que N
        for(int i = 0; i < N; i++) {
            
            // Entrada: Leitura de valores inteiros (X e Y).
            entrada = scan.nextLine().split(" ");
            
            // Processamento: Atribui valores a variavel X e Y.
            X = Integer.parseInt(entrada[0]);
            Y = Integer.parseInt(entrada[1]);
            
            // Processamento: Testa se Y e igual a zero.
            if( Y == 0){
                
                // Processamento: Testa se X e igual a zero.
                if( X == 0){
                    
                    // Processamento: Adiciona a 'saida' o resultado de X / Y.
                    saida += String.format("%.1f\n", ((double) X) / Y);
                    
                    // Processamento: Testa se X e diferente de zero.
                } else {
                    
                    // Processamento: Adiciona a 'saida' o resultado 'divisao impossivel'
                    saida += "divisao impossivel\n";
                }
                
                // Processamento: Testa se Y e diferente de 0.
            } else {
                
                // Processamento: Adiciona a 'saida' o resultado de X / Y.
                saida += String.format("%.1f\n", ((double) X) / Y);
            }
        }
        
        System.out.print(saida);
    }
}
