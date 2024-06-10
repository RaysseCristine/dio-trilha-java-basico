package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	
	private Map<String, String> dicionario;
	
	public Dicionario() {
		this.dicionario = new HashMap<>();
	}
	
	//Adiciona uma palavra e sua defini��o ao dicion�rio, associando a palavra � sua defini��o correspondente.
	public void adicionarPalavra(String palavra, String definicao){
			dicionario.put(palavra, definicao);
	}
	
	//Remove uma palavra do dicion�rio, dado o termo a ser removido.
	public void removerPalavra(String palavra) {
		if (!dicionario.isEmpty()) {
			dicionario.remove(palavra);
		} else {
			System.out.println("O dicionario est� vazio.");
		}
	}
	
	// Exibe todas as palavras e suas defini��es do dicion�rio, mostrando cada palavra seguida de sua respectiva defini��o.
	public void exibirPalavras() {
		System.out.println(dicionario);
	}
	
	//Pesquisa uma palavra no dicion�rio e retorna sua defini��o correspondente.
	public String pesquisarPorPalavra(String palavra) {
		String pesquisa =  dicionario.get(palavra);
		if(pesquisa != null) {
			return pesquisa;	
		} 
		return "Palavra n�o encontrada no dicion�rio.";
	}

	public static void main(String[] args) {
		Dicionario dicionario = new Dicionario ();
		
		// Adicionar palavras
		dicionario.adicionarPalavra("Bolo", "Ninho com morango");
		dicionario.adicionarPalavra("Chocolate", "doce");
		dicionario.adicionarPalavra("Suco", "Frutas");
		
		// Exibir palavras
		dicionario.exibirPalavras();
		
		//Remover palavra
		dicionario.removerPalavra("Bolo");
		
		dicionario.exibirPalavras();
		
		//Pesquisar por palavra
		String definicao = dicionario.pesquisarPorPalavra("Suco");
	    System.out.println(definicao);
		
	}		
}
