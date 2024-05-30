package Multifuncoes;

import Funcionalidades.AparelhoTelefonico;
import Funcionalidades.NavegadorInternet;
import Funcionalidades.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

	@Override
	public void tocar() {
		System.out.println("TOCAR MUSICA");
	}

	@Override
	public void pausar() {
		System.out.println("PAUSE MUSICA");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONAR MUSICA");
	}

	@Override
	public void ligar(String numero) {
		System.out.println("LIGAR");
	}

	@Override
	public void atender() {
		System.out.println("ATENDER");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("CORREIO DE VOZ");
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("EXIBIR PAGINA");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("ADICIONAR NOVA ABA");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("ATUALIZAR PAGINA");
	}

}
