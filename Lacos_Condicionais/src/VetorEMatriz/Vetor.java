package VetorEMatriz;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		/* Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.*/
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
		System.out.printf("\nOs números pares são: %d", par);
		System.out.printf("\nA soma dos números pares é: %d", totalPar);
		System.out.printf("\nOs números pares são: %d", impar);
kb.close();
	}
}
