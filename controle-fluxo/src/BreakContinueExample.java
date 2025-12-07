
public class BreakContinueExample {
public static void main(String[] args) {
    
            int[] numeros = {2, 4, 6, 9, 12, 15, 18};

           // Objetivo: procurar o primeiro número ímpar e parar (break)
System.out.println("Procurando  primeiro número ímpar (usa break");
for (int n : numeros) {
    if (n % 2 != 0) { // n é ímpar
        System.out.println("Primeiro ímpar encontrado: " + n);
        break; // sai imediatamente do loop for 
    }
    System.out.println("\nSomando apenas números <= 10 (usa continue)");
}
        // Exemplo com continue: pular números maiores que 10 e somar o resto
System.out.println("\nSomando apenas números <= 10 (usa continue):");
int soma = 0;
for (int n : numeros) {
    if (n > 10) {
                // pula a iteração atual — nada abaixo desta linha no bloco será executado
continue;

    }
    soma += n;  // só chega aqui quando n <= 10
System.out.println("adicionado " + n + ", soma agora = " + soma);

}
System.out.println("Soma final (<=10)= " + soma);
     

// Atenção: usar break/continue com cuidado — pode dificultar leitura se exagerar.



}
}

/* Procurando  primeiro número ímpar (usa break

Somando apenas números <= 10 (usa continue)

Somando apenas números <= 10 (usa continue)

Somando apenas números <= 10 (usa continue)
Primeiro ímpar encontrado: 9

Somando apenas números <= 10 (usa continue):
adicionado 2, soma agora = 2
adicionado 4, soma agora = 6
adicionado 6, soma agora = 12
adicionado 9, soma agora = 21
Soma final (<=10)= 21 */