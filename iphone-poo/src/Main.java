import br.com.dio.iphone.iPhone;

public class Main {
    public static void main(String[] args){

        iPhone iphone = new iPhone();

        iphone.tocar();
        iphone.selecionarMusica("Imagine - Jhon");
        iphone.pausar();
        
        iphone.ligar("11 9959 455");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();


    }
}

/* Tocando música...
Música selecionada: Imagine - Jhon
Música pausada.
Ligando para: 11 9959 455
Chamada atendida.
Correio de voz iniciado.
Exibindo página: https://www.dio.me
Nova aba adicionada.
Página atualizada. */