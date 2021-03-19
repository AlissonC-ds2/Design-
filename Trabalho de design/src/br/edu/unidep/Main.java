package br.edu.unidep;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner escolha = new Scanner(System.in);  // Create a Scanner object
	    
	    System.out.println("1 = Entrar no menu de funcionario \n2 = Entrar no menu de cliente \n3 = Entrar no menu de produto \n4 = Entrar no menu venda");
	    System.out.println("Escolha o menu: ");
	    Integer menu = escolha.nextInt();  
	    
	    if(menu == 1) {
	    	System.out.println("1 - cadastrar \n2 - alterar \n3 - excluir \nEscolher: ");
	    	
	    	Scanner escolhaFuncionario = new Scanner(System.in);
	    	Integer menuFuncionario = escolhaFuncionario.nextInt();
	    	
	    	DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
			LocalDate dataNascimento = LocalDate.parse("04/11/2000", dateFormat);
			LocalDate dataAdmissao = LocalDate.parse("03/11/2021", dateFormat);
			
			Funcionario funcionario = new Funcionario("Alisson", "118.333.569-50", "Pedro Ramirez de Mello",
					dataNascimento, dataAdmissao);
	    	
	    	if(menuFuncionario == 1) {
				funcionario.cadastrar();
	    	} else if (menuFuncionario == 2) {
	    		System.out.println("Funcionario: " + funcionario.getNome());
	    		funcionario.setNome("Guilherme");
	    		funcionario.alterar();
	    	} else {
	    		funcionario.excluir();
	    	}
	    			
	    } else if (menu == 2) {
	    	System.out.println("1 - cadastrar \n2 - alterar \n3 - excluir \nEscolher: ");
	    	
	    	Scanner escolhaCliente = new Scanner(System.in);
	    	Integer menuCliente = escolhaCliente.nextInt();
	    	
	    	DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
			LocalDate dataNascimento = LocalDate.parse("06/15/2007", dateFormat);
	    	Cliente cliente = new Cliente("Joao", "118.333.569-50", "Pedro Luz de Mello",
					dataNascimento, 200.00);
	    	
	    	
	    	if(menuCliente == 1) {
	    		cliente.cadastrar();
	    	} else if (menuCliente == 2) {
	    		System.out.println("Limite de crédito atual: " + cliente.getLimiteCredito());
	    		cliente.setLimiteCredito(500.00);
	    		cliente.alterar();
	    	} else {
	    		cliente.excluir();
	    	}
	    	
	    } else if(menu == 3) {
	    	System.out.println("1 - cadastrar \n2 - alterar \n3 - excluir \nEscolher: ");
	    	
	    	Scanner escolhaProduto = new Scanner(System.in);
	    	Integer menuProduto = escolhaProduto.nextInt();
	    	
	    	Produto produto = new Produto("Calçado", 200.50);
	    	
	    	
	    	if(menuProduto == 1) {
	    		produto.cadastrar();
	    	} else if (menuProduto == 2) {
	    		System.out.println("O Nome do produto atual é: "  + produto.getNome());
	    		produto.setNome("Camisa");;
	    		produto.alterar();
	    	} else {
	    		produto.excluir();
	    	}
	    	
	    } else if (menu == 4) {
	    	System.out.println("1 - cadastrar \n2 - alterar \n3 - excluir \nEscolher: ");
	    	
	    	Scanner escolhaVenda = new Scanner(System.in);
	    	Integer menuVenda = escolhaVenda.nextInt();
	    	
	    	DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
			LocalDate dataVenda = LocalDate.parse("03/02/2021", dateFormat);
	    	
	    	Venda venda = new Venda(dataVenda, 450.50);
	    	
	    	if(menuVenda == 1) {
	    		venda.cadastrar();
	    	} else if (menuVenda == 2) {
	    		System.out.println("O valor da venda atual é : " + venda.getPrecoVenda());
	    		venda.setPrecoVenda(500.00);
	    		venda.alterar();
	    	} else {
	    		venda.excluir();
	    	}
	    	
	    }
		
	}

}
