package Tenario;

import java.util.Scanner;

public class Tenario {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int valor;
        System.out.println("Digite 1-Masculino, 2-Feminino e 3-Outros: ");
        valor = kb.nextInt();
        
        System.out.print( (valor==1) ? "Sexo Masculino" : (valor==2) ? "Sexo Feminino" : (valor==3) ? "Outros":"Código Inválido" );
kb.close();
	}

}
