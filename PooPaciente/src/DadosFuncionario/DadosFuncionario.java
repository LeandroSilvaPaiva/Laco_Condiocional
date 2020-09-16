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
			System.out.printf("\nO nome do funcinario é %s, função: %s tem %d anos e ele é do sexo Masculino.", nomeFuncionario,funcaoFuncionario, idadeFuncionario);
		}
		else if(sexoFuncionario=='F')
		{	
			System.out.printf("\nO nome da funcionario é %s, função: %s tem %d anos e ela é do sexo Feminina.", nomeFuncionario, funcaoFuncionario, idadeFuncionario);
		}
	}
	public void horas()
	{
		if(horasTrabalhadas == 44)
		{	
			System.out.printf("\nVocê cumpriu com sua jornada de trabalho: %.2f/44 horas semanais.", horasTrabalhadas);
		}
		else if(horasTrabalhadas < 44)
		{	
			System.out.printf("\nVocê deve %.2f/44 horas semanais ", (horasTrabalhadas - 44));
		}
		else if(horasTrabalhadas > 44)
		{	
			System.out.printf("\nVocê tem banco de %.2f/44 horas semanais", horasTrabalhadas);
		}
	}

}
