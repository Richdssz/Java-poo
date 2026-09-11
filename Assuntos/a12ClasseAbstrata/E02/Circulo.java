package Assuntos.a12ClasseAbstrata.E02;

public class Circulo extends FormaGeometrica {
    private double raio; 
    private static final double PI = 3.14;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public void setRaio(double raio) {
        if (raio >= 0) {
            this.raio = raio;
        }

    }

    public double getRaio() {
        return this.raio;
    }

    @Override
    public double area() {
        return PI * Math.pow(this.raio, 2);
        //retorna a área
    }

    @Override
    public double comprimento() {
        return 2 * PI * this.raio;
        //retorna o comprimento
    }
}