package Assuntos.a12ClasseAbstrata.E02;

public class Main{
    public static void main(String[] args) {
        FormaGeometrica c = new Circulo(22);
        FormaGeometrica q = new Quadrado(10);

        System.out.println(c.area());
        System.out.println(q.area());
    }
}