package ListasDeAtividades.Lista04.Q2;

public class Retangulo extends FormaGeometrica{
    private double base;
    private double altura;

    public Retangulo(double b, double a){
        setAltura(a);
        setBase(b);
    }

    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
