package Exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
			�                     10-14 infantil
			�                     15-17 juvenil
			�                     18-25 adulto*/
		int idade;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		if (idade>=10 && idade<=14)
		{
		System.out.printf("Sua categoria � infantil, %d anos", idade );
		}
		else if (idade>=15 && idade<=17)
		{
	    System.out.printf("Sua categoria � juvenil, %d anos", idade);
		}
		else if (idade>=18 && idade<=25)
		{
		System.out.printf("Sua categoria � adulto, %d anos", idade);	
		}


	}

}
