import java.util.Scanner;            // biblioteca para entrada do usuário
import java.util.ArrayList;         // biblioteca para usar listas dinâmicas

public class CondicionalCompostaExample {

// Método principal - ponto de entrada
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in); // cria o Scanner para ler teclado

   System.out.println("=== Exemplo de Condicional Composta (if / else if / else) ===");

   // --- Entrada / Primitivos / Operadores ---
   System.out.print("Digite seu nome:");
   String nome = scanner.nextLine(); // lê uma linha de texto

   System.out.print("Digite sua idade: ");
   int idade = scanner.nextInt(); // lê um número inteiro (primitivo int)

   scanner.nextLine(); // limpar linha pendente

System.out.print("Digite seu salário (use . como separador): ");
double salario = scanner.nextDouble(); // double (primitivo)
scanner.nextLine(); // limpar linha pendente 


// --- Vetor (array) e estrutura de repetição ---

String[] cargos = {"Estagiário", "Júnior", "Pleno", "Sênior"};
System.out.println("\nCargos possíveis: ");
for (int i = 0; i< cargos.length; i++) {
    System.out.println(" " + i + " - " + cargos[i]);

}

// --- Função/ Método: avalia e retorna o cargo recomendado ---
String cargoRecomendado = avaliarCargo(idade, salario, cargos);   // método abaixo
boolean recebeBeneficio = verificaBeneficio(salario);  // método com condicional simples


// --- Estrutura de dados avançada (ArrayList) para historico simples ---
ArrayList<String> historico = new ArrayList<>(); 
historico.add("Nome: " + nome);
historico.add("Idade: " + idade);
historico.add(String.format("Salário: R$ %.2f", salario)); 
historico.add("Cargo recomendado: " + cargoRecomendado); 
historico.add("Recebe benefício? " + (recebeBeneficio ? "Sim" : "Não"));

// --- Saída formatada ---
System.out.println("\n--- Resumo do Cadastro ---");  
for (String linha : historico) {
    System.out.println(linha); 
}

scanner.close(); // fecha o scanner

}

/**
     * Avalia e retorna um cargo com base em uma condicional composta.
     * Aqui usamos operadores lógicos (&&, ||) e comparadores (<, >=).
     */

public static String avaliarCargo(int idade, double salario, String[] cargos) {
// Exemplo de condicional composta:
        // - se menor de 18 -> não pode ser contratado (menor de idade)
        // - se idade entre 18 e 21 e salario < 2000 -> Estagiário
        // - se salario entre 2000 e 4000 -> Junior
        // - se salario entre 4000 e 8000 -> Pleno
        // - se salario >= 8000 -> Senior
        // Usamos combinações com && (E) e || (OU) para definir regras.


if(idade <18) {
    return "Menor de idade (não elegível)";
} else if (idade >= 18 && idade <= 21 && salario < 2000.0) {
    // condicional composta: idade dentro do intervalo E salário menor que 2000
    return cargos[0]; // Estagiário 
} else if (salario >= 2000.0 && salario < 4000.0) {
    return cargos[1]; // Júnior
} else if (salario >= 4000.0 && salario < 8000.0) {
 return cargos[2]; // Pleno
} else {
// aqui cobre salario >= 8000.0 e outros casos
return cargos[3]; // Senior
}
}

/**
     * Verifica se o funcionário recebe benefício com base em condicional simples.
     * Retorna true se salário < 2500.0, senão false.
     */

public static boolean verificaBeneficio(double salario) {
    if (salario < 2500.0 || salario == 0.0) {
        return true; 
    } else {
        return false;
    }
}
}

/* === Exemplo de Condicional Composta (if / else if / else) ===
Digite seu nome:Roger
Digite sua idade: 18
Digite seu salário (use . como separador): 1500

Cargos possíveis:
 0 - Estagiário
 1 - Júnior
 2 - Pleno
 3 - Sênior

--- Resumo do Cadastro ---
Nome: Roger
Idade: 18
Salário: R$ 1500,00
Cargo recomendado: Estagiário
Recebe benefício? Sim */

// ------------------------------------------------------------------

/* === Exemplo de Condicional Composta (if / else if / else) ===
Digite seu nome:Roger
Digite sua idade: 18
Digite seu salário (use . como separador): 1500

Cargos possíveis:
 0 - Estagiário
 1 - Júnior
 2 - Pleno
 3 - Sênior

--- Resumo do Cadastro ---
Nome: Roger
Idade: 18
Salário: R$ 1500,00
Cargo recomendado: Estagiário
Recebe benefício? Sim */

// ------------------------------------------------------------------

/* === Exemplo de Condicional Composta (if / else if / else) ===
Digite seu nome:Roger
Digite sua idade: 18
Digite seu salário (use . como separador): 1500

Cargos possíveis:
 0 - Estagiário
 1 - Júnior
 2 - Pleno
 3 - Sênior

--- Resumo do Cadastro ---
Nome: Roger
Idade: 18
Salário: R$ 1500,00
Cargo recomendado: Estagiário
Recebe benefício? Sim */

