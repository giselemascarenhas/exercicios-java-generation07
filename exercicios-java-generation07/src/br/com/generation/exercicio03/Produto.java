package br.com.generation.exercicio03;

public class Produto {
	
	private String nome;
	private double preco;
	
	// Construtor
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	
	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Método - Sobreescrevendo
	public String toString() {
	return this.nome + " - O valor é  R$ " + this.preco;
	
	}
}
