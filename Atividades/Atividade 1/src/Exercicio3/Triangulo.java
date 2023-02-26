package Exercicio3;

public class Triangulo extends FormaGeometrica {

    private Double Base;
    private Double Altura;
    @Override
    public void calcularArea() {
        System.out.println((this.Base * this.Altura) / 2);
    }
}
