package ctech.cursoJavaLoiane.aula33;

public class TesteCalculadora {

    public static void main(String[] args) {

        MinhaCalculadora calc = new MinhaCalculadora();

        int[] numArr = new int[5];
        numArr[0] = 4;
        numArr[1] = 6;
        numArr[2] = 7;
        numArr[3] = 8;
        numArr[4] = 3;

        int result1 = calc.soma(2, 3);
        double result2 = calc.soma(2.5, 2.4);
        int result3 = calc.soma(5, 5, 2);
        int result4 = calc.soma(numArr);

        System.out.println(result4);
    }
}
