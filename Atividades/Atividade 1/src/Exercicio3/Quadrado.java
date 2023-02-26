package Exercicio3;

public class Quadrado extends FormaGeometrica{

    private Double Lado;
    @Override
    public void calcularArea() {
        System.out.println(Math.pow(Lado, 2));
    }
}
