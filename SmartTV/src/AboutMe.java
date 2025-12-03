import java.util.Scanner;

public class AboutMe {
public static void main(String[] args) {
     
Scanner scanner = new Scanner(System.in);

//Nome
System.out.println("Digite seu nome:");
String nome = scanner.nextLine();

//Idade
System.out.println("Digite sua idade:");
int idade = scanner.nextInt();

scanner.nextLine(); // LIMPA o ENTER


//Cidade
System.out.println("Digite sua cidade:");
String cidade = scanner.nextLine();

//Pais
System.out.println("Digite seu país:");
String pais = scanner.nextLine();

//Profissão
System.out.println("Digite sua profissão?");
String profissão = scanner.nextLine();

//saída
System.out.println("\n--- INFORMAÇÕES ---");
System.out.println("Nome: " + nome);
System.out.println("Idade: " + idade);
System.out.println("Cidade: " + cidade);
System.out.println("País: " + pais);
System.out.println("Profissão: " + profissão);

scanner.close(); 


}
    

}