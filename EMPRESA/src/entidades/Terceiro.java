package entidades;

public class Terceiro extends Funcionario {
	
	private double horasAdicionais;
	
	public Terceiro(String nome) {
		super(nome);
	}

	public Terceiro(String nome, int horasTrabalhadas, double valorHora, double horasAdicionais) {
		super(nome, horasTrabalhadas, valorHora);
		this.horasAdicionais = horasAdicionais;
	} 

	public double getHorasAdicionais() {
		return horasAdicionais;
	}

	public void setHorasAdicionais(double horasAdicionais) {
		this.horasAdicionais = horasAdicionais;
	}
	
	

}
