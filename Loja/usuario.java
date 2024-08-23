package Loja;

import telefone.iPhone;

public class usuario {

	public static void main(String[] args) {
		
		iPhone celular = new iPhone();
		
		celular.ligar();
		celular.atender();
		celular.iniciarCorreioVoz();
		celular.tocarMusica();
		celular.pausar();
		celular.selecionarMusica();
		celular.exibirPagina(null);
		celular.abrirNovaAba(null);
		celular.atualizarPagina(null);

	}

}
