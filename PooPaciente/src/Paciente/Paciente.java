package Paciente;

public class Paciente {
	public String nomePaciente;
	public int idadePaciente;
	public char sexoPaciente;
	public int dorPaciente;
	
	public void mostra()
	{
		if(sexoPaciente=='M')
		{	
			System.out.printf("\nO nome do paciente � %s, tem %d anos e ele � do sexo Masculino.", nomePaciente, idadePaciente);
		}
		else if(sexoPaciente=='F')
		{	
			System.out.printf("\nO nome da paciente � %s, tem %d anos e ela � do sexo Feminina.", nomePaciente, idadePaciente);
		}
	}
	public int dores()
	{
		if (dorPaciente>=0 && dorPaciente<=4) {
			System.out.printf("\nSua dor � %d, suport�vel", dorPaciente);
		}
		if (dorPaciente>=5 && dorPaciente<=7) {
			System.out.printf("\nSua dor � %d, moderada", dorPaciente);
		}
		if (dorPaciente>=8 && dorPaciente<=10) {
			System.out.printf("\nSua dor � %d, insuport�vel", dorPaciente);
		}
		return dorPaciente;
	}
}
