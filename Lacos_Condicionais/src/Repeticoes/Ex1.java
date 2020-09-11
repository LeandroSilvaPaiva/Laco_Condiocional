package Repeticoes;

public class Ex1 {

	public static void main(String[] args) {
		// Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
		int valor=1000, divisor=11;
		for(valor = 1000; valor <= 1999; valor ++)
		{   valor = (valor / divisor);
		    valor = ((valor % divisor) % 5);
			System.out.println( valor);
			
		}
	}

}
