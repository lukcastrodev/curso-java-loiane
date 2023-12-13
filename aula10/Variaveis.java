package ctech.cursoJavaLoiane.aula10;

public class Variaveis {
	
	public static void main(String[] args) {
		
		//Convenção java
		int idade = 49;
		String nome = "Euclides";
		String nomeDoCachorro = "Rex";
		
		//Permitida, mas não utilizada
		int _idade = 49;
		int $idade = 49;
		
		//Não é convenção
		String nome_do_cachorro = "Rex";
		String NomeDoCachorro = "Rex";
		String NomeDocachorro = "Rex";
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Pet: " + nomeDoCachorro);
		
		//Má prática
		int a = 49;
		String b = "Euclides";
		
	}

}
