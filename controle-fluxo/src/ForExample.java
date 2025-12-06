import java.util.ArrayList;

public class ForExample {

public static void main(String[] args) {
    System.out.println("=== Exemplo de Laço FOR ===");

basicCountingFor();
forWithStep();
reverseFor();
iterateArray();
enhancedForExample();
nestedForExample();
forWithBreakContinue();
}

    // 1) for básico (contagem crescente)
    public static void basicCountingFor() {
    System.out.println("1) for básico (0 a 4)");
    for (int i = 0; i < 5; i++) { // inicialização; condição; incremento
        System.out.println("i = " + i);
    }

    System.out.println();
}

// 2) for com passo (incremento diferente de 1)

public static void forWithStep() {
    System.out.println("2) for com passo (0,2,4,6,8):");
    for (int i = 0; i <= 8; i += 2) { // i = i + 2 a cada iteração
        System.out.println("i = " + i);
    }

    System.out.println();
}

    // 3) for reverso
public static void reverseFor() {
    System.out.println("3) for reverso (5 a 1)");
    for (int i = 5; i >= 1; i--) { // contagem decrescente
        System.out.println("i = " + i);
}
System.out.println();
}

    // 4) iterando array com for tradicional (quando você precisa do índice)
public static void iterateArray() {
    System.out.println("4) iterando array (usando índice)" );
    String[] frutas = {"Maçã", "Banana", "Laranja", "Uva"};
    for (int i = 0; i < frutas.length; i++) {
        System.out.printf(" índice=%d -> %s%n", i, frutas[i]); // uso do índice
    }
    System.out.println();
}

// 5) enhanced for (for-each) — simples e seguro para ler
public static void enhancedForExample() {
    System.out.println("5) enhanced for (for-each) sobre array");
    String[] cores = {"Vermelho", "Verde", "Azul", "Amarelo"};
    for (String cor: cores) {
        System.out.println("cor = " + cor);
    }
System.out.println();
}
    // 6) iterando ArrayList (collection) com for tradicional e enhanced
public static void iterateArrayList() {
    System.out.println("6) iterando ArrayList:");
    ArrayList<Integer> numeros = new ArrayList<>();
    numeros.add(10);
    numeros.add(20);
    numeros.add(30);

        // usando índice (útil se precisar remover/alterar por posição)

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(" índice=" + i + " valor=" + numeros.get(i));
        }
                // usando enhanced for (mais simples para leitura)

            System.out.println("Usando enhanced for:");
            for (Integer n : numeros) {
                System.out.println(" valor=" + n);
            }
            System.out.println();
    }

    // 7) for aninhado (útil para matrizes ou complexidade combinada)
public static void nestedForExample() {
    System.out.println("7) for aninhado (2x3)");
    for (int linha = 1; linha <= 2; linha++) {
        for (int col = 1; col <3; col++) {
            System.out.printf("[%d,%d] ", linha, col);
        }
        System.out.println(); // nova linha após cada linha
    }
            // nota: aninhado frequentemente é O(n*m). cuidado com grandes dimensões.
    System.out.println();
}

    // 8) break e continue dentro do for
public static void forWithBreakContinue() {
    System.out.println("8) break e continue:");
    for (int i = 0; i < 10; i++) {
        if (i == 2) {
            System.out.println(" i==2 -> continue (pula imprimir 2)");
            continue; // pula o restante do laço quando i==2
        }

        if (i == 6) {
            System.out.println(" i==6 -> break (sai do loop)");
            break; // sai do laço quando i==6 (loop termina)
        }

      System.out.println(" i==" + i); 
    }

    System.out.println();
}
}


/* 1) for básico (0 a 4)
i = 0
i = 1
i = 2
i = 3
i = 4

2) for com passo (0,2,4,6,8):
i = 0
i = 2
i = 4
i = 6
i = 8

3) for reverso (5 a 1)
i = 5
i = 4
i = 3
i = 2
i = 1

4) iterando array (usando índice)
 índice=0 -> Maçã
 índice=1 -> Banana
 índice=2 -> Laranja
 índice=3 -> Uva

5) enhanced for (for-each) sobre array
cor = Vermelho
cor = Verde
cor = Azul
cor = Amarelo

7) for aninhado (2x3)
[1,1] [1,2]
[2,1] [2,2] 

8) break e continue:
 i==0
 i==1
 i==2 -> continue (pula imprimir 2)
 i==3
 i==4
 i==5
 i==6 -> break (sai do loop)

*/


