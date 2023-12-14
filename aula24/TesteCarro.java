package ctech.cursoJavaLoiane.aula24;

public class TesteCarro {

    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        Carro fuska = new Carro();
        fuska.marca = "Volkswagen";
        fuska.modelo = "Fuska";
        fuska.numPassageiros = 4;
        fuska.capCombustivel = 100;
        fuska.consumoCombustivel = 0.2;

        System.out.println(fuska.marca);
        System.out.println(fuska.modelo);
    }
}
