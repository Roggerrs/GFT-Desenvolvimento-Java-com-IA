import java.util.Scanner;

public class PontoEletronico {
    public static void main(String[] args) throws Exception {
        
Scanner scanner = new Scanner(System.in);

System.out.println("=== Cadastro Simples (Ponto Eletrônico) ===");

System.out.println("Digite seu nome: ");
String nome = scanner.nextLine();

System.out.println("Digite sua idade?: ");
int idade = scanner.nextInt();

scanner.nextLine(); // limpar linha pendente

System.out.println("Digite seu salário (use . com separador): ");
double salario = scanner.nextInt();

scanner.nextLine(); // Limpar linha pendente

String[] cargos = {"Estagiário", "Júnior", "Pleno", "Sênior"};

String categoria;
if (idade < 18) {
    categoria = "Menor de idade";
} else {
    categoria = "Adulto";
}

boolean temBeneficio = false;
if (salario < 2500.0) {
    } else {
        temBeneficio = false;
    }

    String cargoAtribuido;
    if (salario < 1500) {
        cargoAtribuido = cargos[0];
    } else if  (salario < 4000) {
        cargoAtribuido = cargos[1];
    } else if (salario < 8000) {
        cargoAtribuido = cargos[2];
    } else {
 cargoAtribuido = cargos[3];
    }    

    System.out.println("\nCargos disponíveis:");
    for (int i = 0; i < cargos.length; i++) {
        System.out.println(" - " + cargos[i]);

    }
System.out.println("\n--- Resumo do Cadastro ---");
System.out.println("Nome: " + nome);
System.out.println("Idade: " + idade + " (" + categoria + ") "); 
System.out.printf("Salário: R$ %.2f%n", salario); 
System.out.println("Cargo atribuído: " + cargoAtribuido);
System.out.println("Recebe benefício? " + (temBeneficio ? "Sim" : "Não"));

scanner.close();
    }
}


/* 'PontoEletronico'
=== Cadastro Simples (Ponto Eletrônico) ===
Digite seu nome:
Roger
Digite sua idade?:
17
Digite seu salário (use . com separador):
1.000

Cargos disponíveis:
    - Estagiário
    - Júnior
    - Pleno
    - Sênior

    --- Resumo do Cadastro ---
    Nome: Roger
    Idade: 17 (Menor de idade)
    Salário: R$ 1000,00
    Cargo atribuído: Estagiário
    Recebe benefício? Não */


/*     === Cadastro Simples (Ponto Eletrônico) ===
Digite seu nome:
Roger
Digite sua idade?:
20
Digite seu salário (use . com separador):
6.000

Cargos disponíveis:
 - Estagiário
 - Júnior
 - Pleno
 - Sênior

--- Resumo do Cadastro ---
Nome: Roger
Idade: 20 (Adulto)
Salário: R$ 6000,00
Cargo atribuído: Pleno
Recebe benefício? Não */

