import java.util.Scanner; // importa a classe Scanner (não é variável nem método)

public class DoWhileExample {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("== Exemplo de do...While ==");
                System.out.println("O programa soma número digitados até você digitar 0.");

                int soma = 0; // acumulador
                int valor = -1; // guarda o número digitados pelo 
                int tentativaInvalidas = 0; 

                // O bloco do...while sempre executa ao menos uma vez.

                do {
            System.out.println("Digite um número inteiro (0 para sair): ");
            String linha = scanner.nextLine(); // lemos como String para validar

        try {
            valor = Integer.parseInt(linha.trim());  // tenta converter pra inteiro
        soma += valor;
        System.out.println("Você digitou: " + valor + " - soma atual = " + soma);

        } catch (NumberFormatException e) {
                // se o usuário digitou algo que não é número, avisamos e repetimos

        System.out.println("⚠ Entrada inválida! Digite apenas números inteiros.");
        tentativaInvalidas++;
                        // repete o loop (do...while) porque a condição será verificada no final

        }
                            // Exemplo: se quiser interromper após 3 tentativas inválidas:
        if (tentativaInvalidas >= 3) {
            System.out.println("Muitas entradas inválidas. Encerrando o programa.");
            break;  // sai do loop do...while imediatamente
        }

        } while (valor != 0);  // condição de continuação: repete enquanto o último número for diferente de 0

        System.out.println("\n--- Resultado final ---");
        System.out.println("Soma final =" + soma);
        System.out.println("Obrigado! Programa encerrado.");

        scanner.close();  // boa prática: liberar o recurso
    }

    }

/*     == Exemplo de do...While ==
O programa soma número digitados até você digitar 0.
Digite um número inteiro (0 para sair): 
10
Você digitou: 10 - soma atual = 10
Digite um número inteiro (0 para sair): 
20
Você digitou: 20 - soma atual = 30
Digite um número inteiro (0 para sair): 
30
Você digitou: 30 - soma atual = 60
Digite um número inteiro (0 para sair):
0
Você digitou: 0 - soma atual = 60

--- Resultado final ---
Soma final =60
Obrigado! Programa encerrado.

---- */

/* = Exemplo de do...While ==
O programa soma número digitados até você digitar 0.
Digite um número inteiro (0 para sair):
10
Você digitou: 10 - soma atual = 10
Digite um número inteiro (0 para sair):
20
Você digitou: 20 - soma atual = 30
Digite um número inteiro (0 para sair):
sdsa
? Entrada inválida! Digite apenas números inteiros.
Digite um número inteiro (0 para sair):
dsa
? Entrada inválida! Digite apenas números inteiros.
Digite um número inteiro (0 para sair):
dsa
? Entrada inválida! Digite apenas números inteiros.
Muitas entradas inválidas. Encerrando o programa.

--- Resultado final ---
Soma final =30
Obrigado! Programa encerrado. 

---
*/



