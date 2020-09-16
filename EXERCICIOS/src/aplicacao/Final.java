package aplicacao;

import entidades.Administrador;
import entidades.Fornecedor;
import entidades.Pessoa;

public class Final {

	public static void main(String[] args) {
		Pessoa novaPessoa = new Pessoa("LEANDRO", "RUA UM",984612578);
		Fornecedor novoFornecedor = new Fornecedor("LEANDRO", 300, 200);
		Administrador novoAdm = new Administrador("LEANDRO", "RUA UM",984612578, 300);
				
		System.out.println("PESSOA:");	
		System.out.println(novaPessoa.getNome());
		System.out.println(novaPessoa.getEndereco());
		System.out.println(novaPessoa.getTelefone());
		System.out.println(" ");
		System.out.println("FORNECEDOR:");
		System.out.println(novoFornecedor.getNome());
		System.out.println(novoFornecedor.getValorCredito());
		System.out.println(novoFornecedor.getValorDivida());
		novoFornecedor.obterSaldo();
		System.out.println(" ");
		System.out.println(" ");
	    System.out.println("ADMINISTRADOR:");
		System.out.println(novoAdm.getNome());
		System.out.println(novoAdm.getEndereco());
		System.out.println(novoAdm.getTelefone());
		System.out.println(novoAdm.getAjudaCusto());
		

	}

}
