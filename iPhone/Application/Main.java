package Application;

import Funcionalidades.AparelhoTelefonico;
import Funcionalidades.NavegadorInternet;
import Funcionalidades.ReprodutorMusical;
import Multifuncoes.iPhone;

public class Main {

	public static void main(String[] args) {
		iPhone i = new iPhone();
		ReprodutorMusical rm = i;
		AparelhoTelefonico at = i;
		NavegadorInternet ni = i;
		
		rm.tocar();
		rm.pausar();
		rm.selecionarMusica(null);
		
		System.out.println();
		
		at.ligar(null);
		at.atender();
		at.iniciarCorreioVoz();
		
		System.out.println();
		
		ni.exibirPagina(null);
		ni.atualizarPagina();
		ni.adicionarNovaAba();
		
		
		
	}

}
