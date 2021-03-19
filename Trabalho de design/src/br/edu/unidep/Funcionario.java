package br.edu.unidep;

import java.time.LocalDate;

public class Funcionario extends Pessoa{
	
	LocalDate dataAdmissao;

	public Funcionario(String nome, String cpf, String endereco, LocalDate dataNascimento, LocalDate dataAdmissao) {
		super(nome, cpf, endereco, dataNascimento);
		this.dataAdmissao = dataAdmissao;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	@Override
	public void cadastrar() {
		System.out.println("Você cadastrou o funcionário " + this.getNome());
	}

	@Override
	public void excluir() {
		System.out.println("Você excluiu o funcionário " + this.getNome());
		
	}

	@Override
	public void alterar() {
		// TODO Auto-generated method stub
		System.out.println("Você alterou o nome do funcionário para " + this.getNome());
	}
	
	
}
