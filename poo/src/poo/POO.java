package poo;

public class POO {
	
	//atributos da classe
	public String nomeAluno;    //public ou private
	public int anoNascimentoAluno;
	public char sexoAluno;
	public double notas[] = new double[4];
	//metodos 
	public void mostra() //não tem retorno
	{
		if (sexoAluno == 'M') {
			System.out.printf("O nome do aluno é %s do sexo %s", nomeAluno, sexoAluno);
		}
		else if (sexoAluno == 'f') {
			System.out.printf("O nome da aluna é %s do sexo %s", nomeAluno, sexoAluno);
		}
	}
}
