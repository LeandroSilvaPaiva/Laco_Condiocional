package entidades;

public class Empregado extends Pessoa {
	private int codigoSetor;
	private float salarioBase;
	private float impostos;
	
	public Empregado(String nome, String endereco, int telefone, int codigoSetor, float salarioBase, float impostos) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.impostos = impostos;
		
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImpostos() {
		return impostos;
	}

	public void setImpostos(float impostos) {
		this.impostos = impostos;
	}
	
	public void calcularSalario() {
		if ()
	}
	

}
