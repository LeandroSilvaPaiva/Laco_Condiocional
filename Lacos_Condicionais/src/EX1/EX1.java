package EX1;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
int numero1, numero2, numero3;
		
		Scanner kb = new Scanner (System.in);
						
		System.out.printf("Digite o primeiro n�mero: ");
		numero1 = kb.nextInt();
		System.out.printf("Digite o segundo n�mero: ");
		numero2 = kb.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		numero3 = kb.nextInt();
	    
		if(numero1>=numero2 && numero1>=numero3) 
		{
			System.out.printf("O n�mero %d � maior.", numero1);
		}
		else if(numero2>=numero1 && numero2>=numero3)
		{
			System.out.printf("O n�mero %d � maior.", numero2);
		}
		else if(numero3>=numero1 && numero3>=numero2)
		{
			System.out.printf("O n�mero %d � maior.", numero3);
		}
kb.close();
	}

}
