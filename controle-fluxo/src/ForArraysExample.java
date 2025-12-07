import java.util.Arrays;
import java.util.Scanner;

public class ForArraysExample {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

            // 1) Array fixo de inteiros (inicialização literal)

            int[] numeros = {5, 3, 8, 1, 4};
            System.out.println("Array inicial:" + Arrays.toString(numeros));

                    // 2) For tradicional: percorre por índice (útil quando precisa do índice)
            System.out.println("\nFor tradicional (índices):");
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("índice " + i + " -> valor " + numeros[i]);
            }

            // 3) For-each (enhanced for): percorre valores, mais simples quando não precisa do índice
            System.out.println("\nFor-each (valores):");
            for (int valor : numeros) {
                System.out.println("valor = " + valor);
            }

            // 4) Operações comuns: soma, média, máximo e mínimo usando for tradicional
     
            int soma = 0; 
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numeros.length; i++) {
            int v = numeros[i];
          soma += v;  
          if (v > max) max = v;  
          if (v < min) min = v;      
        }

        double media = (double) soma / numeros.length;
        System.out.println("\nSoma: " + soma + ", Média = " + media); 
        System.out.println("Máximo: " + max + ", Mínimo = " + min); 
        
                // 5) Imprimir o array em ordem reversa

        System.out.println("\nArray em ordem reversa:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i] + (i == 0 ? "\n" : ", "));
        }
        
                // 6) Usando java.util.Arrays: sort, toString, copyOf, equals
int[] copia = Arrays.copyOf(numeros, numeros.length); // cópia
Arrays.sort(copia); // ordena a cópia (não altera 'numeros')
System.out.println("\nArray copiado e ordenado:" + Arrays.toString(copia));
System.out.println("O array original permance: " + Arrays.toString(numeros));
System.out.println("Arrays.equals(original, copia) ? " + Arrays.equals(numeros, copia));
        
        // 7) Exemplo com Strings e for-each
        String[] nomes = {"Ana", "Bruno", "Carlos", "Diego"};
        System.out.println("\nNomes (for-each):");
    for (String nome : nomes) {
        System.out.println("Nome: " + nome);
    }
    
    // 8) Criando um array dinamicamente a partir da entrada do usuário
    System.out.println("\nQuantos números você quer informar?");
    int n = Integer.parseInt(scanner.nextLine());
    int[] entrada = new int[n];
    for(int i = 0; i < n; i++) {
        System.out.println("Digite o número " + i + ":");
      entrada[i] = Integer.parseInt(scanner.nextLine());
    }
System.out.println("Você digitou: " + Arrays.toString(entrada));

        // 9) Array 2D (matriz) e for aninhado
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
};

System.out.println("\nMatriz (2x3):");
for (int i = 0; i < matriz.length; i++) { // percorre linhas
    for (int j = 0; j < matriz[i].length; j++) { // percorre colunas da linha i
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}

System.out.println(); // quebra de linha após cada linha da matriz

        //; 10) Exemplo prático pequeno: calcular soma de cada linha da matriz
 
        System.out.println("\nSomar por linha da matriz");
        for (int i = 0; i < matriz.length; i++) {
            int somaLinha = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Soma linha " + i + ": " + somaLinha);
        }

        scanner.close();
    }
}

/* Array inicial:[5, 3, 8, 1, 4]

For tradicional (índices):
índice 0 -> valor 5
índice 1 -> valor 3
índice 2 -> valor 8
índice 3 -> valor 1
índice 4 -> valor 4

For-each (valores):
valor = 5
valor = 3
valor = 8
valor = 1
valor = 4

Soma: 21, Média = 4.2
Máximo: 8, Mínimo = 1

Array em ordem reversa:
4,
1,
8,
3,
5


Array copiado e ordenado:[1, 3, 4, 5, 8]
O array original permance: [5, 3, 8, 1, 4]
Arrays.equals(original, copia) ? false

Nomes (for-each):
Nome: Ana
Nome: Bruno
Nome: Carlos
Nome: Diego

Quantos números você quer informar?
3
Digite o número 0:
20
Digite o número 1:
30
Digite o número 2:
40
Você digitou: [20, 30, 40]

Matriz (2x3):
1 2 3
4 5 6


Somar por linha da matriz
Soma linha 0: 6
Soma linha 1: 15 */