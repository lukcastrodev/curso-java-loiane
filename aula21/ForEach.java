package ctech.cursoJavaLoiane.aula21;

import java.util.Random;

public class ForEach {

    public static void main(String[] args) {
        int[] notas = new int[10];

        Random random = new Random();

        for (int i = 0; i < notas.length; i++) {
            notas[i] = random.nextInt(10);
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        System.out.println("Utilizando ForEach: ");
        // geralmente se usa para saída dos dados.
        for (int nota : notas){
            System.out.println(nota);
        }

        // Exemplo 2
        double[][] notasAlunos = new double[30][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 5;
        notasAlunos[0][2] = 8;
        notasAlunos[0][3] = 4;

        notasAlunos[1][0] = 8;
        notasAlunos[1][1] = 7;
        notasAlunos[1][2] = 9;
        notasAlunos[1][3] = 10;

        notasAlunos[2][0] = 6;
        notasAlunos[2][1] = 6.5;
        notasAlunos[2][2] = 4;
        notasAlunos[2][3] = 4;

        System.out.println("ForEach em multidimensionais");
        for (double[] notaAluno : notasAlunos){
            for (double nota : notaAluno) {
                System.out.print(nota + " ");
            }
            System.out.println();
        }
    }
}
