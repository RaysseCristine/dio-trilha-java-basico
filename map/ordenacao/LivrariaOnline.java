package main.java.map.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

public class LivrariaOnline {
	
	private Map<String, Livro> livraria;

	public LivrariaOnline() {
		this.livraria = new HashMap<>();
	}
	
	//Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
	public void adicionarLivro(String link, Livro livro) {
		livraria.put(link, livro);
	}
	
	//Remove um livro da livraria, dado o titulo do livro.
	public void removerLivro(String titulo) {
		List<String> chavesRemover = new ArrayList<>();
	    for (Map.Entry<String, Livro> entry : livraria.entrySet()) {
	      if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
	        chavesRemover.add(entry.getKey());
	      }
	    }
	    for (String chave : chavesRemover) {
	      livraria.remove(chave);
	    }
	}

	//Exibe os livros da livraria em ordem crescente de preço.
	public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
		List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livraria.entrySet());

	    Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

	    Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

	    for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
	      livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
	    }

	    return livrosOrdenadosPorPreco;
	  }

	
	//Retorna uma lista de todos os livros escritos por um determinado autor.
	public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
		 Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
		    for (Map.Entry<String, Livro> entry : livraria.entrySet()) {
		      Livro livro = entry.getValue();
		      if (livro.getAutor().equals(autor)) {
		        livrosPorAutor.put(entry.getKey(), livro);
		      }
		    }
		    return livrosPorAutor;
	}
	
	// Retorna o livro mais caro disponível na livraria.
	 public Livro obterLivroMaisCaro() {
		 Livro livroMaisCaro = null;
		    double maiorPreco = Double.MIN_VALUE;
		    for (Livro l : livraria.values()) {
		      if (l.getPreco() > maiorPreco) {
		        livroMaisCaro = l;
		        maiorPreco = l.getPreco();
		      }
		    }
		    return livroMaisCaro;
		  }
	 
	// Retorna o livro mais barato disponível na livraria.
	 public List<Livro> exibirLivroMaisBarato() {
		 List<Livro> livrosMaisBaratos = new ArrayList<>();
		    double menorPreco = Double.MAX_VALUE;
		    if (!livraria.isEmpty()) {
		        for (Livro livro : livraria.values()) {
		          if (livro.getPreco() < menorPreco) {
		        	  menorPreco = livro.getPreco();
		          }
		        }
		      } else {
		        throw new NoSuchElementException("A livraria está vazia!");
		      }

		      for(Map.Entry<String, Livro> entry: livraria.entrySet()) {
		        if(entry.getValue().getPreco() == menorPreco) {
		          Livro livroComPrecoMaisBaixo = livraria.get(entry.getKey());
		          livrosMaisBaratos.add(livroComPrecoMaisBaixo);
		        }
		      }
		      return livrosMaisBaratos;
		  }

	
	public static void main(String [] args) {
		LivrariaOnline livros = new LivrariaOnline();
		
		
		livros.adicionarLivro("https://acesse.one/ZtmSf", new Livro("Horizonte Vermelho", "Elizabeth Pereira", 30.0));
		livros.adicionarLivro("https://l1nk.dev/hnzhq", new Livro("Sob a Égide da Cruz", "Elizabeth Pereira", 25.0));
		livros.adicionarLivro("https://acesse.one/7qdYK", new Livro("A Culpa é das Estrelas", "John Green", 15.0));
		
		System.out.println("Livros ordenados por preço: " + livros.exibirLivrosOrdenadosPorPreco());
		
		System.out.println("Livros ordenados por autor: " + livros.pesquisarLivrosPorAutor("Elizabeth Pereira"));
		
		 // Pesquisa livros por autor
	    String autorPesquisa = "Elizabeth Pereira";
	    livros.pesquisarLivrosPorAutor(autorPesquisa);

	    // Obtém e exibe o livro mais caro
	    System.out.println("Livro mais caro: " + livros.obterLivroMaisCaro());

	    // Obtém e exibe o livro mais barato
	    System.out.println("Livro mais barato: " + livros.exibirLivroMaisBarato());

	    // Remover um livro pelo título
	    livros.removerLivro("A Culpa é das Estrelas");
	    System.out.println(livros.livraria);

	  }
		
	}

