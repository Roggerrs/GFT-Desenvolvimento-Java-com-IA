import java.util.ArrayList;
import java.util.Scanner;

public class CondicionalEncadeadaExample {

public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in); // cria o Scanner para ler teclado)

// Entrada / primitivos
System.out.print("Digite seu nome: ");
String nome = scanner.nextLine(); // lê uma linha de texto

int idade = 0;
boolean idadeValida = false;

while (!idadeValida) {
    try {
        System.out.print("Digite sua idade: ");
        idade = Integer.parseInt(scanner.nextLine()); // lê como texto e converte
        idadeValida = true; // deu certo
    } catch (NumberFormatException e) {
        System.out.println("⚠ Idade inválida! Digite apenas números.");
    }
}


System.out.println("Digite seu salário (use . como separador): ");
double salario = scanner.nextDouble(); // double (primitivo)

scanner.nextLine(); // limpar linha pendente

// Vetor (array) e estrutura de repetição
String[] cargos = {"Estagiário", "Júnior", "Pleno", "Sênior"};

// Exibindo as opções com repetição (for)
System.out.println("\nCargos possíveis:");
for (int i = 0; i < cargos.length; i++) {
    System.out.println(" " + i + " - " + cargos[i]);
}

// Condicional encadeada (if dentro de if) + encadeamento else-if
// Vamos avaliar elegibilidade e categoria com lógica encadeada

String resultado;
if(idade < 18) {
 // primeiro nível da cadeia: menor de idade -> não elegível
resultado = "Menor de idade (não elegível)";
} else { 
 // segundo nível: já é adulto, agora podemos fazer decisões adicionais
if (idade >= 18 && idade <= 25) {
// dentro deste bloco podemos ter outra cadeia de if/else para salário
if(salario < 1500.0) {
    resultado = cargos[0]; // Estagiário
} else if (salario < 3000.0) {
    resultado = cargos[1]; // Júnior
} else {
    resultado = cargos[2]; // Pleno (jovem com salário maior)
}
} else if (idade > 25 && idade <= 40) {
    // outra parte do encadeamento: adultos entre 26 e 40
if (salario < 3000.0) {
    resultado = cargos[1]; // Júnior
} else if (salario < 7000.0) {
    resultado = cargos[2]; // Pleno
} else {
    resultado = cargos[3]; // Sênior
}
}else{ 
    // 41+ anos
 // exemplo de combinação com operador lógico OU (||)
if (salario >= 5000.0 || idade >= 50) {
    resultado = cargos[3]; // Sênior (ou condição da experiência)
} else {
    resultado = cargos[2]; // Pleno
}
}
}

        // Verificação de benefício com operador lógico NOT (!) e OR (||)
boolean recebeBeneficio;
 // Exemplo: recebe benefício se salario < 2500 OU (idade >= 60), mas NÃO se salario for negativo (inválido)
if(!(salario <0)&& (salario < 2500.0 || idade >= 60)) {
    recebeBeneficio = true;
} else {
    recebeBeneficio =  false;

}

        // Estrutura de dados avançada (ArrayList) para guardar o resumo
ArrayList<String> resumo = new ArrayList<>();
resumo.add("Nome: " + nome);
resumo.add("Idade: " + idade);
resumo.add(String.format("Salário: R$ %.2f", salario)); // formatação seguro
resumo.add("Cargo recomendado:" + resultado);
resumo.add("Recebe benefício? " + (recebeBeneficio ? "Sim" : "Não"));

        // Imprime o resumo (for-each)
System.out.println("\n--- Resumo do Cadastro ---");
for (String linha : resumo) {
    System.out.println(linha);

}

scanner.close(); // fecha o scanner
}
}




/* Digite seu nome: Roger
Digite sua idade: 17
Digite seu salário (use . como separador):
1500

Cargos possíveis:
 0 - Estagiário
 1 - Júnior
 2 - Pleno
 3 - Sênior

--- Resumo do Cadastro ---
Nome: Roger
Idade: 17
Salário: R$ 1500,00
Cargo recomendado:Menor de idade (não elegível)
Recebe benefício? Sim */

// --------------------------------------------------

/* Digite seu nome: Roger
Digite sua idade: 19
Digite seu salário (use . como separador):
3000

Cargos possíveis:
 0 - Estagiário
 1 - Júnior
 2 - Pleno
 3 - Sênior

--- Resumo do Cadastro ---
Nome: Roger
Idade: 19
Salário: R$ 3000,00
Cargo recomendado:Pleno
Recebe benefício? Não */

// --------------------------------------------------


/* Digite seu nome: Roger
Digite sua idade: 66
Digite seu salário (use . como separador):
9000

Cargos possíveis:
 0 - Estagiário
 1 - Júnior
 2 - Pleno
 3 - Sênior

--- Resumo do Cadastro ---
Nome: Roger
Idade: 66
Salário: R$ 9000,00
Cargo recomendado:Sênior 
Recebe benefício? Sim */

// --------------------------------------------------

