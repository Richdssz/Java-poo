package ListasDeAtividades.Lista04.Q2;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> lista = new ArrayList<>();
        FormaGeometrica circulo = new Circulo(10);
        FormaGeometrica retangulo = new Retangulo(10,20);
        FormaGeometrica triangulo = new Triangulo(10,20);
        lista.add(circulo);
        lista.add(retangulo);
        lista.add(triangulo);
        for(FormaGeometrica formaGeometrica : lista){
            System.out.printf("Área: %.2f%n " , formaGeometrica.calcularArea());
        }
    }
}
