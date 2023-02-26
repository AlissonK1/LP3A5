package Exercicio3;

public class Círculo extends FormaGeometrica{

    private Double Raio;
    @Override
    public void calcularArea() {
        System.out.println(2 * 3.14 * Math.pow(this.Raio, 2));
    }
}
