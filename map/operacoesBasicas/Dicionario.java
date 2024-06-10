package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
	
	private Map<String, String> dicionario;
	
	public Dicionario() {
		this.dicionario = new HashMap<>();
	}
	
	//Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
	public void adicionarPalavra(String palavra, String definicao){
			dicionario.put(palavra, definicao);
	}
	
	//Remove uma palavra do dicionário, dado o termo a ser removido.
	public void removerPalavra(String palavra) {
		if (!dicionario.isEmpty()) {
			dicionario.remove(palavra);
		} else {
			System.out.println("O dicionario está vazio.");
		}
	}
	
	// Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
	public void exibirPalavras() {
		System.out.println(dicionario);
	}
	
	//Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
	public String pesquisarPorPalavra(String palavra) {
		String pesquisa =  dicionario.get(palavra);
		if(pesquisa != null) {
			return pesquisa;	
		} 
		return "Palavra não encontrada no dicionário.";
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
