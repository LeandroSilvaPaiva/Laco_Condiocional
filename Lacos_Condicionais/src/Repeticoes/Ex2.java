package Repeticoes;

public class Ex2 {

	public static void main(String[] args) {
		/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/
		int valor=0, impar=0, par=0;
		for (valor=1; valor<=10; valor++){
		System.out.printf("\n %d", valor);	
		
		if ((valor % 2) ==0){ 
            par++;
		}	
		if((valor % 2) !=0){  
			impar++;
		}
		}
		System.out.printf("\n%d par ", par);
		System.out.printf("\n%d impar", impar);
		
	}
}
