package main.java.list.Pesquisa;

import java.util.Objects;

public class Tarefa {
	//Atributos
	private String descricao;
	private boolean concluida;
	
	public Tarefa(String descricao) {
		this.descricao = descricao;
		this.concluida = concluida;
	}

	public String getDescricao() {
		return descricao;
	}


	public boolean isConcluida() {
		return concluida;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
		
	}

	@Override
	public String toString() {
		return "Tarefa: " + descricao + ", " + concluida;
	}

	
}
