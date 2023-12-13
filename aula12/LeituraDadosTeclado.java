package ctech.cursoJavaLoiane.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome é " + nomeCompleto);
		
		System.out.println("Digite seu prmeiro nome: ");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome é " + primeiroNome);*/
		
		/*System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é " + idade);
		
		System.out.println("Digite sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é " + altura);*/
		
		System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos e se tem algum pet: ");
		String nome = scan.next();
		int idade = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores: ");
		System.out.println("Primeiro nome: " + nome);
		System.out.println("idade: " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Tem pet? " + temPet);
	}

}
