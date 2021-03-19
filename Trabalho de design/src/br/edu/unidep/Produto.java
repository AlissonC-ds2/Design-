package br.edu.unidep;

import br.edu.unidep.interfaces.Repository;

public class Produto implements Repository {

	String nome;
	Double preco;
	
	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public void cadastrar() {
		String produto = this.nome; 
		
		System.out.println("Você cadastrou o produto " + produto);
	}

	@Override
	public void excluir() {
		String produto = this.nome; 
		
		System.out.println("Você excluiu o produto " + produto);
	}

	@Override
	public void alterar() {
		
		String produto = this.nome; 
		System.out.println("Você alterou o produto para " + produto);
	}
	
	
	
	
}
