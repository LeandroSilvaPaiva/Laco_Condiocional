package Paciente;

import java.util.Scanner;

public class Paciente1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Paciente primeiroPaciente = new Paciente();
		
		System.out.print("Escreva o nome do paciente: ");
		primeiroPaciente.nomePaciente = kb.nextLine().toUpperCase();
		System.out.print("Escreva a idade do paciente: ");
		primeiroPaciente.idadePaciente = kb.nextInt();
		System.out.print("Qual o sexo do pacinete: ");
		primeiroPaciente.sexoPaciente = kb.next().toUpperCase().charAt(0);
		System.out.println("Em uma escala de 1 á 10 qual o nível de dor: ");
		primeiroPaciente.dorPaciente = kb.nextInt();
		
		
		primeiroPaciente.mostra();
		primeiroPaciente.dores();
kb.close();
	}

}
