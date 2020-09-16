package aplicacao;

import entidades.Aluno;
import entidades.Pessoa;
import entidades.Professor;

public class Cadastro {
	public static void main(String[] args)
	{
	System.out.println("SISTEMA DE CADASTRO");
	
	Pessoa fulano = new Pessoa("JOÃO");
	Pessoa ciclano = new Pessoa("MARIA", 'F', 1994);
	Aluno novoAluno = new Aluno("Leandro", 'M', 1994, "Branco", "turma B");
	Professor novoProfessor = new Professor("LUIZA", "MÓDULO II");
	
	
	
	System.out.println(novoProfessor.getNome());
	System.out.println(novoProfessor.getMateriaLecionada());
	}
}