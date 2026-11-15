package ListasDeAtividades.Lista04.Q2;

public class Circulo extends FormaGeometrica{
    private double raio;

    @Override 
    public double calcularArea() {
        return( Math.PI * (raio * raio));
    }

    public Circulo(double r){
        setRaio(r);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
