package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/* 
        1-	Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		System.out.println("Digite o primeiro valor: ");
		a = leia.nextInt();
		System.out.println("Digite o primeiro valor: ");
		b = leia.nextInt();
		System.out.println("Digite o primeiro valor: ");
		c = leia.nextInt();
		if (a>=b && a>=c)
		{
			System.out.printf("O maior valor � %d ", a);
		}
		else if (b>=a && b>=c)
		{
			System.out.printf("O maior valor � %d ", b);
		}
		else if (c>=a && c>=b)
		{
			System.out.printf("O maior valor � %d ", c);
		}

	}

}
