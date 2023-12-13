package ctech.cursoJavaLoiane.aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int diaSemana = scan.nextInt();
		
		/*if(diaSemana == 1) {
			System.out.println("DOMINGO");
		}else if(diaSemana == 2) {
			System.out.println("SEGUNDA");
		}else if(diaSemana == 3) {
			System.out.println("TERÇA");
		}else if(diaSemana == 4) {
			System.out.println("QUARTA");
		}else if(diaSemana == 5) {
			System.out.println("QUINTA");
		}else if(diaSemana == 6) {
			System.out.println("SEXTA");
		}else if(diaSemana == 7) {
			System.out.println("SÁBADO");
		}else {
			System.out.println("Não é um dia da semana válido.");
		}*/
		
		switch(diaSemana) {
			case 1: System.out.println("Domingo"); break;
			case 2: System.out.println("Segunda"); break;
			case 3: System.out.println("Terça"); break;
			case 4: System.out.println("Quarta"); break;
			case 5: System.out.println("Quinta"); break;
			case 6: System.out.println("Sexta"); break;
			case 7: System.out.println("Sábado"); break;
			default: System.out.println("Não é um dia da semana válido."); break;
		}
	}

}
