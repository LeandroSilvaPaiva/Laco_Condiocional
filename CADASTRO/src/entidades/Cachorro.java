package entidades;

public class Cachorro extends Animal 
{
	public Cachorro(String nome, String som) 
	{
		super(nome, som);		
	}
	public String somAnimais()
	{
		String s = "O cachorro: ";
		s += super.getSom();
		return s;
	}
	
}
