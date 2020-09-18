package entidades;

public class Administrador extends Pessoa {
	
	private String ajudaCusto;

	public Administrador(String nome, String endereco, String telefone, String ajudaCusto) {
		super(nome, endereco, telefone);
		this.ajudaCusto = ajudaCusto;
	}

	public String getAjudaCusto() {
		return ajudaCusto;
	}

	public void setAjudaCusto(String ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}
	
	

}
