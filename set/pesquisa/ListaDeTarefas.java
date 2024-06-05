package main.java.list.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaDeTarefas {
	//atributos
	private Set<Tarefa> listaTarefa;
	
	
	public ListaDeTarefas() {
		this.listaTarefa = new HashSet<>();
	}
	
	// Adiciona uma nova tarefa ao Set.
	public void adicionarTarefa(String descricao) {
		listaTarefa.add(new Tarefa(descricao));
	}
	
	// Remove uma tarefa do Set de acordo com a descrição, se estiver presente. 
	public void removerTarefa(String descricao) {
		Tarefa tarefaRemover = null;
		if(!listaTarefa.isEmpty()) {
			for (Tarefa t : listaTarefa) {
				if(t.getDescricao().equalsIgnoreCase(descricao)) {
					tarefaRemover = t;
					break;
				}
			}
			listaTarefa.remove(tarefaRemover);
		} else {
			System.out.println("O conjunto está vazio.");
		}
	}

	// Exibe todas as tarefas da lista de tarefas.
	public void exibirTarefas() {
		if(!listaTarefa.isEmpty()) {
			System.out.println(listaTarefa);
		} else {
			System.out.println("Tarefa não encontrada.");
		}
	}
	
	// Conta o número total de tarefas na lista de tarefas.
	public int contarTarefas() {
		return listaTarefa.size();
	}
	
	// Retorna um Set com as tarefas pendentes.
	public Set<Tarefa> obterTarefasPendentes() {
		Set<Tarefa> pendentes = new HashSet<>();
		for (Tarefa t : listaTarefa) {
			if(!t.isConcluida()) {
				pendentes.add(t);
			}
		}
		return pendentes;
	} 
	
	// Marca uma tarefa como concluída de acordo com a descrição. 
	public void marcarTarefaConcluida(String descricao) {
		for (Tarefa t : listaTarefa) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConcluida(true);	
			}
		}
	}
	
	// Marca uma tarefa como pendente de acordo com a descrição.
	public void marcarTarefaPendente(String descricao) {
		Tarefa marcarPendentes = null;
		for (Tarefa t : listaTarefa) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				marcarPendentes = t;
				break;
			}
		}
		if (marcarPendentes != null) {
			if(marcarPendentes.isConcluida()) {
				marcarPendentes.setConcluida(false);
			}
		} else {
			System.out.println("Tarefa não encontrada.");
		}
	}
	
	//Remove todas as tarefas da lista de tarefas.
	public void limparListaTarefas() {
		if(listaTarefa.isEmpty()) {
		System.out.println("A lista já está vazia.");
		} else {
			listaTarefa.clear();
		}
	}

public static void main(String[] args) {
    // Criando uma instância da classe ListaTarefas
    ListaDeTarefas lista = new ListaDeTarefas();

    // Adicionando tarefas à lista
    lista.adicionarTarefa("Estudar Java");
    lista.adicionarTarefa("Fazer exercícios físicos");
    lista.adicionarTarefa("Organizar a mesa de trabalho");
    lista.adicionarTarefa("Ler livro");
    lista.adicionarTarefa("Preparar apresentação");

    // Exibindo as tarefas na lista
    lista.exibirTarefas();

    // Removendo uma tarefa
    lista.removerTarefa("Fazer exercícios físicos");
    lista.exibirTarefas();

    // Contando o número de tarefas na lista
    System.out.println("Total de tarefas na lista: " + lista.contarTarefas());

    // Obtendo tarefas pendentes
    System.out.println(lista.obterTarefasPendentes());

    // Marcando tarefas como concluídas
    lista.marcarTarefaConcluida("Ler livro");
    lista.marcarTarefaConcluida("Estudar Java");

    // Obtendo tarefas concluídas
    //System.out.println(lista.obterTarefasConcluidas());

    // Marcando tarefas como pendentes
    lista.marcarTarefaPendente("Estudar Java");
    lista.exibirTarefas();

    // Limpando a lista de tarefas
    lista.limparListaTarefas();
    lista.exibirTarefas();
  }
}

