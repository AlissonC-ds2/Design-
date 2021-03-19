package br.edu.unidep;

import java.time.LocalDate;

import br.edu.unidep.interfaces.Repository;

public abstract class Pessoa extends Object implements Repository{
	
	private String nome;
	private String cpf;
	private String endereco;
	private LocalDate dataNascimento;
	
	
	public Pessoa(String nome, String cpf, String endereco, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
