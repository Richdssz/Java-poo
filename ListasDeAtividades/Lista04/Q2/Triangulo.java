package ListasDeAtividades.Lista04.Q2;

public class Triangulo extends FormaGeometrica{
    private double base;
    private double altura;

    public Triangulo(double b, double a){
        setBase(b);
        setAltura(a);
    }
    @Override
    public double calcularArea(){
        return (getBase() * getAltura()) / 2;

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
