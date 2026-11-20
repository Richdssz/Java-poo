package ListasDeAtividades.Lista04.Q5;

public class Computador implements Ligavel, Conectavel {
    @Override
    public void ligar() {
        System.out.println("Pc on");
    }

    @Override
    public void desligar() {
        System.out.println("Pc off");
    }

    @Override
    public void conectarInternet() {
        System.out.println("Conectando...");
    }
}
