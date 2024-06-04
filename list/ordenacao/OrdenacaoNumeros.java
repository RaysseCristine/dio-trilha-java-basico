package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	//lista com atributo
	private List <Integer> numeros;

	//Construtor
	public OrdenacaoNumeros(List<Integer> numeros) {
		this.numeros = new ArrayList<>();
	}
	
	//Adiciona um número à lista.
	public void adicionarNumero(int numero) {
		this.numeros.add(numero);	
	}
	
	//Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
	public List <Integer> ordenarAscendente(){
		List <Integer> asc = new ArrayList(numeros);
		if (!numeros.isEmpty()) {
			numeros.sort(Collections.reverseOrder());
			return asc;
		} else {
		      throw new RuntimeException("A lista está vazia!");
	   }
}
	
	
	//Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.
	public List <Integer> ordenarDescendente(){
		List <Integer> desc = new ArrayList(numeros);
		if (!numeros.isEmpty()) {
			numeros.sort(Collections.reverseOrder());
			return desc;
		} else {
		      throw new RuntimeException("A lista está vazia!");
	  }
}
	
	public void exibirNumeros() {
	    if (!numeros.isEmpty()) {
	      System.out.println(this.numeros);
	    } else {
	      System.out.println("A lista está vazia!");
	    }
	 }


	  public static void main(String[] args) {
	    // Criando uma instância da classe OrdenacaoNumeros
	    OrdenacaoNumeros numeros = new OrdenacaoNumeros(null);

	    // Adicionando números à lista
	    numeros.adicionarNumero(2);
	    numeros.adicionarNumero(5);
	    numeros.adicionarNumero(4);
	    numeros.adicionarNumero(1);
	    numeros.adicionarNumero(99);

	    // Exibindo a lista de números adicionados
	    numeros.exibirNumeros();

	    // Ordenando e exibindo em ordem ascendente
	    System.out.println(numeros.ordenarAscendente());

	    // Exibindo a lista
	    numeros.exibirNumeros();

	    // Ordenando e exibindo em ordem descendente
	    System.out.println(numeros.ordenarDescendente());

	    // Exibindo a lista
	    numeros.exibirNumeros();
	  }
	}
	



	