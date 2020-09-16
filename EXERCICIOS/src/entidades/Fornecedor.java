package entidades;

public class Fornecedor extends Pessoa {
	private float valorCredito;
	private float valorDivida;
	
	
	
	public Fornecedor(String nome, int valorCredito, int valorDivida) {
		super(nome);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}



	public int getValorCredito() {
		return (int) valorCredito;
	}



	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}



	public int getValorDivida() {
		return (int) valorDivida;
	}



	public void setValorDivida(int valorDivida) {
		this.valorDivida = valorDivida;
	}



	public void obterSaldo() {
		if (valorCredito == valorDivida) {
			System.out.println("ZERO");
		}
		else if (valorCredito < valorDivida) {
			System.out.printf("Deve %.2f", (valorCredito - valorDivida));
		}
		else if (valorCredito > valorDivida) {
			System.out.printf("Sobra %.2f", (valorCredito - valorDivida));
		}
		
	}

}
