package entidades;

public class Animal 
{
	private String nome;
	private String som;
	private int idade;
	private String correr;
	public Animal(String nome, String som) 
	{
		super();
		this.nome = nome;
		this.som = som;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String somAnimais()
	{
		return som;
	}
    
}
