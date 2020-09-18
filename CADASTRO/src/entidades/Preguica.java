package entidades;

public class Preguica extends Animal 
{
	public Preguica(String nome, String som) 
	{
		super(nome, som);		
	}
	public String somAnimais()
	{
		String s = "A preguiça: ";
		s += super.getSom();
		return s;
	}
}
