package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	
	private Map <String, Integer> contarPalavras;
	
	public ContagemPalavras() {
		this.contarPalavras = new HashMap<>();
	}
	
	//Adiciona uma palavra à contagem.
	public void adicionarPalavra(String palavra, Integer contagem) {
		contarPalavras.put(palavra, contagem);
	}
	
	//Remove uma palavra da contagem, se estiver presente.
	public void removerPalavra(String palavra) {
		contarPalavras.remove(palavra);
	}
	
	//Exibe todas as palavras e suas respectivas contagens.
	public int exibirContagemPalavras() {
		int contagemTotal = 0;
		for(int contagem : contarPalavras.values()) {
			contagemTotal += contagem;
		}
		return contagemTotal;
	}
	
	//Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
	public String encontrarPalavrasMaisFrequente() {
	    String palavraMaisFrequente = null;
	    int maiorContagem = 0;
	    for (Map.Entry<String, Integer> entry : contarPalavras.entrySet()) {
	      if (entry.getValue() > maiorContagem) {
	        maiorContagem = entry.getValue();
	        palavraMaisFrequente = entry.getKey();
	      }
	    }
	    return palavraMaisFrequente;
	  }


	public static void main(String[] args) {
    ContagemPalavras contagem = new ContagemPalavras();
    
    //Adicionando palavras
    contagem.adicionarPalavra("Java", 5);
    contagem.adicionarPalavra("Python", 3);
    contagem.adicionarPalavra("C++", 4);
    contagem.adicionarPalavra("Java", 7);
    contagem.adicionarPalavra("Ruby", 1);
    
    //Exibir contagem
    System.out.println("Há " + contagem.exibirContagemPalavras() + " palavras.");
    
    //Remover palavra
    contagem.removerPalavra("C++");
    
    //Exibir contagem
    System.out.println("Há " + contagem.exibirContagemPalavras() + " palavras.");
    
    //Pesquisar palavra mais frequente
    String frequencia = contagem.encontrarPalavrasMaisFrequente();
    System.out.println("A palavra mais frequente é: " + frequencia);
    
	}
}	
