package VetorEMatriz;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		/* Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.*/
		Scanner kb = new Scanner(System.in);
		int [] valor = new int[6];
		int v, par = 0, impar = 0, totalPar = 0, totalImpar = 0;
		for(v=0; v<6; v++)
		{
			System.out.print("Escreva um valor: ");
			valor[v] = kb.nextInt();
			if ((valor[v] % 2) ==0){
				par++;
				totalPar = (valor[v]);
			}
			esle {
				impar++;
			}
		}
		System.out.printf("\nOs n�meros pares s�o: %d", par);
		System.out.printf("\nA soma dos n�meros pares �: %d", totalPar);
		System.out.printf("\nOs n�meros pares s�o: %d", impar);
kb.close();
	}
}
