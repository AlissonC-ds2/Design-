package br.edu.unidep;

import java.time.LocalDate;

import br.edu.unidep.interfaces.Repository;

public class Venda implements Repository{
	
	LocalDate dataVenda;
	Double precoVenda;
	
	public Venda(LocalDate dataVenda, Double precoVenda) {
		super();
		this.dataVenda = dataVenda;
		this.precoVenda = precoVenda;
	}

	public LocalDate getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}

	@Override
	public void cadastrar() {
		System.out.println("Você cadastrou uma venda");
	}

	@Override
	public void excluir() {
		LocalDate data = this.dataVenda; 
		System.out.println("Você excluiu a data de venda" + data);
	}

	@Override
	public void alterar() {
		double venda = this.precoVenda;
		System.out.println("Você alterou o preço de venda para " + venda);
	}
	
	
}
