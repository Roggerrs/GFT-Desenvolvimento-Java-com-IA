import java.util.ArrayList;
import java.util.Scanner;

public class CondicionalTernariaExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // cria o Scanner para ler teclado

        System.out.println("=== Exemplo de Condicional Ternária ===");

        // Nome (texto)

        System.out.print("Digite seu nome: "); 
        String nome = scanner.nextLine(); // lê uma linha de texto

        // Validação de idade (substituir nextInt por nextLine + parseInt)

        int idade = 0;
        boolean idadeValida = false;
        while (!idadeValida) {
            try {
                System.out.print("Digite sua idade: ");
                idade = Integer.parseInt(scanner.nextLine()); // segura o ENTER também
                if (idade < 0) {
                    System.out.println(" ⚠ Idade não pode ser negativa!");
                } else {
                    idadeValida = true;
                } 
            } catch (NumberFormatException e) {
                System.out.println(" ⚠ Idade inválida! Digite apenas números.");
            }
        }

        // Validação de salário (double)
        double salario = 0.0;
        boolean salarioValido = false;
        while (!salarioValido) {
            try {
                System.out.print("Digite seu salário (use . como separador): ");
                salario = Double.parseDouble(scanner.nextLine()); // lê e converte
                if (salario < 0) {
                    System.out.println(" ⚠ Salário não pode ser negativo.");
                } else {
                    salarioValido = true;
                } 
            } catch (NumberFormatException e) {
                System.out.println("Salário  inválido! Digite um número (ex: 1500.50)");
            }
        }
        // Vetor (array) e listagem
        String [] cargos = {"Estagiário", "Júnior", "Pleno", "Sênior"}; 
        System.out.println("\nCargos possíveis:");
        for(int i = 0; i < cargos.length; i++) {
            System.out.println(" " + i + " - " + cargos[i]);
        }

        // --- Exemplo de uso da condicional ternária ---
        // 1) Ternária simples para texto de categoria por idade

        String faixaIdade = (idade < 18) ? "Menor" : (idade <= 40 ? "Adulto" : "Sênior");
        // equivalente a:
        // if (idade < 18) faixaIdade = "Menor";
        // else if (idade <= 40) faixaIdade = "Adulto";
        // else faixaIdade = "Sênior por idade";

        // 2) Ternária para decidir se recebe benefício (exemplo)
        // recebeBeneficio = true se salario < 2500 ou idade >= 60
        boolean recebeBeneficio = (salario < 2500.0 || idade >= 60) ? true : false;
        // OBS: poderia ser apenas: boolean recebeBeneficio = (salario < 2500.0 || idade >= 60);
        // 3) Escolha de cargo com condicional composta (if/else) - mais legível para várias condições

        String cargoRecomendado;
        if (idade <18) {
            cargoRecomendado = "Não elegível";
        } else if (salario < 1500) {
            cargoRecomendado = cargos[0];
        } else if (salario < 3500) {
            cargoRecomendado = cargos[1];
        }  else if (salario < 8000) {
            cargoRecomendado = cargos[2];
        } else {
            cargoRecomendado = cargos[3];
        }

        // --- Estrutura de dados (ArrayList) para guardar resumo ---
        ArrayList<String> resumo = new ArrayList<>();
        resumo.add("Nome: " + nome);
        resumo.add("Idade: " + idade + " (" + faixaIdade +")");
        resumo.add(String.format("Salário: R$ %.2f", salario));
        resumo.add("Cargo recomendado:" + cargoRecomendado);
        resumo.add("Recebe benefício?" + (recebeBeneficio ? "Sim" : "Não"));

        // Imprime resumo
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
Recebe benefício? Sim
 */

/* Digite seu nome: Roger
Digite sua idade: 60
Digite seu salário (use . como separador):
8000

Cargos possíveis:
 0 - Estagiário
 1 - Júnior
 2 - Pleno
 3 - Sênior

--- Resumo do Cadastro ---
Nome: Roger
Idade: 60
Salário: R$ 8000,00
Cargo recomendado:Sênior
Recebe benefício? Sim */
