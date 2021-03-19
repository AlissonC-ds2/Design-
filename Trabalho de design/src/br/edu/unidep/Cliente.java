package br.edu.unidep;

import java.time.LocalDate;

public class Cliente extends Pessoa {
	
	private Double limiteCredito;

	public Cliente(String nome, String cpf, String endereco, LocalDate dataNascimento, Double limiteCredito) {
		super(nome, cpf, endereco, dataNascimento);
		this.setLimiteCredito(limiteCredito);
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	@Override
	public void cadastrar() {
		System.out.println("Você cadastrou o cliente chamado " + this.getNome());
		
	}

	@Override
	public void excluir() {
		System.out.println("Você excluiu o cliente " + this.getNome());
		
	}

	@Override
	public void alterar() {
		System.out.println("Você alterou o limite de crédito do cliente para " + this.limiteCredito);
		
	}
	
	
	
}
