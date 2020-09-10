package OrdemCrescente;

import java.util.Scanner;

public class OrdemCrescente {
	public static void main(String[] args) {
		//Faça um programa que entre com três números e coloque em ordem crescente
		Scanner leia = new Scanner(System.in);
		int primeiro, segundo, terceiro;
		System.out.print("Digite o primeiro número: ");
		primeiro = leia.nextInt();
		System.out.print("Digite o primeiro número: ");
		segundo = leia.nextInt();
		System.out.print("Digite o primeiro número: ");
		terceiro = leia.nextInt();
		
		if ((primeiro>=segundo && primeiro>=terceiro) && (segundo==primeiro && segundo==terceiro) && (terceiro<=primeiro && terceiro<=segundo)) {
	System.out.printf("A ordem crescente é %d, %d e %d", primeiro, segundo, terceiro);
}
		else {
			System.out.printf("A ordem crescente é %d, %d e %d", primeiro, segundo, terceiro);
		}
	}

}
