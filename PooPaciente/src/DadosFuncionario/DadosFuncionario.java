package DadosFuncionario;

public class DadosFuncionario {/*4) Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto funcion�rio, defina as instancias deste objeto e apresente as informa��es deste objeto no console.

*/
	
	public String nomeFuncionario;
	public int idadeFuncionario;
	public char sexoFuncionario;
	public String funcaoFuncionario;
	public double horasTrabalhadas;

	
	public void mostra()
	{
		if(sexoFuncionario=='M')
		{	
			System.out.printf("\nO nome do funcinario � %s, fun��o: %s, tem %d anos e ele � do sexo Masculino.", nomeFuncionario,funcaoFuncionario, idadeFuncionario);
		}
		else if(sexoFuncionario=='F')
		{	
			System.out.printf("\nO nome da funcionario � %s, fun��o: %s, tem %d anos e ela � do sexo Feminino.", nomeFuncionario, funcaoFuncionario, idadeFuncionario);
		}
	}
	public void horas()
	{
		if(horasTrabalhadas == 44)
		{	
			System.out.printf("\nVoc� cumpriu com sua jornada de trabalho: %.2f/44 horas semanais.", horasTrabalhadas);
		}
		else if(horasTrabalhadas < 44)
		{	
			System.out.printf("\nVoc� deve %.2f horas", (44 - horasTrabalhadas));
		}
		else if(horasTrabalhadas > 44)
		{	
			System.out.printf("\nVoc� tem banco de %.2f horas", (horasTrabalhadas - 44));
		}
	}

}
