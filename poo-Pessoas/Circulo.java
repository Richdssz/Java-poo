package pooPessoas;

public class Circulo {
    double r;
    double pi = 3.14;

    public Circulo(int r) {
        this.r = r;
    }

    public void Area() {
        System.out.printf("na área é %2f%n" + pi * (r * r));
        System.out.println("3.14 foi utilizado como pi");
    }

    public void comprimento() {
        System.out.println("o comprimento é " + 2 * pi * r);
        System.out.println("3.14 foi utilizado como pi");
    }
}
