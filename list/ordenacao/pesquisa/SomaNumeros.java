package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
  //atributos
  private List<Integer> numeros;

  //construtor
  public SomaNumeros() {
    this.numeros = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    this.numeros.add(numero);
  }

  public int calcularSoma() {
    int soma = 0;
    for (Integer numero : numeros)
      soma += numero;
    return soma;
  }

  public int encontrarMaiorNumero() {
    int maiorNumero = Integer.MIN_VALUE;
    if (!numeros.isEmpty()) {
      for (Integer numero : numeros) {
        if (numero >= maiorNumero) {
          maiorNumero = numero;
        }
      }
      return maiorNumero;
    } else {
      throw new RuntimeException("A lista est� vazia!");
    }
  }

  public int encontrarMenorNumero() {
    int menorNumero = Integer.MAX_VALUE;
    if (!numeros.isEmpty()) {
      for (Integer numero : numeros) {
        if (numero <= menorNumero) {
          menorNumero = numero;
        }
      }
      return menorNumero;
    } else {
      throw new RuntimeException("A lista est� vazia!");
    }
  }

  public void exibirNumeros() {
    if (!numeros.isEmpty()) {
      System.out.println(this.numeros);
    } else {
      System.out.println("A lista est� vazia!");
    }
  }

  public static void main(String[] args) {
    // Criando uma inst�ncia da classe SomaNumeros
    SomaNumeros somaNumeros = new SomaNumeros();

    // Adicionando n�meros � lista
    somaNumeros.adicionarNumero(5);
    somaNumeros.adicionarNumero(10);
    somaNumeros.adicionarNumero(15);
    

    // Exibindo a lista de n�meros adicionados
    System.out.println("N�meros adicionados:");
    somaNumeros.exibirNumeros();

    // Calculando e exibindo a soma dos n�meros na lista
    System.out.println("Soma dos n�meros = " + somaNumeros.calcularSoma());

    // Encontrando e exibindo o maior n�mero na lista
    System.out.println("Maior n�mero = " + somaNumeros.encontrarMaiorNumero());

    // Encontrando e exibindo o menor n�mero na lista
    System.out.println("Menor n�mero = " + somaNumeros.encontrarMenorNumero());
  }
}
