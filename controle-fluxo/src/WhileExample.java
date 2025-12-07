import java.util.Scanner;
import java.util.ArrayList;

public class WhileExample {

public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

    System.out.println("=== Exemplo de WHIKE em Java ===\n");

            // 1) WHILE simples: contador regressivo
System.out.println("-- Contador regressivo (while) --");
int contador = 5;
while (contador > 0) {
    System.out.println("Cotador = " + contador);
    contador--; // decrementa: evita loop infinito
}
System.out.println("Fim do contrador!\n");

        // 2) WHILE com validação de entrada (padrão seguro para ler números)
System.out.println("-- Leitura segura de idade (while + try/catch)");
int idade = 0;
boolean idadeValida = false;
while (!idadeValida) {
try {
System.out.println("Digite sua idade (apenas número)");
String linha = scanner.nextLine();           // lemos a linha inteira
  idade = Integer.parseInt(linha.trim());    // tentamos converter
if (idade < 0) {
    System.out.println("Idade não pode ser negativa.");
} else {
    idadeValida = true;                      // entrada válida -> sai do loop
}

} catch (NumberFormatException e) {
    System.out.println("⚠ Idade inválida! Digite apenas números.");
}
}
System.out.println("Idade resgistrada: " + idade + "\n");

// 3) WHILE como "sentinel loop" (leitura até condição de parada)

System.out.println("-- Cadastro de nomes(digite 'sair' para terminar)--");
ArrayList<String> nomes = new ArrayList<>();
while (true) {
    System.out.println("Digite um nome (ou 'sair'): ");
    String nome = scanner.nextLine().trim();
    if (nome.equalsIgnoreCase("sair")) {
        break;  // quebra o loop quando usuário digita 'sair'
    }

    if (nome.isEmpty()) {
        System.out.println("Nome vazio - tente novamente.");
        continue;  // volta para o início do loop, ignorando o push abaixo
    }
    nomes.add(nome);
    System.out.println("'" + nome + "' adicionado.");
}

System.out.println("Total de nomes cadastrados: " + nomes.size() + "\n");

        // 4) WHILE com condição dependente de variável alterada no corpo
System.out.println("-- Exemplo: somar até atingir um limite --");
int soma = 0;
while (soma < 20) {  // condição checada antes de cada iteração
int resto = 3;       // exemplo: valor fixo adicionado

soma += resto;
System.out.println("Adicionar " + resto + ", soma = " + soma);
            // se não mudarmos 'soma' o loop seria infinito; sempre garanta progressão
}
System.out.println("Soma final: " + soma + "\n");

        // 5) Saída formatada do que foi cadastrado
System.out.println("--- Resumo ---");
System.out.println("idade" + idade);
System.out.println("Nomes Cadastrados");
for (String n : nomes) {
    System.out.println(" - " + n);
}

scanner.close();


}
}

/* -- Exemplo: somar até atingir um limite --
Adicionar 3, soma = 3
Adicionar 3, soma = 6
Adicionar 3, soma = 9
Adicionar 3, soma = 12
Adicionar 3, soma = 15
Adicionar 3, soma = 18
Adicionar 3, soma = 21
Soma final: 21

--- Resumo ---
idade20
Nomes Cadastrados
 - Pedro
 - Luiz
 - Roger */




