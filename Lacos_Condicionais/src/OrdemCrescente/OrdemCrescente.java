package OrdemCrescente;

import java.util.Scanner;

public class OrdemCrescente {
	public static void main(String[] args) {
		//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente
		Scanner leia = new Scanner(System.in);
		int primeiro, segundo, terceiro;
		System.out.print("Digite o primeiro n�mero: ");
		primeiro = leia.nextInt();
		System.out.print("Digite o primeiro n�mero: ");
		segundo = leia.nextInt();
		System.out.print("Digite o primeiro n�mero: ");
		terceiro = leia.nextInt();
		
		if ((primeiro>=segundo && primeiro>=terceiro) && (segundo==primeiro && segundo==terceiro) && (terceiro<=primeiro && terceiro<=segundo)) {
	System.out.printf("A ordem crescente � %d, %d e %d", primeiro, segundo, terceiro);
}
		else {
			System.out.printf("A ordem crescente � %d, %d e %d", primeiro, segundo, terceiro);
		}
	}

}
