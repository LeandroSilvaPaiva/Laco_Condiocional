package Repeticoes;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
		Scanner kb = new Scanner(System.in);
		int idade, menor=0, maior=0;
		System.out.println("Digite a sua idade: ");
		idade = kb.nextInt();
		System.out.printf("Sua idade é %d ", idade);
		do  {
			if (idade<=21) {
				menor++;
				
			}
			if (idade>=50 && idade<=99) {
				maior++;
				
			}	
		}while(idade<=99);
		System.out.printf("menores de 21 %d", menor);
		System.out.printf("maiores de 55 %d", menor);
	}
}
