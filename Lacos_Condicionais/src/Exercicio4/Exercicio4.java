package Exercicio4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/
		Scanner leia = new Scanner(System.in);
		double valor, raiz, quadrado;
		System.out.println("Entre com o valor: ");
		valor = leia.nextInt();
		if (valor % 2 == 0)
		{
			raiz = Math.sqrt(valor);
		System.out.printf("O valor digitado é par: %.2f, a raiz desse valor é: %.2f.", valor, raiz);
		}
		
		else
		{
			quadrado = Math.pow(valor, 2);
			System.out.printf("O valor digitado é ímpar: %.2f, esse valor elevado ao qaudrado é: %.2f.", valor, quadrado);	
		}


	}

}
