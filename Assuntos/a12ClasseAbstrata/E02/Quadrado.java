package Assuntos.a12ClasseAbstrata.E02;

public class Quadrado extends FormaGeometrica {
    private double lado;

    public Quadrado(double lado) {
        setLado(lado);
    }

    public void setLado(double lado) {
        if (lado >= 0) {
            this.lado = lado;
        }
    }

    public double getLado() {
        return this.lado;
    }

    @Override
    public double area() {
        return (this.lado * this.lado);

    }

    @Override
    public double comprimento() {
        return (4 * this.lado);
    }
}
