package entidades;

public class Cavalo extends Animal 
{
	public Cavalo(String nome, String som) 
	{
		super(nome, som);		
	}
	public String somAnimais()
	{
		String s = "O cavalo: ";
		s += super.getSom();
		return s;
	}
}
