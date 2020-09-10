package Tenario;

import java.util.Scanner;

public class Tenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		int valor;
        System.out.println("Escolha 1-Masculino, 2-Feminino e 3-Outros: ");
        valor = kb.nextInt();
        
        System.out.print((valor==1)?"Masculino":(valor==2)?"Feminino":(valor==3)?"Outros":"Inválido");

	}

}
