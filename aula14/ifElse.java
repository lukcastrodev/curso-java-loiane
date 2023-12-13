package ctech.cursoJavaLoiane.aula14;

import java.util.Scanner;

public class ifElse {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Entre com sua idade: ");
		
		int idade = scan.nextInt();
		
		if(idade >= 18) {
			System.out.println("É maior de idade.");
		} else {
			System.out.println("É menor de idade.");
		}*/
		
		
		System.out.println("Entre com o preço do item: ");
		double valor = scan.nextDouble();
		
		if(valor <= 10) {
			System.out.println("Está barato, pode comprar!");
		}else if(valor > 10 && valor < 15) {
			System.out.println("Está um pouco acima, peça desconto!");
		}else {
			System.out.println("Nem ferrando! Caro demais.");
		}
	}

}
