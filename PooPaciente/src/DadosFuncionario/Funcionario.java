package DadosFuncionario;

import java.util.Scanner;

public class Funcionario {/*
*4) Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto funcion�rio, defina as instancias deste objeto e apresente as informa��es deste objeto no console.
**/
	public static void main(String[] args) {
		Scanner kb =new Scanner(System.in);
		DadosFuncionario funcionario = new DadosFuncionario();
		
		System.out.print("Escreva o nome do funcionario: ");
		funcionario.nomeFuncionario = kb.nextLine().toUpperCase();
		System.out.print("Escreva a idade do funcionario: ");
		funcionario.idadeFuncionario = kb.nextInt();
		System.out.print("Qual o sexo do funcionario: ");
		funcionario.sexoFuncionario = kb.next().toUpperCase().charAt(0);
		System.out.print("Qual a fun��o do funcionario: ");
		funcionario.funcaoFuncionario = kb.next();
		System.out.print("Qual a quantidade de horas trabalhadas na semana: ");
		funcionario.horasTrabalhadas = kb.nextDouble();
		
		funcionario.mostra();
		funcionario.horas();
		
kb.close();
	}

}
