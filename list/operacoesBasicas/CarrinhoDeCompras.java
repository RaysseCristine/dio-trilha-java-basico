package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	private List<Item> carrinhoOnline;

	public CarrinhoDeCompras() {
		this.carrinhoOnline = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinhoOnline.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> removerItem = new ArrayList<>();
		if(!carrinhoOnline.isEmpty()) {
			for(Item i : carrinhoOnline) {
				if(i.getNome().equalsIgnoreCase(nome)) {
					removerItem.add(i);
				}
			}
			carrinhoOnline.removeAll(removerItem);
		} else {
			System.out.println("A lista está vazia!");
		}
	}
	
	public double calcularValorTotal() {
	    double valorTotal = 0d;
	    if (!carrinhoOnline.isEmpty()) {
	      for (Item item : carrinhoOnline) {
	        double valorItem = item.getPreco() * item.getQuantidade();
	        valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
	      }
	      return valorTotal;
	    } else {
	      throw new RuntimeException("A lista está vazia!");
	    }
	  }
	
	public void exibirItens() {
		if(!carrinhoOnline.isEmpty()){
			System.out.println(carrinhoOnline);
		} else {
			System.out.println("A lista está vazia!");
		}
	}
	
	public static void main (String [] args) {
		CarrinhoDeCompras carrinhoOnline = new CarrinhoDeCompras();
		
		carrinhoOnline.adicionarItem("LEITE", 5.0, 1);
		carrinhoOnline.adicionarItem("BOLACHA", 3.0, 2);
		carrinhoOnline.adicionarItem("PRINGLES", 12.0 , 1);
		
		carrinhoOnline.exibirItens();
		
		carrinhoOnline.removerItem("LEITE");
		
		carrinhoOnline.exibirItens();
		
		System.out.println("Valor total: " + carrinhoOnline.calcularValorTotal());
		
	}

}
