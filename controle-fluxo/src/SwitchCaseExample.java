import java.util.Scanner;
import java.util.ArrayList;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // cria o Scanner para ler teclado

        System.out.println("=== Exemplo de Switch / Case (com validade e extras) ===");

        // Entrada: nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // lê uma linha de texto

        // Leitura segura da idade (validação em loop)
        int idade = lerInteiroValido(scanner, "Digite sua idade: ");

        // Leitura segura do salário (validação em loop) double
        double salario = lerDoubleValido(scanner, "Digite seu salário (use . como separador): ");

        // Vetor (array) com cargos
        String[] cargos = {"Estagiário", "Júnior", "Pleno", "Sênior"};

        // Mostrar opções (estrutura de repetição)
        System.out.println("\nCargos possíveis:");
        for (int i = 0; i < cargos.length; i++) {
            System.out.println(" " + i + " - " + cargos[i]);
        }

        // Pedir ao usuário para escolher o índice do cargo
        int escolhaCargo = lerInteiroValido(scanner, "\nEscolha o índice do cargo (0-" + (cargos.length-1) + "): ");

        // Usando switch/case para validar a escolha e definir uma mensagem
        String cargoEscolhido;
        switch (escolhaCargo) {
            case 0:
                cargoEscolhido = cargos[0]; // Estagiário
                break;
                
            case 1:
                cargoEscolhido = cargos[1]; // Júnior
                break;

            case 2:
                cargoEscolhido = cargos[2]; // Pleno
                break;

            case 3:
                cargoEscolhido = cargos[3]; // Sênior
                break;

            default:
                // caso o usuário digite um índice fora de intervalo, usamos fallback
                cargoEscolhido = "Cargo inválido(usando recomendação automática)";
                break;
        }

        // Exemplo de switch com String (versão alternativa): classificação por faixa salarial
        String faixaSalarial;
        if (salario < 2000.0) {
            faixaSalarial = "baixo";
        } else if (salario < 5000.0) {
            faixaSalarial = "médio";
        } else {
            faixaSalarial = "alto";
        }

        // switch com String (encadeado) — demonstração de uso com Strings
        String recomendacaoExperiencia;
        switch (faixaSalarial) {
            case "baixo":
                recomendacaoExperiencia = "Início de carreira (focar em aprendizado)";
                break;
            case "médio":
                recomendacaoExperiencia = "Desenvolvedor com experiência";
                break;
            case "alto":
                recomendacaoExperiencia = "Sênior / Líder técnico";
                break;
            default:
                recomendacaoExperiencia = "Sem recomendação";
                break;
        }

        // Operador ternário para determinar benefício (apenas como extra)
        boolean temBeneficio = salario < 2500 || idade >= 60;
        String textoBeneficio = temBeneficio ? "Sim" : "Não";

        // Estrutura de dados (ArrayList) para montar o resumo
        ArrayList<String> resumo = new ArrayList<>();
        resumo.add("Nome: " + nome);
        resumo.add("Idade: " + idade);
        resumo.add(String.format("Salário: R$ %.2f", salario));
        resumo.add("Cargo escolhido: " + cargoEscolhido);
        resumo.add("Faixa salarial: " + faixaSalarial);
        resumo.add("Recomendação: " + recomendacaoExperiencia);
        resumo.add("Recebe benefícios? " + textoBeneficio);

        // Imprime o resumo
        System.out.println("\n--- Resumo do Cadastro ---");
        for(String linha : resumo) {
            System.out.println(linha);
        }

        scanner.close(); // fecha o scanner
    }

    // ---------- Métodos auxiliares para validação de entrada ----------
    // Lê um inteiro válido (loop até o usuário digitar número)
    public static int lerInteiroValido(Scanner scanner, String prompt) {
        int valor = 0;
        boolean valido = false; 
        while (!valido) {
            System.out.print(prompt);
            String linha = scanner.nextLine();
            try {
                valor = Integer.parseInt(linha.trim());
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("⚠ Idade inválida! Digite apenas números inteiros.");
            }
        }
        return valor;
    }

// Lê um double válido (loop até o usuário digitar número)
public static double lerDoubleValido(Scanner scanner, String prompt) {
    double valor = 0.0;
    boolean valido = false;
    while (!valido) {
        System.out.print(prompt);
        String linha = scanner.nextLine();
        try {
                            // substitui vírgula por ponto caso o usuário use vírgula
    linha = linha.trim().replace(",", "."); 
    valor = Double.parseDouble(linha);
    valido = true;
        } catch (NumberFormatException e) {
            System.out.println("⚠ Salário inválido! Digite um número válido (ex: 2000.0)");
        }
        }
        return valor;
    }

    /*
    Exemplo de saída 1:
    Digite seu nome: Roger
    Digite sua idade: 25
    Digite seu salário (use . como separador): 3000

    Cargos possíveis:
     0 - Estagiário
     1 - Júnior
     2 - Pleno
     3 - Sênior

    --- Resumo do Cadastro ---
    Nome: Roger
    Idade: 25
    Salário: R$ 3000,00
    Cargo escolhido: Pleno
    Faixa salarial: médio
    Recomendação: Desenvolvedor com experiência
    Recebe benefícios? Não

    Exemplo de saída 2:
    Digite seu nome: rOGER
    Digite sua idade: 12
    Digite seu salário (use . como separador): 1200

    Cargos possíveis:
     0 - Estagiário
     1 - Júnior
     2 - Pleno
     3 - Sênior

    --- Resumo do Cadastro ---
    Nome: rOGER
    Idade: 12
    Salário: R$ 1200,00
    Cargo escolhido: Estagiário
    Faixa salarial: baixo
    Recomendação: Início de carreira (focar em aprendizado)
    Recebe benefícios? Sim
    */
}