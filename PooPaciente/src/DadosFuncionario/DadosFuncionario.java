package DadosFuncionario;

public class DadosFuncionario {
	
	public String nomeFuncionario;
	public int idadeFuncionario;
	public char sexoFuncionario;
	public String funcaoFuncionario;
	public double horasTrabalhadas;

	
	public void mostra()
	{
		if(sexoFuncionario=='M')
		{	
			System.out.printf("\nO nome do funcinario � %s, fun��o: %s tem %d anos e ele � do sexo Masculino.", nomeFuncionario,funcaoFuncionario, idadeFuncionario);
		}
		else if(sexoFuncionario=='F')
		{	
			System.out.printf("\nO nome da funcionario � %s, fun��o: %s tem %d anos e ela � do sexo Feminina.", nomeFuncionario, funcaoFuncionario, idadeFuncionario);
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
			System.out.printf("\nVoc� deve %.2f/44 horas semanais ", (horasTrabalhadas - 44));
		}
		else if(horasTrabalhadas > 44)
		{	
			System.out.printf("\nVoc� tem banco de %.2f/44 horas semanais", horasTrabalhadas);
		}
	}

}
