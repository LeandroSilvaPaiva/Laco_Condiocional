package Exercicio4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/
		Scanner leia = new Scanner(System.in);
		double valor, raiz, quadrado;
		System.out.println("Entre com o valor: ");
		valor = leia.nextInt();
		if (valor % 2 == 0)
		{
			raiz = Math.sqrt(valor);
		System.out.printf("O valor digitado � par: %.2f, a raiz desse valor �: %.2f.", valor, raiz);
		}
		
		else
		{
			quadrado = Math.pow(valor, 2);
			System.out.printf("O valor digitado � �mpar: %.2f, esse valor elevado ao qaudrado �: %.2f.", valor, quadrado);	
		}


	}

}
