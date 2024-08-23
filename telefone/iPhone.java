package telefone;

import src.aparelhoTelefonico;
import src.navegadorWeb;
import src.reprodutorMusical;

public class iPhone implements aparelhoTelefonico, navegadorWeb, reprodutorMusical {


	public void tocarMusica() {
		System.out.println("Reproduzindo musica.");
		
	}

	
	public void pausar() {
		System.out.println("Pausando reprodução.");
		
	}

	
	public void selecionarMusica() {
		System.out.println("Selecionando a faixa.");
		
	}

	
	public void exibirPagina(String url) {
		System.out.println("Exibindo pagina web.");
		
	}

	
	public void abrirNovaAba(String url) {
		System.out.println("Abrir nova aba.");
		
	}

	
	public void atualizarPagina(String url) {
		System.out.println("Atualizando página web.");
		
	}

	public void ligar() {
		System.out.println("Realizando chamada telefônica.");
		
	}

	
	public void atender() {
		System.out.println("Atendendo chamada telefônica.");
		
	}

	
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz.");
		
	}

}
