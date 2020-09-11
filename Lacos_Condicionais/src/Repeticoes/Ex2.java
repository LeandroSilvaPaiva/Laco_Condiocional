package Repeticoes;

public class Ex2 {

	public static void main(String[] args) {
		/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
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
