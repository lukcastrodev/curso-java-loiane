package ctech.cursoJavaLoiane.aula20;

public class Matrizes {

    public static void main (String[] args){
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

        System.out.println(notasAlunos[1][0]);

    }
}
