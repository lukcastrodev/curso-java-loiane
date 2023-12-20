package ctech.cursoJavaLoiane.aula42;

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        System.out.println(Contantes.URL_API_BOOKS);
        System.out.println(Contantes.URL_API_USERS);

        final int TOTAL = 1;
        //Mudar o valor irá gerar erros
        TOTAL = TOTAL = 1;
        System.out.println(TOTAL);

    }
}
