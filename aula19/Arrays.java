package ctech.cursoJavaLoiane.aula19;

public class Arrays {

	public static void main(String[] args) {
		double temp001 = 30.0;
		double temp002 = 31.0;
		double temp003 = 32.0;
		double temp004 = 33.0;

		double[] temperaturas = new double[365];
		temperaturas[0] = 30.0;
		temperaturas[1] = 31.0;
		temperaturas[2] = 32.0;
		temperaturas[3] = 33.0;
		temperaturas[4] = 34.0;

//		System.out.println("A temperatura do dia 3 é: " + temperaturas[2]);

//		System.out.println("O tamanho do array é de " + temperaturas.length + " posições.");

		// Assim irá mostrar apenas a hash que foi reservado no espaço de memoria.
		//System.out.println(temperaturas);

//		for (int i = 0; i < temperaturas.length; i++){
//			System.out.println("Temperatura do dia " + (i + 1) + " " + temperaturas[i]);
//		}

		for (double temp : temperaturas){
			System.out.println(temp);
		}
	}

}
