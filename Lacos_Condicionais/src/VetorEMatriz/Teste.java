package VetorEMatriz;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
final int TAMANHO = 3;
int [][] matriz = new int[TAMANHO][TAMANHO];
int l,c, valorDigitado = 0, soma = 0, total = 0;
    for (l=0; l<3; l++) {
    	
    	for (c=0; c<3; c++) {
    		System.out.printf("Escrevao valor de [%d] e [%d]: ", l+1, c+1);
    		matriz [l][c] = leia.nextInt();
    		if (l==c)
			{
				soma = soma + matriz[l][c];
			}
    	}
    }
    System.out.printf("\nO valor da soma das diagonais é: %d", soma);


	}

}
