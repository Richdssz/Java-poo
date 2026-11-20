package ListasDeAtividades.Lista04.Q5;

public class Roteador implements Ligavel, Conectavel {
    @Override
    public void ligar() {
        System.out.println("Wifi on");
    }

    @Override
    public void desligar() {
        System.out.println("Wifi off");
    }

    @Override
    public void conectarInternet() {
        System.out.println("Conectando...");
    }
}
