package main.java.list.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	//atributo
	private Set<String> palavrasUnicas;
	
	public ConjuntoPalavrasUnicas() {
		this.palavrasUnicas = new HashSet<>();
	}
	
	// Adiciona uma palavra ao conjunto.
	public void adicionarPalavra(String palavra) {
		palavrasUnicas.add(palavra);
	}
	
	//Remove uma palavra do conjunto.
	public void removerPalavra(String palavra) {
		if(!palavrasUnicas.isEmpty()) {
			if(palavrasUnicas.contains(palavra)) {
				palavrasUnicas.remove(palavra);
			} else {
				System.out.println("Palavra n�o encontrada no conjunto.");
			}
		} else {
			System.out.println("O conjunto est� vazio.");
		}
	}
	
	//Verifica se uma palavra est� presente no conjunto.
	public boolean verificarPalavra(String palavra) {
		return palavrasUnicas.contains(palavra);
	}
	
	//Exibe todas as palavras �nicas do conjunto.
	public void exibirPalavrasUnicas() {
		if(!palavrasUnicas.isEmpty()) {
			System.out.println(palavrasUnicas);
		} else {
			System.out.println("O conjunto est� vazio.");
		}
	}
	
	public static void main(String[] args) {
		ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
		
		conjunto.adicionarPalavra("Java");
		conjunto.adicionarPalavra("SQL");
		conjunto.adicionarPalavra("IA");
		conjunto.adicionarPalavra("Power BI");
		
		conjunto.exibirPalavrasUnicas();
		
		conjunto.removerPalavra("IA");
		conjunto.exibirPalavrasUnicas();
		
		System.out.println("A linguagem 'Java' est� no conjunto? " + conjunto.verificarPalavra("Java"));
		
		conjunto.exibirPalavrasUnicas();
	}
}
